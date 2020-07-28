package epam.com.Lambda_Streams;

import java.util.Scanner;
import java.util.ArrayList;

public class List_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int ele = sc.nextInt();
			list.add(ele);
		}
		System.out.println("The average of the list is :");
		double avg = averageCal(list);
		System.out.println(avg);
	}

	private static double averageCal(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		double avg = 0.0;
		avg = list.stream().mapToDouble(i -> i).average().getAsDouble();
		return avg;
	}

}