import numpy as np
import pandas
import mysql.connector


df = pandas.read_csv('x_factsales.csv', sep=';')

# df = df.fillna("NULL")
df = df.fillna(np.nan).replace([np.nan], [None])


def replace_comma(data: str) -> str:
    return data.replace(',', '.')


# df['discountPercentage'] = df['discountPercentage'].apply(replace_comma)
df['discounts'] = df['discounts'].apply(replace_comma)
df['taxes'] = df['taxes'].apply(replace_comma)
df['unitPrice'] = df['unitPrice'].apply(replace_comma)
print(df.head())

# df[df['dateKey'] == 0] = 1
df['dateKey'] = df['dateKey'].replace(0, 1)


list_df = df.values.tolist()

for _ in range(5):
    print(list_df[_])

cnx = mysql.connector.connect(user='root', database='adventureworks_dw')
cursor = cnx.cursor()

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
