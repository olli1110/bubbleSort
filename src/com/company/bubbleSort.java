package com.company;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
	int[] array = {28, 42 , 39, 26, 20 ,18};
    int smaller, bigger;
    boolean swap =true;

    for(int i = 0; i < array.length && swap; i++){
        swap = false;

        for(int y = 0; y < array.length-1; y++){
            if(array[y] > array[y + 1]){
                bigger = array[y];
                smaller = array[y + 1];
                array[y] = smaller;
                array[y + 1] = bigger;
                swap = true;
            }
        }
    }
        System.out.println(Arrays.toString(array));
    }
}
