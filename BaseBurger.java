public class BaseBurger {
    private String roll;
    private String meat;
    private String name;
    public double basePrice;
    private boolean lettuce; // boolean statements are customer options.
    private boolean tomato;
    private boolean carrots;

    public BaseBurger(String roll, String meat, double basePrice) {
        this.roll = roll;
        this.meat = meat;
        this.basePrice = basePrice;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setLettuce(boolean lettuce){
        this.lettuce = lettuce;
        double lettuceCost = 1.00;
        if(lettuce){
            this.basePrice+=lettuceCost;
        }else{
            this.basePrice = basePrice;
        }
    }
    public void setTomato(boolean tomato) {
        this.tomato = tomato;
        double tomatoCost = 1.00;
        if(tomato){
            this.basePrice +=tomatoCost;
        }else{
            this.basePrice = basePrice;
        }
    }
    public void setCarrots(boolean carrots) {
        this.carrots = carrots;
        double carrotCost = 1.00;
        if(carrots){
            this.basePrice +=carrotCost;
        }else{
            this.basePrice = basePrice;
        }
    }
    public double getBasePrice() {
        return basePrice;
    }
}


    // Create Constructor.
//Create Getters & Setters for Base Class
//Create Validation within Setters or Constructor
/// Create Pricing Methods for: basePrice and finalPrice.

