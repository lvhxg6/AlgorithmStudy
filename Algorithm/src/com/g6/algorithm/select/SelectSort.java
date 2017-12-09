package com.g6.algorithm.select;

import com.g6.algorithm.utils.SortHelper;

/**
 * Created by huixiaolv on 09/12/2017.
 */
public class SelectSort {

    /**
     * 选择排序
     * 说明：两次循环
     *      第一次循环：将i 和 j 的位置交换完成[0,i]的排序
     *      第二次循环：寻找[i,n)区间最小值的索引j
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array){
        int len = array.length;
        for(int i=0;i<len;i++){
            // 寻找[i, n)区间里的最小值
            int minIndex = i;
            for(int j=i+1;j<len;j++){
                if(array[j]<array[minIndex])
                    minIndex=j;
            }
            int swap = array[i];
            array[i]=array[minIndex];
            array[minIndex]=swap;
        }
        return array;
    }

    public static void main(String[] args){
        int len = 100;
        int[] ints1 = SortHelper.generateRandomArray(len, 0, len);
        int[] ints = selectionSort(ints1);
        SortHelper.printArray(ints);
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        int[] ints2 = selectionSort(array);
        SortHelper.printArray(ints2);
    }
}
