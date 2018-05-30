package sr;

public class ASCII {
	
	/*
	 * 结果
	 * 0-48	9-57	a-97	z-122	A-65	Z-90
	 * 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
	 */
	public static void main(String[] args) {
		System.out.println("0-" + (int)'0' + "\t" + "9-" + (int)'9' + "\t" + "a-" + (int)'a' + "\t" + "z-" + (int)'z' + "\t" + "A-" + (int)'A' + "\t" + "Z-" + (int)'Z');
		System.out.println(azString());
	}
	
	public static String azString() {
		String str = "";
		for(int i = 48;i <= 122;i++) {
			str += (char)i;
			if(i == 57) i = 64;
			if(i == 90) i = 96;
		}
		return str;
	}
}
