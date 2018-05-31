package sr;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FibonacciSequence {
	private static final int NUM = 45;
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		long l1 = System.currentTimeMillis();
		for(int i = 1;i <= NUM;i++) list.add(fs(i));
		long l2 = System.currentTimeMillis();
		System.out.println(list);
		System.out.println("使用递归的方法用时:" + (l2 - l1) + "毫秒");
		long l3 = System.currentTimeMillis();
		int[] arr = fs2(NUM);
		long l4 = System.currentTimeMillis();
		System.out.println(Arrays.toString(arr));
		System.out.println("使用数组的方法用时:" + (l4 - l3) + "毫秒");
	}
	
	// 递归
	public static int fs(int x) {
		if(x == 1 || x == 2) {
			return 1;
		}else {
			return fs(x - 1) + fs(x - 2);
		}
	}
	
	// 数组
	public static int[] fs2(int x) {
		int[] arr = new int[x];
		for(int i = 0;i < arr.length;i++) {
			if(i == 0 || i == 1) {
				arr[i] = 1;
			}else {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		return arr;
	}
}
