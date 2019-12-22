package designpattern.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		MySingleton inst1 = MySingleton.getInstance();
		MySingleton inst2 = MySingleton.getInstance();
		System.out.println(inst1);
		System.out.println(inst2);
	}

}
