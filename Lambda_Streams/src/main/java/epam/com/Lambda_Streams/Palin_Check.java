package epam.com.Lambda_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Palin_Check{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String ele = sc.next();
			list.add(ele);
		}
		System.out.println("Palindrome strings are :");
		List<String> resultList = palindromeStrings(list);
		System.out.println(resultList);

	}

	public static List<String> palindromeStrings(List<String> list) {
		// TODO Auto-generated method stub
		List<String> res = list.stream().filter(str -> str.equals(reverse(str))).collect(Collectors.toList());
		return res;
	}

	public static String reverse(String str) {
		// TODO Auto-generated method stub
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

}