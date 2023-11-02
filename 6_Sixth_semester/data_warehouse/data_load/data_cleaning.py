import numpy as np
import pandas


def replace_comma(data: str) -> float:
    return float(data.replace(',', '.'))


# Special Offer
df = pandas.read_csv('raw_data/specialoffer.csv', sep=';')

df['discountPercentage'] = (df['discountPercentage'].apply(replace_comma))\
                                .astype('float64')
df.to_csv('cleaned_specialoffer.csv', index=False)


# Fact Sales
df = pandas.read_csv('raw_data/factsales.csv', sep=';')
df = df.fillna(np.nan).replace([np.nan], [None])

df['taxes'] = (df['taxes'].apply(replace_comma)).astype('float64')
df['salesAmount'] = df['salesAmount'].astype('float64')
df['unitPrice'] = (df['unitPrice'].apply(replace_comma)).astype('float64')
df['discounts'] = (df['discounts'].apply(replace_comma)).astype('float64')
df['discounts'] = df['discounts'] * df['unitPrice']
df['dateKey'] = df['dateKey'].replace(0, 1)

df.to_csv('cleaned_factsales.csv', index=False)
