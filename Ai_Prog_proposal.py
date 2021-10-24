#!/usr/bin/env python
# coding: utf-8

# In[1]:


print("Hallaisen")


# In[2]:


import numpy as np
import pandas as pd

insurance = pd.read_csv(r"C:\Users\Bruker\Koding2\insurance.csv")

insurance.head(10)


# In[4]:


import seaborn as sbn
import matplotlib.pyplot as plt
get_ipython().run_line_magic('matplotlib', 'inline')

insurance = pd.read_csv(r"C:\Users\Bruker\Koding2\insurance.csv")

insurance.head(10)


# In[6]:


columns = list(pd.read_csv(r"C:\Users\Bruker\Koding2\insurance.csv", nrows=1))
print(columns)


# In[11]:


insurance = pd.read_csv(r"C:\Users\Bruker\Koding2\insurance.csv", usecols = [i for i in range(7)])
insurance.head(10)


# In[12]:


print(insurance.info())


# In[13]:


print(insurance.describe())


# In[14]:


plt.figure(figsize=(16,16))
correlation_matrix = insurance.corr().round(3)
sbn.heatmap(data=correlation_matrix,annot=True)


# In[17]:


plt.figure(figsize=(5, 5))

for i, col in enumerate(['age', 'bmi']):
    plt.subplot(1, len(['age', 'bmi']) , i+1)
    x = insurance[col]
    y = insurance['charges']
    plt.scatter(x, y, marker='o')
    plt.title(col)
    plt.xlabel(col)
    plt.ylabel('charges')


# In[ ]:




