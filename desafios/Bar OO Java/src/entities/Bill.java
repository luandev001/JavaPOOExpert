package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		double beer = 5.00;
		double barbecue = 7.00;
		double softDrink = 3.00;
		return (this.beer * beer) + (this.barbecue * barbecue) + (this.softDrink * softDrink );
	}
	
	public double cover() {
		return 4.00;
	}
	
	public double ticket() {
		
		double price = 0;
		if (this.gender == 'F') {
			price = 8.00;
		}
		else if(this.gender == 'M'){
			price = 10.00;
		}
		
		return price;
	}
	
	public double total() { 
		if(feeding() > 30) {
			return feeding() + ticket();
		} else {
			return feeding() + cover() + ticket(); 
		}
	}
}
