package burger_shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    private Meal meal;

    public Order() {
        this.meal = new Meal(null, null, null);
    }
    public Order(Meal meal) {
        this.meal = meal;
    }

    public Order(Burger burger, String breadRollType, String meatType) {
        if (burger instanceof HealthyBurger) {
            this.meal = new Meal(new HealthyBurger(breadRollType, meatType), null, null);
        } else if (burger instanceof DeluxeBurger) {
            this.meal = new Meal(new DeluxeBurger(breadRollType, meatType), null, null);
        } else {
            this.meal = new Meal(new Burger(breadRollType, meatType), null, null);
        }
    }

    public Order(Meal.Combo combo) {
        if (combo.name().equals("healthy")) {
            this.meal = new Meal(new HealthyBurger(Bread.WHEAT, Meat.BLACK_BEAN), null, null);
        } else if (combo.name().equals("deluxe")) {
            this.meal = new Meal(new DeluxeBurger(Bread.WHITE, Meat.BEEF), null, null);
        } else {
            this.meal = new Meal(new Burger(), null, null);
        }
    }

    protected void addToppings(String topping1) {
        this.meal.getBurger().addToppings1(topping1);
    }

    protected void addToppings(String topping1, String topping2) {
        this.addToppings(topping1);
        this.meal.getBurger().addToppings2(topping2);
    }

    protected void addToppings(String topping1, String topping2, String topping3) {
        Burger burger = this.meal.getBurger();

        this.addToppings(topping1, topping2);

        if (burger instanceof HealthyBurger) {
            ((HealthyBurger) burger).addToppings3(topping3);
        } else if (burger instanceof DeluxeBurger) {
            ((DeluxeBurger) burger).addTopping(topping3);
        }
    }

    protected void addToppings(String topping1, String topping2, String topping3, String topping4) {
        Burger burger = this.meal.getBurger();

        this.addToppings(topping1, topping2, topping3);

        if (burger instanceof HealthyBurger) {
            ((HealthyBurger) burger).addToppings4(topping4);
        } else if (burger instanceof DeluxeBurger) {
            ((DeluxeBurger) burger).addTopping(topping4);
        }
    }

    protected void addToppings(String topping1, String topping2, String topping3, String topping4, String topping5) {
        Burger burger = this.meal.getBurger();

        this.addToppings(topping1, topping2, topping3, topping4);

        if (burger instanceof DeluxeBurger) {
            ((DeluxeBurger) burger).addTopping(topping5);
        }
    }

    protected void addToppings(String topping1, String topping2, String topping3, String topping4, String topping5, String topping6) {
        Burger burger = this.meal.getBurger();

        this.addToppings(topping1, topping2, topping3, topping4, topping5);

        if (burger instanceof DeluxeBurger) {
            ((DeluxeBurger) burger).addTopping(topping6);
        }
    }

    protected void addDrink(Meal.Drink drink) {
        this.meal.setDrink(drink);
    }

    protected void addSides(String side) {
        this.meal.setSides(new ArrayList<>(Arrays.asList(side)));
    }

    protected void addSides(String side1, String side2) {
        this.meal.setSides(new ArrayList<>(Arrays.asList(side1, side2)));
    }

    protected void addSides(String side1, String side2, String side3) {
        this.meal.setSides(new ArrayList<>(Arrays.asList(side1, side2, side3)));
    }

    protected void addBurger(Burger burger) {
        this.meal.setBurger(burger);
    }

    protected void purchaseOrder() {
        Burger burger = this.meal.getBurger();
        double totalOrderPrice = burger.totalBurgerPrice();

        Meal.Drink drink = this.meal.getDrink();
        totalOrderPrice += drink.getPrice();
        System.out.printf("Added drink %s for $%.2f\n", drink.name(), drink.getPrice());
        for (String side : this.meal.getSides()) {
            totalOrderPrice += Side.PRICE;
            System.out.printf("Added side item %s for $%.2f\n", side, Side.PRICE);
        }
        System.out.printf("Final total order price: $%.2f\n", totalOrderPrice);
    }
}
