package sr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("请输入你想要的数值以内的所有质数:");
		System.out.println(pn(new Scanner(System.in).nextInt()));
	}
	
	public static List<Integer> pn(int num) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2;i <= num;i++) {
			boolean flag = true;
			for(int j = 2;j <= i / 2;j++) {
				if(i % j ==0) {
					flag = false;
					break;
				}
			}
			if(flag) list.add(i);
		}
		return list;
	}
}
