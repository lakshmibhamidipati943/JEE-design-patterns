
public class BusinessDelegatePattern {

	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		Client client1=new Client(businessDelegate);
		client1.doTask();
		businessDelegate.setServiceType("JMS");
		Client client2=new Client(businessDelegate);
		client2.doTask();
	}
}
