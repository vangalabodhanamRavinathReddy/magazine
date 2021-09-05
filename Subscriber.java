package magazine;

public class Subscriber {
	private String name;
	private Topic topic = new Topic();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	public void update() {
		System.out.println("Hey " + name + " New article on your favorite topic : " + topic.title);
	}
	
	public void subscribeTopic(Topic t) {
		topic = t;
	}
}