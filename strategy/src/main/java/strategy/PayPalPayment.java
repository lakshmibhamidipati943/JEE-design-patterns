package strategy;

public class PayPalPayment implements PaymentStrategy{

	private String email;
	public PayPalPayment(String email) {
		this.email=email;
	}
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" paid using PayPal by "+email);
	}

}
