package com.amos.strategy;

public class DataSorter {

	// version 1:
	// public static void Sort(int[] array) {
	// for (int i = array.length; i >0; i--) {
	// for(int j=0;j<i-1;j++){
	// Swap(array,j,j+1);
	// }
	// }
	// }
	//
	// private static void Swap(int[] array,int x, int y) {
	// int temp = array[x];
	// if(array[x]>array[y]){
	// array[x] = array[y];
	// array[y] = temp;
	// }
	// }
	//
	// public static void Print(int[] array) {
	// for(int i : array){
	// System.out.print(" "+i);
	// }
	// }

	// version2
//	public static void Sort(Object[] array) {
//		for (int i = array.length; i > 0; i--) {
//			for (int j = 0; j < i - 1; j++) {
//				Swap(array, j, j + 1);
//			}
//		}
//	}
//
//	private static void Swap(Object[] array, int x, int y) {
//		Object temp = array[x];
//		Comparable cpb1 = (Comparable) array[x];
//		Comparable cpb2 = (Comparable) array[y];
//		if(cpb1.Compare(cpb2)>=0)
//		{
//			array[x] = cpb2;
//			array[y] = temp;
//		}			
//	}
//
//	public static void Print(Object[] array) {
//		for (Object obj : array) {
//			System.out.print("  " + obj);
//		}
//	}
	
	
	
	//version 3
	public static void Sort(Object[] array) {
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				Swap(array, j, j + 1);
			}
		}
	}

	private static void Swap(Object[] array, int x, int y) {
		
		Object temp = array[x];
		Comparable cpb1 = (Comparable) array[x];
		Comparable cpb2 = (Comparable) array[y];
		if(cpb1.Compare(cpb2)>=0)
		{
			array[x] = cpb2;
			array[y] = temp;
		}			
	}

	public static void Print(Object[] array) {
		for (Object obj : array) {
			System.out.print("  " + obj);
		}
	}
}
