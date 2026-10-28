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



    // ------------------------------------------------------------
    // TODO 4:
    // Create setters for:
    // - size
    // - isCarbonated
    // - isAlcoholic
    // ------------------------------------------------------------



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



}