public class DeluxeBurger extends BaseBurger{
    private double chips;
    private double drink;

    public DeluxeBurger(String rollType, String meat, double basePrice, double chips, double drink) {
        super("Regular Bun", "beef", 5.01);
        this.chips = chips;
        this.drink = drink;
    }
    public void setChips(double chips) {
        this.chips = chips;
        double chipsCost = 1.50;
        this.basePrice +=chipsCost;
    }
    public void setDrink(double drink) {
        this.drink = drink;
        double drinkCost = 2.00;
        this.basePrice +=drinkCost;
    }
    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }
}
