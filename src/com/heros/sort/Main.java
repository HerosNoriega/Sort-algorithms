package com.heros.sort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelectionSort sort = new SelectionSort();
		Scanner scan = new Scanner(System.in);
		
		
		int[] listOfNumbers = new int[5];
		System.out.println("Enter 5 random integers: ");
		int number;
		for (int i = 0; i < listOfNumbers.length; i++) {
			number = scan.nextInt();
			listOfNumbers[i] = number;
		}
		
		System.out.println("This is the list of number: ");
		for (int i : listOfNumbers) {
			System.out.println(i);
		}
		
		System.out.println("This is the list sorted: ");
		sort.selectionSort(listOfNumbers);
		for (int i : listOfNumbers) {
			System.out.println(i);
		}
	}

}
