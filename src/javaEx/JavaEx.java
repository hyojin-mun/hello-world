package javaEx;

import java.util.Scanner;

public class JavaEx {

//	public static void main(String[] args) {
//		double x;
//		float y;
//		x=12.5; 
//		y=35.2f; //float 형은 실수 뒤에f를 붙여줘야 알아들음
//		System.out.println("x값은 "+x);
//		System.out.println("y값은 "+y);
//		System.out.println("x+y = "+(x+y)); //이진수의 특성상 표현하지 못하는 소수가 존재해 계산 결과가 부정확함
//	}

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("x값 입력: ");
//		int x = scanner.nextInt();
//		System.out.println("x = "+x);
//		//마지막 자릿수 제외 : 10으로 나눈 몫
//		System.out.println("마지막 자릿수 제외 : "+ (x/10));
//		//마지막 자릿수 : 10으로 나눈 나머지
//		System.out.println("마지막 자릿수 : "+(x%10));
//	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("반지름 : ");
		double r =scanner.nextDouble();
		final double PI=3.1416;
		//구의 겉넓이(4*PI*r^2)
		System.out.println("겉넓이 : "+(4*PI*r*r));
		//구의 부피(4/3*PI*r^3)
		System.out.println("부피 : "+(4/3.0*PI*r*r*r));
	}
	
}
