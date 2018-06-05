package sr;

public class LoadingOrder {
	static String a = "父类a";
	public String b = "父类b";
	static {
		a = "父类静态块";
		System.out.println(a);
	}
	{
		b = "父类普通块";
		System.out.println(b);
	}

	public LoadingOrder() {
		System.out.println("父类构造方法a：" + a);
		System.out.println("父类构造方法b：" + b);
	}

	public static void main(String[] args) {

		LoadingOrder f = new Child();
		System.out.println(f.b);
	}
}

class Child extends LoadingOrder {
	static String a = "子类a";
	String b = "子类b";
	static {
		a = "子类静态块";
		System.out.println(a);
	}
	{
		b = "子类普通块";
		System.out.println(a);
	}

	public Child() {
		System.out.println("子类构造方法a：" + a);
		System.out.println("子类构造方法b：" + b);
	}

}