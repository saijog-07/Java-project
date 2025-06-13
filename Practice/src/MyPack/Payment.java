package MyPack;

@FunctionalInterface

public interface Payment {

	double calBill(double amount);
	
	default double DiwaliBonus(double amount) {
		return amount - amount * 5/100;
	}
}
