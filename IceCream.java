public class IceCream extends MenuItem
{
    // ------------------------------------------------------------
    // TODO 1:
    // Add the IceCream-specific fields.
    //
    // IceCream needs:
    // - flavor
    // - scoops
    // - coneType
    //
    // These fields should be private.
    // ------------------------------------------------------------

    private String flavor;
    private int scoops;
    private String coneType;
    // ------------------------------------------------------------
    // TODO 2:
    // Create the full IceCream constructor.
    //
    // The constructor should receive:
    // - name
    // - price
    // - flavor
    // - scoops
    // - coneType
    //
    // Remember:
    // - name and price belong to MenuItem
    // - flavor, scoops, and coneType belong to IceCream
    //
    // Use super(name, price) to call the parent constructor.
    // ------------------------------------------------------------

    public IceCream(String name, double price, String flavor, int scoops, String coneType)
    {
        super(name,price);

        this.flavor = flavor;
        this.scoops = scoops;
        this.coneType = coneType;
    }//ends our constructor

    // ------------------------------------------------------------
    // TODO 3:
    // Create an overloaded constructor.
    //
    // This constructor should receive:
    // - name
    // - price
    // - flavor
    //
    // Choose default values for:
    // - scoops
    // - coneType
    // ------------------------------------------------------------

    public IceCream(String name, double price, String flavor)
    {
        super(name,price);

        this.flavor = flavor;
        this.scoops = 1;
        this.coneType = "Cup";
    }//ends our constructor

    // ------------------------------------------------------------
    // TODO 4:
    // Create getters for:
    // - flavor
    // - scoops
    // - coneType
    // ------------------------------------------------------------

    public String getFlavor(){
        return flavor;
    }//ends our getFlavor

    public int getScoops(){
        return scoops;
    }//ends our getScoops
    public String getConeType(){
        return coneType;
    }//ends coneType

    // ------------------------------------------------------------
    // TODO 5:
    // Create setters for:
    // - flavor
    // - scoops
    // - coneType
    //
    // Optional:
    // Add simple validation so scoops cannot be less than 1.
    // ------------------------------------------------------------

    public void setFlavor(String flavor){
        this.flavor = flavor;

    }//ends our setFlavor

    public void setScoops(int scoops){
        this.scoops = scoops;

    }//ends our setScoops

    public void setConeType(String coneType) {
        this.coneType = coneType;
    }//ends our setConeType

    // ------------------------------------------------------------
    // TODO 6:
    // Override displayItem().
    //
    // The method should display:
    // - Type: Ice Cream
    // - Name
    // - Price
    // - Flavor
    // - Scoops
    // - Cone Type
    //
    // Use getName() and getPrice() to access inherited fields.
    // ------------------------------------------------------------

    @Override
    public void displayItem() {
        System.out.println("Type: Ice Cream");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Cone Type: " + coneType);
    }
}
