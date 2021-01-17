public class HealthyBurger extends BaseBurger{
    private String roll;
    private boolean onions;

    public HealthyBurger( boolean onions) {
        super("Brown Rye", "beef", 5.01);
        this.roll = "Brown Rye Bread";
        this.onions = onions;

    }
   public void setRollType(String roll) {
        this.roll = roll;
  }
    public String getRoll() {
        return roll;
    }
    public void setOnions(boolean onions) {
        this.onions = onions;
       double onionCost = 1.00;
       if (onions) {
          this.basePrice +=onionCost;
       }else{
           this.basePrice = basePrice;
       }
   }
    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

}








//add override Methods to resolve basePrice errors


// Create Constructor.
//Create Getters & Setters for Base Class
//Create Validation within Setters or Constructor
/// Create Pricing Methods for: basePrice and finalPrice.

