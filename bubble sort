//version 1 update 2023-03-14
import java.util.Scanner;
import java.util.Arrays;
//冒泡排序算法 此算法通过每一次将该数组中最大的数移到数组的末尾以此类推第二大的数移动到[arr.length-2]以此类推
//平均时间复杂度为O(n^2) ,最好情况下是O（n） eg （5 1 2 3 4）， 最坏情况是倒序 eg（5 4 3 2 1） 此时时间复杂度为O（n^2)
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组的长度：");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("请输入数组的元素：");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("冒泡排序前的数组：" + Arrays.toString(arr));

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    System.out.println("因为 " + arr[j] + " < " + arr[j + 1] + " ，所以第" + (j + 1) + "个位置和第" + (j + 2) + "个位置交换了位置");
                    System.out.println("当前数组：" + Arrays.toString(arr));
                } else {
                    System.out.println("因为 " + arr[j] + " < || = " + arr[j + 1] + " ，所以第" + (j + 1) + "个位置和第" + (j + 2) + "个位置没有交换位置");
                    System.out.println("当前数组：" + Arrays.toString(arr));
                }
            }
            System.out.printf("第%d轮排序结果：%s\n", i + 1, Arrays.toString(arr));
        }
        System.out.println("冒泡排序后的数组：" + Arrays.toString(arr));
        System.out.println("总共进行了" + count + "次交换");
    }
}
