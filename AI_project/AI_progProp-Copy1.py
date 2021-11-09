#!/usr/bin/env python
# coding: utf-8

# In[3]:


print("Hallaisen")


# In[1]:


import numpy as np
import pandas as pd

insurance = pd.read_csv(r"C:\Users\eberglund\DirectoryForUse\insurance.csv")

insurance.head(10)


# In[2]:


import seaborn as sbn
import matplotlib.pyplot as plt
get_ipython().run_line_magic('matplotlib', 'inline')

insurance = pd.read_csv(r"C:\Users\eberglund\DirectoryForUse\insurance.csv")

insurance.head(10)


# In[3]:


columns = list(pd.read_csv(r"C:\Users\eberglund\DirectoryForUse\insurance.csv", nrows=1))
print(columns)


# In[4]:


insurance = pd.read_csv(r"C:\Users\eberglund\DirectoryForUse\insurance.csv", usecols = [i for i in range(7)])
insurance.head(10)


# In[5]:


print(insurance.info())


# In[6]:


print(insurance.describe())


# In[7]:


plt.figure(figsize=(8,8))
correlation_matrix = insurance.corr().round(3)
sbn.heatmap(data=correlation_matrix,annot=True)


# In[16]:


plt.figure(figsize=(25, 6))

for i, col in enumerate(['bmi']):
    plt.subplot(1, len(['bmi']) , i+1)
    x = insurance[col]
    y = insurance['charges']
    plt.scatter(x, y, marker='o')
    plt.title(col)
    plt.xlabel(col)
    plt.ylabel('charges')


# In[9]:


plt.figure(figsize=(20, 10))

for i, col in enumerate(['age']):
    plt.subplot(1, len(['age']) , i+1)
    x = insurance[col]
    y = insurance['charges']
    plt.scatter(x, y, marker='o')
    plt.title(col)
    plt.xlabel(col)
    plt.ylabel('charges')


# In[11]:


plt.figure(figsize=(5, 5))

for i, col in enumerate(['smoker']):
    plt.subplot(1, len(['smoker']) , i+1)
    x = insurance[col]
    y = insurance['charges']
    plt.scatter(x, y, marker='o')
    plt.title(col)
    plt.xlabel(col)
    plt.ylabel('charges')


# In[ ]:




