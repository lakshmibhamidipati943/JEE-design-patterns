package strategy;

public class StrategyPattern {

	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		cart.setPaymentStrategy(new CreditCardPayment("John Doe","1234-5678-9012-3456"));
		cart.checkout(100);
		cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
		cart.checkout(200);
	}
}
