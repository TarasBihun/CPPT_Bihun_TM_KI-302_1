import sys
import os
import struct

def writeResTxt(fName, result, end):
    with open(fName, 'a') as f:
      f.write(str(result + end))


rows_num = int(input("Enter size of matrix: "))
lst = []
start = " "
filler = input("Enter symbol filler: ")
if len(filler) == 0:
        print("Symbol filler was not entered")
        sys.exit(1)
elif len(filler) == 1: 
    for i in range(rows_num):
         lst.append([])
       
         for j in range(rows_num - i):
            if j==0:
                print(start, end = "")
                writeResTxt("textRes.lab7.txt", start, " ")
                start += "  "
            lst[i].append(ord(filler))
            if (i%2 == 0):
                 print(chr(lst[i][j]), end = " ")
                 writeResTxt("textRes.lab7.txt", chr(lst[i][j]), " ")
            else:
                 print("*", end = " ")
                 writeResTxt("textRes.lab7.txt", "*", " ")
         print()
         writeResTxt("textRes.lab7.txt", "\n", " ")
else:
     print("To many symbols ")
     sys.exit(1)
