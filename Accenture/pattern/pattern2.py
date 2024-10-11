def pattern(n):
    for i in range(n,0,-1):
        print("* "*i)

num=int(input("Enter the number of row:"))
pattern(num)