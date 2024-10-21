
public class InterceptingFilter {

	public static void main(String[] args) {
		Target target=new Target();
		FilterManager filterManager=new FilterManager(target);
		filterManager.addFilter(new AuthenticationFilter());
		filterManager.addFilter(new LoggingFilter());
		Client client=new Client(filterManager);
		client.sendRequest("HOME");
		client.sendRequest("ADMIN");
	}
}
