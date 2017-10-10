package com.yym.aha.algorithms.sort;

/**
 * Created by yaoyimin on 2017/10/10
 */
public class BubbleSort {

	private static int[] array = {1,15,2,45,75,95,23,54,16,85,62};

	public static void main(String[] args){
		int length = array.length;
		for (int i = 1;i < length ; i++){
			for (int j = 0;j< length-i ; j++){
				if (array[j] < array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for (int i = 0 ; i < length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
