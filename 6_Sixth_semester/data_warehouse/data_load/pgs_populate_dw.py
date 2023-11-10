import numpy as np
import pandas
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


df = pandas.read_csv('cleaned_factsales.csv')
df = df.fillna(np.nan).replace([np.nan], [None])

print(len(df))
print(df.head())
print(df.dtypes)

list_df = df.values.tolist()

# query = ('INSERT INTO dimterritory(territorykey,continent,country,region)'
#          'VALUES (%s,%s,%s,%s)')
query = ('INSERT INTO factsales(CurrencyKey,DateKey,ProductKey,SalesReasonKey,SpecialOfferKey,TerritoryKey,productAmount,discounts,taxes,salesAmount,unitPrice)'
         'VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)')

for item in list_df:
    ...
    print(item)
    # cursor.execute(query, item)
    # conn.commit()

cursor.close()
conn.close()
