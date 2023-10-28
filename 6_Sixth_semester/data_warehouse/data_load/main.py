import numpy as np
import pandas
import mysql.connector
from mysql.connector import errorcode


df = pandas.read_csv('fact_sales.csv', sep=';')

# df = df.fillna("NULL")
df = df.fillna(np.nan).replace([np.nan], [None])
print(df.head())


# df[df['dateKey'] == 0] = 1
df['dateKey'] = df['dateKey'].replace(0, 1)


list_df = df.values.tolist()

# for _ in range(5):
#     print(list_df[_])

try:
    cnx = mysql.connector.connect(user='root', database='teste_dw')
    cursor = cnx.cursor()
except errorcode as er:
    print(er)

query = ('INSERT INTO factsales(CurrencyKey,DateKey,ProductKey,SalesReasonKey,SpecialOfferKey,TerritoryKey,productAmount,discounts,taxes,salesAmount,unitPrice)'
         'VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)')

for item in list_df:
    ...
    print(item)
    cursor.execute(query, item)
    cnx.commit()
    
# cursor.executemany(query, list_df)
# cnx.commit()

cursor.close()
cnx.close()
