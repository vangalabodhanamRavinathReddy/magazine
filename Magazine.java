package magazine;

public class Magazine {
	public static void main(String[] args)
	{
		Topic WildLife = new Topic();
		
		Subscriber sub1 = new Subscriber("Allan");
		Subscriber sub2 = new Subscriber("Beth");
		Subscriber sub3 = new Subscriber("Cate");
		
		WildLife.subscribe(sub1);
		WildLife.subscribe(sub2);
		WildLife.subscribe(sub3);
		
		sub1.subscribeTopic(WildLife);
		sub2.subscribeTopic(WildLife);
		sub3.subscribeTopic(WildLife);
		
		WildLife.upload("Ethiopian wolf. The Ethiopian wolf is Africa's most endangered carnivore and the continent's only wolf species.");
	}
}