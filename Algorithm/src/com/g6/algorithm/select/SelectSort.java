package com.g6.algorithm.select;

/**
 * Created by huixiaolv on 09/12/2017.
 */
public class SelectSort {

    public static int[] selectSort(int[] array){
        int len = array.length;
        for(int i=0;i<len;i++){
            int minIndex = i;
            for(int j=i+1;j<len;j++){
                if(array[j]<array[i])
                    minIndex=j;
            }
            int swap = array[i];
            array[i]=array[minIndex];
            array[minIndex]=swap;
        }
        return array;
    }

    public static void main(String[] args){
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        int[] ints = selectSort(array);
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }
}
