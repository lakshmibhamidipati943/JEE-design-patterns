package service_locator;

import javax.naming.NamingException;

public class Client {

	public static void main(String[] args) throws NamingException {
		Service service1=ServiceLocator.getService("Service1");
		service1.execute();
		Service service2=ServiceLocator.getService("Service2");
		service2.execute();
		Service cachedService1=ServiceLocator.getService("Service1");
		cachedService1.execute();
		Service cachedService2=ServiceLocator.getService("Service2");
		cachedService2.execute();
	}
}
