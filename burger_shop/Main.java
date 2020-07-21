package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        /*******************************************************************\
         **************** Main code execution for Exercise 1 ***************

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
        deluxeBurger.totalDeluxeBurgerPrice();

         */


       /*******************************************************************\
        **************** Main code execution for Exercise 2 ***************

        Order order = new Order(Burger.plain, Bread.RYE, Meat.ROAST_BEEF);
        order.addToppings("ketchup", "mustard", "pickles", "onions");
        order.addDrink(Meal.Drink.coke);
        order.addSides(Side.CHIPS, Side.FRIES);
        order.purchaseOrder();

        Order order2 = new Order(Meal.Combo.healthy);
        order2.addDrink(Meal.Drink.dietCoke);
        order2.purchaseOrder();

        Order order3 = new Order();
        order3.addBurger(new DeluxeBurger(Bread.RYE, Meat.STEAK));
        order3.purchaseOrder();

        */

        /*******************************************************************\
         **************** Main code execution for Exercise 3 ***************
         */

        Order order4 = new Order(Burger.plain, Bread.RYE, Meat.ROAST_BEEF);
        order4.addToppings("ketchp", "mustard", "pickles", "onions");
        order4.addDrink(Meal.Drink.coke);
        order4.addSides(Side.CHIPS, Side.FRIES);
        order4.addSides(Side.APPLE_PIE, Side.ICE_CREAM);
        order4.purchaseOrder();

        Order order5 = new Order(Burger.plain,Bread.WHITE, Meat.BEEF);
        order5.addToppings("relish","tomatoes","cheese", "bacon");
        order5.addDrink(Meal.Drink.gatorode);
        order5.addSides(Side.CHIPS, Side.FRIES, Side.ICE_CREAM);
        order5.purchaseOrder();

        Order order6 = new Order(Meal.Combo.healthy);
        order6.addToppings("cheese", "onions", "guacamole", "bacon");
        order6.addToppings("mushrooms");
        order6.addDrink(Meal.Drink.fanta);
        order6.addDrink((Meal.Drink.water));
        order6.addSides("baked potato");
        order6.purchaseOrder();

//        Error displayed for lines below (constructors have private access)
//        Side side = new Side();
//        Meat meat = new Meat();
//        Meal meal = new Meal();
//        Bread bread = new Bread();

    }
}
