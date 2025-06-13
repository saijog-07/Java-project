package MyPack;

@FunctionalInterface

public interface Sim {
	
	void Calling();
	
	default void Message() {
		System.out.println("1 rs per message");
	}

}
