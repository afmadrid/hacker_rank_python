from libraries.common import *

a = [1, 2, 3, 4, 5]
a.sort()

min_sum = sum(a[:len(a) - 1])
max_sum = sum(a[1:])

print(f'{min_sum}, {max_sum}')
