def pattern(n):
    for i in range(1,n+1):
       print(" "*(n-i)+"*"*i)

num=int(input("Enter the number of row:"))
pattern(num)