package com.heros.sort;

public class SelectionSort {
	public int[] selectionSort(int[] list) {
		
		int minValue;
		int minIndex;
		int temp = 0;
		
		for (int i = 0; i < list.length; i++) {
			minValue = list[i];
			minIndex = i;
			for (int j = i; j < list.length; j++) {
				if (list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			
			if (minValue < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}		
		return list;
	}
}