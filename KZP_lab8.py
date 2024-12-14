import os
import struct
import sys
import math

def writeResTxt(fName, result):
    with open(fName, 'w') as f:
      f.write(str(result))

def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
             with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))

def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
             raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def calculate(x):
     return math.tan(x)
if __name__ == "__main__":
    degrees_data = (math.pi / 180) * float(input("Enter data in degrees: "))
    result = calculate(degrees_data)
    print(f"Result calculated is: {result}")
    try:
        writeResTxt("textRes.lab8.txt", result)
        print("Result text is: {0}".format(readResTxt("textRes.lab8.txt")))

        writeResBin("binRes.lab8.bin", result)
        print("Result bin is: {0}".format(readResBin("binRes.lab8.bin")))
      
    except FileNotFoundError as e:
        print (e)
        sys.exit(1)
