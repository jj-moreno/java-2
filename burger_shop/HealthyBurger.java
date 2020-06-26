package burger_shop;

public class HealthyBurger extends Burger {
    private String toppings3;
    private String toppings4;
    private String[] disAllowedToppings = {"cheese", "bacon", "pepperoni"};

    public HealthyBurger(String breadRollType, String meat) {
        super(breadRollType, meat);
    }

    private boolean isValidHealthyTopping(String topping) {
        for (String disAllowedTopping : disAllowedToppings) {
            if (topping.equals(disAllowedTopping)) {
                return false;
            }
        }
        return true;
    }

    private void printAddHealthyToppingError(String topping) {
        System.out.println("Error! Topping " + topping + " not available for this burger");
    }

    public void addToppings3(String topping) {
        topping = topping.toLowerCase();
        if (isValidHealthyTopping(topping)) {
            this.toppings3 = topping;
            Burger.printAddToppingMsg(this.toppings3);
        } else {
            this.printAddHealthyToppingError(topping);
        }
    }

    public void addToppings4(String topping) {
        topping = topping.toLowerCase();
        if (isValidHealthyTopping(topping)) {
            this.toppings4 = topping;
            Burger.printAddToppingMsg(this.toppings4);
        } else {
            this.printAddHealthyToppingError(topping);
        }
    }

    @Override
    public void totalBurgerPrice() {
        double totalHealthyBurgerPrice = super.getPlainBurgerPrice();

        if (super.getToppings1() != null) {
            totalHealthyBurgerPrice += Burger.getToppingPrice(super.getToppings1());
        }

        if (super.getToppings2() != null) {
            totalHealthyBurgerPrice += Burger.getToppingPrice(super.getToppings2());
        }

        if (this.toppings3 != null) {
            totalHealthyBurgerPrice += Burger.getToppingPrice(this.toppings3);
        }

        if (this.toppings4 != null) {
            totalHealthyBurgerPrice += Burger.getToppingPrice(this.toppings4);
        }

        System.out.printf("Total Healthy Burger price is $%.2f\n", totalHealthyBurgerPrice);
    }
}
