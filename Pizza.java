public class Pizza extends MenuItem
{
    // ------------------------------------------------------------
    // TODO 1:
    // Add the Pizza-specific fields.
    //
    // Pizza needs:
    // - size
    // - crustType
    // - toppings
    //
    // These fields should be private.
    // ------------------------------------------------------------

    private String size;
    private String crustType;
    private String toppings;




    // ------------------------------------------------------------
    // TODO 2:
    // Create the full Pizza constructor.
    //
    // The constructor should receive:
    // - name
    // - price
    // - size
    // - crustType
    // - toppings
    //
    // Remember:
    // - name and price belong to MenuItem
    // - size, crustType, and toppings belong to Pizza
    //
    // Use super(name, price) to call the parent constructor.
    // ------------------------------------------------------------

    public Pizza(String name, double price, String size, String crustType, String toppings)
    {
        super(name,price);

        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
    }//ends our Pizza constructor


    // ------------------------------------------------------------
    // TODO 3:
    // Create getters for:
    // - size
    // - crustType
    // - toppings
    // ------------------------------------------------------------



    // ------------------------------------------------------------
    // TODO 4:
    // Create setters for:
    // - size
    // - crustType
    // - toppings
    // ------------------------------------------------------------



    // ------------------------------------------------------------
    // TODO 5:
    // Override displayItem().
    //
    // The method should display:
    // - Type: Pizza
    // - Name
    // - Price
    // - Size
    // - Crust Type
    // - Toppings
    //
    // Use getName() and getPrice() to access inherited fields.
    // ------------------------------------------------------------



}