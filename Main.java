public class Main {
    public static void main(String[] args) {

         BaseBurger b1 = new BaseBurger("Regular Roll", "beef", 5.01);b1.setName("Regular Burger");
         b1.setTomato(true);
         b1.setCarrots(true);
         b1.setTomato(true);
         b1.getBasePrice();
         System.out.println("Your " + b1.getName() + " will Cost $" + b1.getBasePrice());
         System.out.println();

         HealthyBurger h1 = new HealthyBurger(true);
         h1.setName("Healthy Burger");
         h1.setCarrots(true);
         h1.setLettuce(true);
         h1.setTomato(true);
         h1.setOnions(true);
         System.out.println("Your " + h1.getName() + " will Cost $" + h1.getBasePrice());
         System.out.println();

        DeluxeBurger d1 = new DeluxeBurger("Regular Roll", "Beef", 5.01, 1.50, 2.00);
        d1.setName("Deluxe Burger");
        d1.setTomato(true);
        d1.setLettuce(true);
        d1.setLettuce(true);
        d1.setDrink(2.00);
        d1.setChips(1.50);
        d1.getBasePrice();
        System.out.println("Your " + d1.getName() + " will Cost $" + d1.getBasePrice());

    }
}
