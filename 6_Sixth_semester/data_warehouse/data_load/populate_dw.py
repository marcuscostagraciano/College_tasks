import numpy as np
import pandas
import mysql.connector


cursor_config = {
    'user': 'root',
    'database': 'teste_dw',
}


cnx = mysql.connector.connect(**cursor_config)
cursor = cnx.cursor()


df = pandas.read_csv('cleaned_factsales.csv')

print(df.head())
print(df.dtypes)

list_df = df.values.tolist()


# query = ('INSERT INTO factsales(CurrencyKey,DateKey,ProductKey,SalesReasonKey,SpecialOfferKey,TerritoryKey,productAmount,discounts,taxes,salesAmount,unitPrice)'
#          'VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)')

for item in list_df:
    ...
    # print(item)
    # cursor.execute(query, item)
    # cnx.commit()

# cursor.executemany(query, list_df)
# cnx.commit()

# cursor.close()
# cnx.close()
