import psycopg2


connection_config = {
    'database': 'adventureworks_dw',
    'user': 'aluno',
    'password': 'aluno',
    'host': '127.0.0.1',
    'port': 5432,
}

conn = psycopg2.connect(**connection_config)
cursor = conn.cursor()

query = ("""
         DROP TABLE IF EXISTS factsales;
         CREATE TABLE factsales(
            CurrencyKey INT NULL DEFAULT NULL,
            DateKey INT NULL DEFAULT NULL,
            ProductKey INT NULL DEFAULT NULL,
            SalesReasonKey INT NULL DEFAULT NULL,
            SpecialOfferKey INT NULL DEFAULT NULL,
            TerritoryKey INT NULL DEFAULT NULL,
            productAmount INT NULL DEFAULT NULL,
            discounts DECIMAL(10,4) NULL DEFAULT NULL,
            taxes DECIMAL(10,4) NULL DEFAULT NULL,
            salesAmount INT NULL DEFAULT NULL,
            unitPrice DECIMAL(10,4) NULL DEFAULT NULL,
            CONSTRAINT fk_FactSales_dimCurrency1
                FOREIGN KEY (CurrencyKey)
                REFERENCES dimcurrency (CurrencyKey),
            CONSTRAINT fk_FactSales_dimDate1
                FOREIGN KEY (DateKey)
                REFERENCES dimdate (DateKey),
            CONSTRAINT fk_FactSales_dimProduct1
                FOREIGN KEY (ProductKey)
                REFERENCES dimproduct (ProductKey),
            CONSTRAINT fk_FactSales_dimSalesReason1
                FOREIGN KEY (SalesReasonKey)
                REFERENCES dimsalesreason (SalesReasonKey),
            CONSTRAINT fk_FactSales_dimSpecialOffer1
                FOREIGN KEY (SpecialOfferKey)
                REFERENCES dimspecialoffer (SpecialOfferKey),
            CONSTRAINT fk_FactSales_dimTerritory
                FOREIGN KEY (TerritoryKey)
                REFERENCES dimterritory (TerritoryKey));
         """)

cursor.execute(query)
conn.commit()

cursor.close()
conn.close()
