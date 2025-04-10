
public class Main
{
	public static void main(String[] args) {
	    Offering offering1 = new Coffee();
	    offering1 = new Rum(offering1);
	    offering1 = new Rum(offering1);
	    System.out.println(offering1.getName() +" ::"+ offering1.getPrice());
	    
	    Offering offering2 = new Icecream();
	    offering2 = new Rum(offering2);
	    offering2 = new Gin(offering2);
	    System.out.println(offering2.getName() +" ::"+ offering2.getPrice());
	    
	    
	}
}
