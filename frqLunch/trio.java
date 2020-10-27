public class trio implements frqLunch{
	
    private sandwhich Sandwich;
    private salad Salad;
    private drink Drink;
    
    public trio(sandwhich Sandwhich, salad Salad, drink Drink){
        this.Sandwich = Sandwhich;
        this.Salad = Salad;
        this.Drink = Drink;
    }//end 3 arg

    public String getName(){
        return Sandwich.getName() + ", " + Salad.getName() + ", " + Drink.getName() + " Trio";
    }//end getter

    public double getPrice(){
        frqLunch cheapest = Sandwich;
        if(Salad.getPrice() < cheapest.getPrice()) {
            cheapest = Salad;
        }//end if
        if(Drink.getPrice() < cheapest.getPrice()) {
            cheapest = Drink;
        }//end if
        return Sandwich.getPrice() + Salad.getPrice() + Drink.getPrice() - cheapest.getPrice();
    }//end getter
    
    public String toString() {
    	String output = "";
    	output += getName() + "\n" + getPrice();
    	return output;
    }//end toString
    
}//end class