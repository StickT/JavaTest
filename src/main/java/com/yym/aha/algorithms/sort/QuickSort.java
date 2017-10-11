package com.yym.aha.algorithms.sort;

/**
 * Created by yaoyimin on 2017/10/10
 */
public class QuickSort {

	private static int[] array = {1,15,2,45,75,95,23,54,16,85,62};

	public static void main(String[] args){
		quickSort(0,array.length-1);
		for (int i = 0 ;i<array.length;i++){
			System.out.print(array[i]+"  ");
		}

	}

	private static void quickSort(int left,int right){
		int i,j,t,temp;
		if (left > right)
			return;
		i=left;
		j=right;
		temp = array[left];
		while (i!=j){
			while (array[j] >= temp && i < j)
				j--;
			while (array[i] <= temp && i < j)
				i++;
			if (i<j){
				t = array[i];
				array[i] = array[j];
				array[j] = t;
			}
			array[left] = array[i];
			array[i] = temp;
			quickSort(left,i-1);
			quickSort(i+1,right);
		}
	}
}
