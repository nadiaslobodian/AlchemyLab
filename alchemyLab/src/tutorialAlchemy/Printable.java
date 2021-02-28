package tutorialAlchemy;

	public interface Printable {

		void print();
		
		default void healthCheck() {
			System.out.println("Hello");
		}
		
	}

