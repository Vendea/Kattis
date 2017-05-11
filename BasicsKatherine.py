from math import *
from random import *

# Create the array
N = 100
RANGE = 30
a = [randint(0, RANGE) for i in range(N)]
print a

# Your work here
def isPrime(n):
    if n == 1 or n == 0:
        return False
    if n == 2:
        return True
    if n%2 == 0:
        return False
    for i in range(3, int(ceil(sqrt(n))), 2):
        if n%i == 0:
            return False
    return True

# Count primes in the array
count = 0
for i in range(N):
    if isPrime(a[i]):
        count += 1
print "There were", count, "primes"


# Your work here
largest = max(a)
numLargest = 0
for i in range(len(a)):
    if a[i] == largest:
        numLargest += 1


# Output the answer
print "The largest number in the array is", largest,
print "and it appears", numLargest, "times"

def getMode(arr):
    checked = {}
    maxnum = 0
    maxtimes = 0
    for i in range(len(arr)):
        check = arr[i]
        if check not in checked:
            checked[check] = 1
        else:
            checked[check] = checked[check] + 1
        if checked[check] > maxtimes:
            maxnum = check
            maxtimes = checked[check]
    return (maxnum, maxtimes)

mode, nummode = getMode(a)

print "The mode of the array is", mode
print "and it appears", nummode, "times"
                
