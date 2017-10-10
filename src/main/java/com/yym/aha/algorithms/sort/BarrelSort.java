package com.yym.aha.algorithms.sort;

/**
 * Created by yaoyimin on 2017/10/10
 */
public class BarrelSort {

	private static int[] array = {1,5,5,666666};

	public static void main(String[] args){
		int length = array.length;
		int maxValue = findMaxInt(array);
		int[] sort = new int[maxValue+1];
		for (int i=0 ; i < length ; i++){
			int index = array[i];
			sort[index] += 1;
		}
		printSortedArray(sort);
	}

	private static int findMaxInt(int[] array){
		int length =  array.length;
		int max = 0;
		for (int i=0 ; i < length ; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	}

	private static void printSortedArray(int[] sort){
		int length = sort.length;
		for (int i = 0 ; i < length ; i++){
			if ( sort[i] == 0){
				continue;
			}
			for (int index = 0 ; index < sort[i]; index++){
				System.out.print(i+"  ");
			}
		}
		System.out.print("\n");
	}
}
