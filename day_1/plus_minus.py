from libraries.common import *

a = get_list_of_random_numbers(10000)

positives = 0
negatives = 0
zeroes = 0

for i in a:
    if i == 0:
        zeroes += 1
    elif i < 0:
        negatives += 1
    else:
        positives += 1

print(f'Positive found: {positives}, {round((positives/len(a)) * 100, 2)} %')
print(f'Negative found: {negatives}, {round((negatives/len(a)) * 100, 2)} %')
print(f'Zeroes found: {zeroes}, {round((zeroes/len(a)) * 100, 2)} %')
