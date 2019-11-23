package hw2;

import java.util.Scanner;

public class Circumference {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Введите радиус окружности:");
		double r = sc.nextDouble(); 
		double l=Math.round((Math.PI*(Math.pow(r, 2))));
		System.out.println("Площадь Треугольника = " +l);
	}
}