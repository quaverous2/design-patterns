package singleton;

public class Main {
	public static void main(String[] args) {
		// Use singleton class
		architecture a = architecture.getArchitecture();
		System.out.println(a.sum(10, 20));
	}
}
