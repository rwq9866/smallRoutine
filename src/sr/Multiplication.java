package sr;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入1或2 来选择你是想用一个for循环还是两个for循环来实现九九乘法表:");
			switch (new Scanner(System.in).nextInt()) {
			case 1:
				multiplication1();
				break;
			case 2:
				multiplication2();
				break;
			default:
				System.out.println("你的输入有误,请重新输入:");
			}
		}
	}
	
	// 一个for循环
	public static void multiplication1() {
		for(int i = 1,j = 1;i <= 9;j++) {
			if(j <= i) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}else {
				i++;
				j = 0;
				System.out.println();
			}
		}
	}
	
	
	// 两个for循环
	public static void multiplication2() {
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
