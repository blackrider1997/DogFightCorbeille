package jpu2016.dogfight.Controller;

public class UserOrder implements IUserOrder {
	private int player;
	private Order order;
	
	
	public UserOrder(int player, Order order)
	{	
		this.player = player ;
		this.order = order ;
		
	}


	public int getPlayer() {
		return player;
	}


	public Order getOrder() {
		return order;
	}
	
		
	
}


