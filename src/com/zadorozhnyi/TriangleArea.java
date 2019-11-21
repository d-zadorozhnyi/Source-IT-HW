package com.zadorozhnyi;

import java.util.Scanner;

public class TriangleArea {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Введите длинну 1 стороны:");
		double a = sc.nextDouble(); 
		System.out.println("Введите длинну 2 стороны:");
		double b = sc.nextDouble();
		System.out.println("Введите длинну 3 стороны:");
		double c = sc.nextDouble();
		double p=((a+b+c)/2);
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
	if (a<c+b && b<a+c && c<a+b) {
		
		System.out.println("Площадь Треугольника = " +s);
		}
		else {
			System.out.println("Такой треугольник не существует, длинна каждой стороны должна быть меньше суммы двух других сторон");
		}
	}
}