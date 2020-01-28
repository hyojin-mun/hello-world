package calender;

import java.util.Scanner;

public class Calender {

	/*
	 * - 월을 입력하면 해당월의 달력을 출력한다. 
	 * - 달력은 모양은 1단계에서 작성한 모양으로 만든다. 
	 * - 1일은 일요일로 정해도 무방 
	 * - (-1)을 입력받기 전까지 반복 입력받는다. 
	 * - 프롬프트를 출력한다.
	 */
	
	private static final int[] MaxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMaxDaysOfMonth(int month){
		return MaxDays[month - 1];
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		String s = scanner.next();
		int month = Integer.parseInt(s);
		System.out.println("    <  "+month + "월 달력  >");
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		int MaxDay= getMaxDaysOfMonth(month);
		for(int i=1;i<=MaxDay ;i++) {
			System.out.printf("%3d",i);
			if (i%7==0) {
				System.out.println();
			}
		}
		scanner.close();
	}
}