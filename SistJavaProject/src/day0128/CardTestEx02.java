package day0128;

public class CardTestEx02 {
	public static void main(String[] args) {
		
	
	// static 접근 테스트
	Card.width=10;
	Card.height=20;
	
	System.out.println(Card.width);
	System.out.println(Card.height);
	
	Card c1=new Card();
	System.out.println(c1.kind); // null
	System.out.println(c1.number); // 0
	
	c1.kind="Heart";
	c1.number=7;
	
	System.out.println(c1.kind);
	System.out.println(c1.number);
	
	Card c2=new Card();
	c2.kind="Spade";
	c2.number=4;
	
	System.out.println(c1.kind+", "+c1.number+", "+Card.height+", "+Card.width);
	System.out.println(c2.kind+", "+c2.number+", "+Card.height+", "+Card.width);
	
	Card.width=50;
	Card.height=80;
	
	System.out.println(c1.kind+", "+c1.number+", "+Card.height+", "+Card.width);
	System.out.println(c2.kind+", "+c2.number+", "+Card.height+", "+Card.width);
	
	
	}
}
