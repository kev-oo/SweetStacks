public class testDriver {

    public static void main(String[] args) {
        //only using this for testing our classes instead of modifying our main SweetStacksDriver

        Pizza pizza1 = new Pizza("Pep", 12.99, "Large", "Pan", "Pep");

            Pizza pizza2 = new Pizza("Supreme", 15.99, "Large", "Pan", "Pep, Mushrooms, Onions");

        pizza1.displayItem();
        pizza2.displayItem();

        Drink drink1 = new Drink("Coke", 3.99,"Small", true, false, 90);
        drink1.displayItem();


        //testing our add-on for ice cream
        IceCream icecream1 = new IceCream("Double Scoop Vanilla Waffle",3.99, "Vanilla", 2, "Waffle");
        // icecream2 uses the overloaded constructorr that sets default for scoops and coneType
        IceCream icecream2 = new IceCream("Manager's Special Chocolate Cup",.99, "Chocolate");


    }//ends our main method/driver


}//ends our testdriver

