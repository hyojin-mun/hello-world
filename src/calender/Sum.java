package calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.print("두 수 입력 : ");
		s1 = scanner.next();
		s2 = scanner.next();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println(s1 + "," + s2);
		System.out.println(a + "+" + b + "=" + (a + b));
		scanner.close();
	}
}
