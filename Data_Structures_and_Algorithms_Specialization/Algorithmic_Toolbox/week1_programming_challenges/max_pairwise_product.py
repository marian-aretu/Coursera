# Uses python3
n = int(input())
a = [int(x) for x in input().split()]
product = 0

"""
# The naive solution
for i in range(n):
	for j in range(i + 1, n):
		product = max(product, a[i] * a[j])
"""


def MaxPairwiseProductFast(n, a):
	index1 = 1
	for i from 2 to n:
		if A[i] > A[index1]:
			index1 = i
	index2 = 1
	
	if index1 = 1:
		index2 = 2
	else:
		index2 = 1
	
	for i from 2 to n:
		if i != index1 and A[i] > A[index2]:
			index2 = i
	return A[index1] * A[index2]

product = MaxPairwiseProductFast(n, a)

print(product)
