public class Drink extends MenuItem
{
    // ------------------------------------------------------------
    // TODO 1:
    // Add the Drink-specific fields.
    //
    // Drink needs:
    // - size
    // - isCarbonated
    // - isAlcoholic
    //
    // These fields should be private.
    // ------------------------------------------------------------

    private String size;
    private boolean isCarbonated;
    private boolean isAlcoholic;
    private int calories;

    // ------------------------------------------------------------
    // TODO 2:
    // Create the full Drink constructor.
    //
    // The constructor should receive:
    // - name
    // - price
    // - size
    // - isCarbonated
    // - isAlcoholic
    //
    // Remember:
    // - name and price belong to MenuItem
    // - size, isCarbonated, and isAlcoholic belong to Drink
    //
    // Use super(name, price) to call the parent constructor.
    // ------------------------------------------------------------

    public Drink(String name, double price, String size, boolean isCarbonated, boolean isAlcoholic, int calories)
    {
        super(name,price);

        this.size = size;
        this.isCarbonated = isCarbonated;
        this.isAlcoholic = isAlcoholic;
        this.calories = calories;
    }//ends our constructor

    // ------------------------------------------------------------
    // TODO 3:
    // Create getters for:
    // - size
    // - isCarbonated
    // - isAlcoholic
    // ------------------------------------------------------------

    public String getSize(){
        return size;
    }//ends our getSize

    public boolean getIsCarbonated(){
        return isCarbonated;
    }//ends our isCarbonated
    public boolean getIsAlcoholic(){
        return isAlcoholic;
    }//ends isAlcoholic

    public int getCalories(){
        return calories;
    }//ends our getCalories

    // ------------------------------------------------------------
    // TODO 4:
    // Create setters for:
    // - size
    // - isCarbonated
    // - isAlcoholic
    // ------------------------------------------------------------

    public void setSize(String size){
        this.size = size;

    }//ends our setSize

    public void setIsCarbonated(boolean isCarbonated){
        this.isCarbonated = isCarbonated;

    }//ends our setIsCarbonated

    public void setIsAlcoholic(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }//ends our setIsAlcoholic

    public void setCalories(int calories) {
        this.calories = calories;
    }//ends our setCalories

// ------------------------------------------------------------
    // TODO 5:
    // Override displayItem().
    //
    // The method should display:
    // - Type: Drink
    // - Name
    // - Price
    // - Size
    // - Carbonated
    // - Alcoholic
    //
    // Use getName() and getPrice() to access inherited fields.
    // ------------------------------------------------------------

    @Override
    public void displayItem()
    {
        System.out.println("Type: Drink");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
        System.out.println("Carbonated: " + isCarbonated);
        System.out.println("Alcoholic: " + isAlcoholic);
        System.out.println("Calories: " + calories);

    }//ends our displayItem

}