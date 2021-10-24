#!/usr/bin/env python
# coding: utf-8

# In[1]:


print("Hallaisen")


# In[6]:


import numpy as np
import pandas as pd

boston = pd.read_csv(r"C:\Users\eberglund\DirectoryForUse\BostonHousing.csv")

boston.head(10)


# In[7]:


import seaborn as sbn
import matplotlib.pyplot as plt
get_ipython().run_line_magic('matplotlib', 'inline')

boston = pd.read_csv(r"C:\Users\eberglund\DirectoryForUse\BostonHousing.csv")

boston.head(10)


# In[3]:


columns = list(pd.read_csv(r"C:\Users\eberglund\DirectoryForUse\BostonHousing.csv", nrows=1))
print(columns)


# In[4]:


boston = pd.read_csv(r"C:\Users\eberglund\DirectoryForUse\BostonHousing.csv", usecols = [i for i in range(14)])
boston.head(10)


# In[5]:


print(boston.info())


# In[9]:


print(boston.describe())


# In[8]:


plt.figure(figsize=(16,16))
correlation_matrix = boston.corr().round(3)
sbn.heatmap(data=correlation_matrix,annot=True)


# In[10]:


plt.figure(figsize=(30, 10))

for i, col in enumerate(['LSTAT', 'RM']):
    plt.subplot(1, len(['LSTAT', 'RM']) , i+1)
    x = boston[col]
    y = boston['MEDV']
    plt.scatter(x, y, marker='o')
    plt.title(col)
    plt.xlabel(col)
    plt.ylabel('MEDV')


# In[ ]:




