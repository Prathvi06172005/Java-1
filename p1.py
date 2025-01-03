import matplotlib.pyplot as plt
day=[1,2,3,4,5,6]
num=[48,12,28,38,20,36]
plt.xlabel('Days',fontsize=20)
plt.ylabel('number of caser',fontsize=20)
plt.title('number  of cases reported',fontsize=20)
plt.scatter(day,num,s=250,color=['g','b','r','m','b','g'])
plt.show()