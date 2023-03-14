# DSAA-java
Data structures and algorithms in java
## bubble sort ##
first design at 2023-02 update in 03

|    input        |      output     |
|-----------------|------------------|
|       5         |                  |
| 请输入数组的元素： | 冒泡排序前的数组：[2, 3, 4, 5, 4] |
|   2 3 4 5 4     | 因为 2 < || = 3 ，所以第1个位置和第2个位置没有交换位置
|                   当前数组：[2, 3, 4, 5, 4]
|                    因为 3 < || = 4 ，所以第2个位置和第3个位置没有交换位置
|                    当前数组：[2, 3, 4, 5, 4]
|                    因为 4 < || = 5 ，所以第3个位置和第4个位置没有交换位置
|                    当前数组：[2, 3, 4, 5, 4]
|                    因为 5 > 4 ，所以第4个位置和第5个位置交换了位置
|                    当前数组：[2, 3, 4, 4, 5]
|                    第1轮排序结果：[2, 3, 4, 4, 5]
|                    因为 2 < || = 3 ，所以第1个位置和第2个位置没有交换位置
|                    当前数组：[2, 3, 4, 4, 5]
|                    因为 3 < || = 4 ，所以第2个位置和第3个位置没有交换位置
|                    当前数组：[2, 3, 4, 4, 5]
|                    因为 4 < || = 4 ，所以第3个位置和第4个位置没有交换位置
|                    当前数组：[2, 3, 4, 4, 5]
|                    第2轮排序结果：[2, 3, 4, 4, 5]
|                     冒泡排序后的数组：[2, 3, 4, 4, 5]
|                     总共进行了1次交换                    |
