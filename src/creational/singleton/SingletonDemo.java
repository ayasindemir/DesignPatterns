package creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		SingletonThread1 t1 = new SingletonThread1();
		t1.run();

		SingletonThread1 t2 = new SingletonThread1();
		t2.run();

		SingletonThread1 t3 = new SingletonThread1();
		t3.run();

		System.out.println("...");

		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.hashCode());

		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.hashCode());

		Singleton s3 = Singleton.getInstance();
		System.out.println(s3.hashCode());

	}

}

class SingletonThread1 implements Runnable {

	@Override
	public void run() {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.hashCode());
	}
}

class SingletonThread2 implements Runnable {

	@Override
	public void run() {
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.hashCode());
	}
}

class SingletonThread3 implements Runnable {

	@Override
	public void run() {
		Singleton s3 = Singleton.getInstance();
		System.out.println(s3.hashCode());
	}
}
