package com.g6.algorithm.utils;

import java.util.Random;

/**
 * Created by huixiaolv on 09/12/2017.
 */
public class SortHelper {

    public static int[] generateRandomArray(int n,int rangeL,int rangeR){
        int[] array = new int[n];
        Random rand = new Random();
        for(int i=0;i<n;i++){
            array[i] = rand.nextInt(rangeR-rangeL+1)+rangeL;
        }
        return array;
    }

    public static void printArray(int[] array){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<array.length;i++){
            sb.append(array[i]).append("  ");
        }
        System.out.println("array-->"+sb.toString());
    }

}
