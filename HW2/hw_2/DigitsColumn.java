package hw_2;

import java.util.Scanner;

public class DigitsColumn {
	
	private static Scanner z;

	public static void main(String[] args) {
		z = new Scanner(System.in);
		System.out.println("Введите 6-значное число:");
		String a = z.next();
		int l =a.length();
		if (l!= 6) {
			System.out.println("Вы ввели неверное число");
		}
		else {
			System.out.println("Ваше число столбиком:");
		
		for (int x=0; x<l; x++)
		System.out.println(a.charAt(x));
		}
	}
}