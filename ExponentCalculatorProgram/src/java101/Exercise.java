package java101;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n , k;
		
		System.out.print(" Üssü alınacak sayıyı giriniz: ");
		n = scan.nextInt();
		System.out.print(" Üs olacak sayıyı giriniz: ");
		k = scan.nextInt();
		
		int total =1;
		
		for(int i =1; i<=k; i++) {
			total *= n;
		}
		
		System.out.print(" Total :" + total);

	}

}
