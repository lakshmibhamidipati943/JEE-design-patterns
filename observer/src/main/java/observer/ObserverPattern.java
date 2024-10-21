package observer;

public class ObserverPattern {

	public static void main(String[] args) {
		NewsPublisher publisher=new NewsPublisher();
		NewsChannel channel1=new NewsChannel("Channel 1");
		NewsChannel channel2=new NewsChannel("Channel 2");
		publisher.attach(channel1);
		publisher.attach(channel2);
		publisher.setNews("Breaking News: New Observer Pattern Implemented !");
		publisher.detach(channel1);
		publisher.setNews("Update: Observer Pattern Example Continued!");
		
	}
}
