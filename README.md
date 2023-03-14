# DSAA-java

Data structures and algorithms in java

## Bubblesort ##

First designed in 2023-02 and updated in 2023-03.

Bubble sort is a simple sorting algorithm that repeatedly swaps adjacent elements if they are in the wrong order. It is commonly taught in computer science courses as an introductory example of a sorting algorithm.

The time complexity of bubble sort is O(n^2) in the worst case scenario, where n is the number of elements in the array. This means that the time required to sort the array grows quadratically with the size of the input.

### Algorithm Description ###

The bubble sort algorithm starts by comparing the first two elements of an array and swapping them if they are in the wrong order. It then moves on to compare the second and third elements, and so on, until the last two elements are compared and swapped if necessary. This process is repeated until no more swaps are needed, indicating that the array is now sorted.

### Example ###
Let's say we have an array of length 5 and the input numbers are: 2, 3, 4, 5, 4. The following shows the step-by-step process of sorting this array using the bubble sort algorithm:

Array length: 5
Please input numbers in array: 2 3 4 5 4
The array before Bubble Sort: [2, 3, 4, 5, 4]

- Since 2 < || = 3, no change is made. Now the array is: [2, 3, 4, 5, 4]
- Since 3 < || = 4, no change is made. Now the array is: [2, 3, 4, 5, 4]
- Since 4 < || = 5, no change is made. Now the array is: [2, 3, 4, 5, 4]
- Since 5 > 4, 4 and 5 are swapped. Now the array is: [2, 3, 4, 4, 5]

The 1st turn result: [2, 3, 4, 4, 5]

- Since 2 < || = 3, no change is made. Now the array is: [2, 3, 4, 4, 5]
- Since 3 < || = 4, no change is made. Now the array is: [2, 3, 4, 4, 5]
- Since 4 < || = 4, no change is made. Now the array is: [2, 3, 4, 4, 5]

The 2nd turn result: [2, 3, 4, 4, 5]

After sorting, the final array is: [2, 3, 4, 4, 5]
There was only 1 change made in this array.


Although Bubble Sort is easy to understand and implement, it is not an efficient sorting algorithm for large datasets. Other sorting algorithms such as QuickSort and MergeSort are usually preferred for practical purposes.

## Quicksort ##
Not Available now
