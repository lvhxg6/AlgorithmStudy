package com.g6.algorithm.insertion;

import com.g6.algorithm.utils.SortHelper;

/**
 * Created by huixiaolv on 10/12/2017.
 */
public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            //寻找arr[i]的合适位置
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int swap = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=swap;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSortTwo(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0&&arr[j]<arr[j-1];j--){
                int swap = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=swap;
            }
        }
        return arr;
    }


    public static void main(String[] args){
        int n = 1000;
        int[] ints = SortHelper.generateRandomArray(n, 0, 1000);
        int[] ints1 = insertionSortTwo(ints);
        SortHelper.printArray(ints1);
    }
}
