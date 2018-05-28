package sr;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("请输入年份:");
		ly(new Scanner(System.in).nextInt());
	}
	
	public static void ly(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "是闰年!");
		}else {
			System.out.println(year + "不是闰年!");
		}
		
	}
}
