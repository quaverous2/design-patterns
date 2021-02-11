package singleton;

// Singleton class

public class architecture {
	// Lazy initialization of my single class instance
	static architecture single_instance = null;
	
	private architecture() {
		
	}
	
	public static architecture getArchitecture() {
		if(single_instance == null) {
			// Create class instance if it does not already exist
			single_instance = new architecture();
		}
		// Return the single class instance
		return single_instance;
	}
	
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
}
