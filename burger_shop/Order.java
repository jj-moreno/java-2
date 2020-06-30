package burger_shop;

public class Order {

    private Burger burger;
    private Meal.Drink drink;
    private String[] sides = new String[3];

    public Order() {
        burger = null;
        drink = null;
    }

    public Order(Burger burger, String breadRollType, String meatType) {
        if (burger instanceof HealthyBurger) {
            this.burger = new HealthyBurger(breadRollType, meatType);
        } else if (burger instanceof DeluxeBurger) {
            this.burger = new DeluxeBurger(breadRollType, meatType);
        } else {
            this.burger = new Burger(breadRollType, meatType);
        }
    }

    public Order(Meal.Combo combo) {
        if (combo.name().equals("healthy")) {
            this.burger = new HealthyBurger(Bread.WHEAT, Meat.BLACK_BEAN);
        } else if (combo.name().equals("deluxe")) {
            this.burger = new DeluxeBurger(Bread.WHITE, Meat.BEEF);
        } else {
            this.burger = new Burger(Bread.WHITE, Meat.BEEF);
        }
    }

    protected void addToppings(String topping1) {
        this.burger.addToppings1(topping1);
    }

    protected void addToppings(String topping1, String topping2) {
        this.addToppings(topping1);
        this.burger.addToppings2(topping2);
    }

    protected void addToppings(String topping1, String topping2, String topping3) {
        Burger burger = this.burger;

        this.addToppings(topping1, topping2);

        if (burger instanceof HealthyBurger) {
            ((HealthyBurger) burger).addToppings3(topping3);
        } else if (burger instanceof DeluxeBurger) {
            ((DeluxeBurger) burger).addTopping(topping3);
        }
    }

    protected void addToppings(String topping1, String topping2, String topping3, String topping4) {
        Burger burger = this.burger;

        this.addToppings(topping1, topping2, topping3);

        if (burger instanceof HealthyBurger) {
            ((HealthyBurger) burger).addToppings4(topping4);
        } else if (burger instanceof DeluxeBurger) {
            ((DeluxeBurger) burger).addTopping(topping4);
        }
    }

    protected void addToppings(String topping1, String topping2, String topping3, String topping4, String topping5) {
        Burger burger = this.burger;

        this.addToppings(topping1, topping2, topping3, topping4);

        if (burger instanceof DeluxeBurger) {
            ((DeluxeBurger) burger).addTopping(topping5);
        }
    }

    protected void addToppings(String topping1, String topping2, String topping3, String topping4, String topping5, String topping6) {
        Burger burger = this.burger;

        this.addToppings(topping1, topping2, topping3, topping4, topping5);

        if (burger instanceof DeluxeBurger) {
            ((DeluxeBurger) burger).addTopping(topping6);
        }
    }

    protected void addDrink(Meal.Drink drink) {
        this.drink = drink;
    }

    protected void addSides(String side) {
        if (Side.sideOptions.contains(side)) {
            String[] sides = this.sides;
            if (sides[0] == null) {
                sides[0] = side;
            } else if (sides[1] == null) {
                sides[1] = side;
            } else if (sides[2] == null) {
                sides[2] = side;
            } else {
                System.out.printf("Could not add side %s. Reached maximum of 3 sides allowed\n", side);
            }
        } else {
            System.out.printf("Error! Side %s not an available side option.\n", side);
        }
    }

    protected void addSides(String side1, String side2) {
        this.addSides(side1);
        this.addSides(side2);
    }

    protected void addSides(String side1, String side2, String side3) {
        this.addSides(side1);
        this.addSides(side2);
        this.addSides(side3);
    }

    protected void addBurger(Burger burger) {
        this.burger = burger;
    }

    protected void purchaseOrder() {
        Burger burger = this.burger;
        double totalOrderPrice = burger.totalBurgerPrice();

        Meal.Drink drink = this.drink;
        if (drink != null) {
            totalOrderPrice += drink.getPrice();
            System.out.printf("Added drink %s for $%.2f\n", drink.name(), drink.getPrice());
        }

        for (String side : this.sides) {
            if (side != null) {
                totalOrderPrice += Side.PRICE;
                System.out.printf("Added side item %s for $%.2f\n", side, Side.PRICE);
            }
        }
        System.out.printf("Final total order price: $%.2f\n\n", totalOrderPrice);
    }
}
