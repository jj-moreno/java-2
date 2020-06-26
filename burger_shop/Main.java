package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Burger burger = new Burger(Bread.WHITE, Meat.BEEF);
        burger.addToppings1("Lettuce");
        burger.addToppings2("Tomatoes");
        burger.totalBurgerPrice();

        HealthyBurger healthyBurger = new HealthyBurger(Bread.WHEAT, Meat.BLACK_BEAN);
        healthyBurger.addToppings1("mushrooms");
        healthyBurger.addToppings2("guacamole");
        healthyBurger.addToppings3("cheese");
        healthyBurger.addToppings4("onions");
        healthyBurger.totalBurgerPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger(Bread.RYE, Meat.CHICKEN);
        deluxeBurger.addTopping("bacon");
        deluxeBurger.addTopping("cheese");
        deluxeBurger.addTopping("mushrums");
        deluxeBurger.totalBurgerPrice();
    }
}
