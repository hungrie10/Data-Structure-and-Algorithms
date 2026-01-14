# Static Array
# a_static = [1, 2, 3, 4, 5]




# # Dynamic Array
a_dynamic = list(range(4))
a_dynamic[0]= 87
a_dynamic[1]= 500
a_dynamic[2]= 90
a_dynamic[3]= 70

def insert_num(arr, pos, val):
    arr.append(0)
    temp = val
    for i in range(pos, len(arr)):
       hold_here = arr[i]
       arr[i] = temp
       temp = hold_here
    print(arr)
    print(temp)
    
def remove_num_one(arr = [], pos = 2):
    new_arr = []
    for i in range(0 ,len(arr)):
         if i != pos:
            new_arr.append(arr[i])
    arr = new_arr
    print(arr)
    
def remove_num_two(arr = [], pos = 2):
    for i in range(pos, len(arr) - 1):
        arr[i] = arr[i + 1]
    arr.pop()
    
    print(arr)
    
def search_num_one(arr = [], num = 2):
    for i in range(len(arr)):
        if arr[i] == num:
            print(f"Found at {i}")
            # return(f"Found at {i}")
    
def search_num_two(arr = [],  num = 2):
    low , high = 0 , len(arr) - 1
    while low <= high:
        mid = high + low // 2
        if arr[mid] == num:
            print("Found at: ", mid )
            break
        elif num < arr[mid]:
            high = mid -1
        elif num > arr[mid]:
            low = mid + 1



    print(arr)

def max_val_in_arr(arr = []):
    a_number = arr[len(arr) - 1]
    for i in range(0 , len(arr)):
        if arr[i] < a_number:
            a_number = arr[i]

    print(a_number)
    return a_number

def add_all_el_in_arr(arr = []):
    sum_of_elements = 0
    for i in range(0,len(arr)):
        sum_of_elements += arr[i]

    print(sum_of_elements)

def sort_an_arr(arr = []):
  
    for i in range(0, len(arr)):
        hold_dis = arr[i]
        for j in range(len(arr) - 1, i, -1):
           if(arr[i] > arr[j]):
               hold_here = arr[j]
               arr[j] =arr[i] 
               arr[i] =hold_here
    
    print(arr)


sort_an_arr(a_dynamic)
# add_all_el_in_arr(a_dynamic)
# max_val_in_arr(a_dynamic)
# search_num_two(a_dynamic, 2)
# remove_num_one(a_dynamic, 2 )
# remove_num_two(a_dynamic, 2 )
