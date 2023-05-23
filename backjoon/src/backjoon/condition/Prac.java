package backjoon.condition;

public class Prac {
	public static void main(String[] args) {
		
		Coffee c = new Coffee();
		c.name = "아메리코너";
		
		c.myCoffee();
	}
}

class Coffee {
	String name;
	int price;
	
	public void myCoffee() {
		System.out.println(name);
	}
}



















