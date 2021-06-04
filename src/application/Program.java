package application;

import java.util.Scanner;

import service.GenericService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//generic para Integer
/*
		GenericService<Integer> gs = new GenericService<>();
	
		System.out.print("How many value? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			gs.addValue(value);
		}
*/
//generic para String
		GenericService<String> gs = new GenericService<>();
	
		System.out.print("How many value? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			gs.addValue(value);
		}

		gs.print();
		String x = gs.first();
		System.out.println("First: " + x);
				
		sc.close();
	}
}