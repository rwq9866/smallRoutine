package sr;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("请输入你想排序的数值个数");
		int num = new Scanner(System.in).nextInt();
		int[] arr = new int[num];
		for(int i = 0;i < arr.length;i++) arr[i] = (int)(Math.random() * 100000);
		arr = bs(arr);
		System.out.println("这个才是我想要的结果:" + Arrays.toString(arr));
	}
	
	public static int[] bs(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j + 1]) {
					int num = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = num;
				}
			}
			System.out.println("第" + (i + 1) + "次排序结果:" + Arrays.toString(arr));
		}
		return arr;
	}
}
