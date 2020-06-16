# 2020.06.16. GeeksforGeeks
# https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0#ExpectOP

case_num = int(input("Input num of cases: "))

# 0th                   1th                     2th
# num_elements          sum_elements            elements
cases = []

for i in range(case_num):
    print("#", i)
    num_element = int(input("Input num of elements: "))
    cases.append(num_element)

    sum_elements = int(input("Input sum of elements: "))
    cases.append(sum_elements)

    print("Input elements")
    elements = input().split(' ')
    cases.append(elements)

print(cases, type(cases))

for i in range(case_num):
    arr = cases[3 * i - 1]

    for idx_1 in arr:
        _sum = 0
        sub_arr = arr[arr.index(idx_1):]

        for idx_2 in sub_arr:
            _sum += idx_2
            if _sum == sum:
                print(arr.index(idx_1) + 1, arr.index(idx_2) + 1)
                break

        if _sum == sum:
            break
pass
