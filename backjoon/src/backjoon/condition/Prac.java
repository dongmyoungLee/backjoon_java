package backjoon.condition;

public class Prac {
	public static void main(String[] args) {
		
		Coffee c = new Coffee();
		c.name = "�Ƹ޸��ڳ�";
		
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



















