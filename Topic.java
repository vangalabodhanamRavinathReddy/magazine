package magazine;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	private List<Subscriber> clients = new ArrayList<>();
	String title;
	
	public void subscribe(Subscriber client) {
		clients.add(client);
	}
	
	public void unSubscribe(Subscriber client) {
		clients.remove(client);
	}
	
	public void notifySubscribers() {
		for(Subscriber client: clients) {
			client.update();
		}
	}
	
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}
}