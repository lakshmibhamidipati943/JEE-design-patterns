package service_locator;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {

	private static Cache cache;
	static {
		cache=new Cache();
	}
	public static Service getService(String jndiName) throws NamingException {
		Service service=cache.getService(jndiName);
		if(service != null) {
			return service;
		}
		InitialContext context=new InitialContext();
		if(jndiName.equalsIgnoreCase("Service1")) {
			service=new Service1();
			cache.addService(service);
		}
		else if(jndiName.equalsIgnoreCase("Service2")) {
			service=new Service2();
			cache.addService(service);
		}
		return service;
	}
}
