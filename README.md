# DSAA-java

Data structures and algorithms in java

## bubble sort ##

First designed in 2023-02 and updated in 2023-03.


Bubblesort is a sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order. It is a simple and commonly taught algorithm, often used as an introductory example in computer science courses.

The algorithm has a time complexity of O(n^2) in the worst case, where n is the number of elements in the array. This means that the time required to sort the array grows quadratically with the size of the input.

Bubblesort starts by comparing the first two elements of an array and swapping them if they are in the wrong order. It then moves on to compare the second and third elements, and so on, until the last two elements are compared and swapped if necessary. This process is then repeated until no more swaps are needed, indicating that the array is now sorted.

While Bubblesort is a simple and easy-to-understand algorithm, it is not efficient for large datasets. It is often used as a teaching tool to introduce students to basic sorting algorithms, but for practical purposes, more efficient sorting algorithms such as QuickSort or MergeSort are preferred.

### An example  ###

Array length: 5

Please input numbers in array:

2 3 4 5 4

The array before Bubblesort: [2, 3, 4, 5, 4]

- Cuz 2 < || = 3, so 1 and 2 do not change place. Now the array is: [2, 3, 4, 5, 4]
- Cuz 3 < || = 4, so 2 and 3 do not change place. Now the array is: [2, 3, 4, 5, 4]
- Cuz 4 < || = 5, so 3 and 4 do not change place. Now the array is: [2, 3, 4, 5, 4]
- Cuz 5 > 4, so 4 and 5 change place. Now the array is: [2, 3, 4, 4, 5]

The 1st turn result: [2, 3, 4, 4, 5]

- Cuz 2 < || = 3, so 1 and 2 do not change place. Now the array is: [2, 3, 4, 4, 5]
- Cuz 3 < || = 4, so 2 and 3 do not change place. Now the array is: [2, 3, 4, 4, 5]
- Cuz 4 < || = 4, so 3 and 4 do not change place. Now the array is: [2, 3, 4, 4, 5]

The 2nd turn result: [2, 3, 4, 4, 5]

After sorting, the array is: [2, 3, 4, 4, 5]

There was only 1 change made in this array.


