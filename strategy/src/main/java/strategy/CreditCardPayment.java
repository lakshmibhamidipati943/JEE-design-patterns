package strategy;

public class CreditCardPayment implements PaymentStrategy{

	private String name;
	private String cardNumber;
	public CreditCardPayment(String name, String cardNumber) {
		this.name=name;
		this.cardNumber=cardNumber;
	}
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" paid using Credit Card by "+name);
	}

}
