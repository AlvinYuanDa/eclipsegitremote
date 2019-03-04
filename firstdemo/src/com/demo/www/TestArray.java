package com.demo.www;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		
		//在数组中添加一个新的数据
		int [] arr1 = new int [] {4,5,6};
		int [] arr2 = new int [arr1.length+1];
		for(int i =0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		arr2[arr2.length-1] = 7;
		/*for (int i : arr2) {
			System.out.print(i + " ");
		}*/
		arr1 = arr2;
		System.out.println(Arrays.toString(arr1));
		
	}
}
