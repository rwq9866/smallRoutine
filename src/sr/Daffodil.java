package sr;

public class Daffodil {
	public static void main(String[] args) {
		daffodil();
	}
	
	public static void daffodil() {
		int a = 1,b = 0,c = 0;
		for (int i = 100; i < 1000; i++) {
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if(a * a * a + b * b * b + c * c * c == i) System.out.println(i);
		}
	}
}
