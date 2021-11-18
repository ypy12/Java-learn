//package insert;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] srcArray = newArr(10);
        // insertionSort(srcArray);
        // insertionSort1(srcArray);
        // shellSort(srcArray);
        heapSort(srcArray);

    }

    public static int[] newArr(int size) {
        Random random = new Random();
        int[] srcArray = new int[size];
        System.out.println(srcArray.length);
        for (int i = 0; i < srcArray.length; i++) {
            srcArray[i] = random.nextInt(100);
        }
        System.out.println("未排序之前" + Arrays.toString(srcArray));
        return srcArray;

    }

    public static void insertionSort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("排序之后" + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; // 取出下一个元素，在已经排序的元素序列中从后向前扫描
            for (int j = i; j >= 0; j--) {
                if (j > 0 && arr[j - 1] > temp) {
                    arr[j] = arr[j - 1]; // 如果该元素（已排序）大于取出的元素temp，将该元素移到下一位置
                    System.out.println("Temping:  " + Arrays.toString(arr));
                } else {
                    // 将新元素插入到该位置后
                    arr[j] = temp;
                    System.out.println("Sorting:  " + Arrays.toString(arr));
                    break;
                }
            }
        }
    }

    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;
        for (; gap > 0; gap /= 2) { // 不断缩小gap，直到1为止
            for (int j = 0; (j + gap) < arr.length; j++) { // 使用当前gap进行组内插入排序
                for (int k = 0; (k + gap) < arr.length; k += gap) {
                    if (arr[k] > arr[k + gap]) {
                        int temp = arr[k + gap]; // 交换操作
                        arr[k + gap] = arr[k];
                        arr[k] = temp;
                        System.out.println("    Sorting:  " + Arrays.toString(arr));
                    }
                }
            }
        }
    }

    public static void heapInsert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentindex = i;
            int fatherindex = (currentindex - 1) / 2;
            while (arr[currentindex] > arr[fatherindex]) {
                swap(arr, currentindex, fatherindex);
                currentindex = fatherindex;
                fatherindex = (currentindex - 1) / 2;
            }

        }

    }

    public static void heapdown(int[] arr, int index, int size) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        while (left < size) {
            int largestIndex;
            // 判断孩子中较大的值的索引（要确保右孩子在size范围之内）
            if (arr[left] < arr[right] && right < size) {
                largestIndex = right;
            } else {
                largestIndex = left;
            }
            // 比较父结点的值与孩子中较大的值，并确定最大值的索引
            if (arr[index] > arr[largestIndex]) {
                largestIndex = index;
            }
            // 如果父结点索引是最大值的索引，那已经是大根堆了，则退出循环
            if (index == largestIndex) {
                break;
            }
            // 父结点不是最大值，与孩子中较大的值交换
            swap(arr, largestIndex, index);
            // 将索引指向孩子中较大的值的索引
            index = largestIndex;
            // 重新计算交换之后的孩子的索引
            left = 2 * index + 1;
            right = 2 * index + 2;
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapSort(int[] arr) {
        // 构造大根堆
        heapInsert(arr);
        int size = arr.length;
        while (size > 1) {
            // 固定最大值
            swap(arr, 0, size - 1);
            size--;
            // 构造大根堆
            heapdown(arr, 0, size);

        }

    }
}