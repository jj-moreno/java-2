package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    private ArrayList<String> deluxeToppingsList;

    public DeluxeBurger(String breadRollType, String meat) {
        super(breadRollType, meat);
        this.deluxeToppingsList = new ArrayList<>(6);
    }

    public DeluxeBurger() {
        super(Bread.WHITE, Meat.BEEF);
    }


    @Override
    public void addToppings1(String topping) {
        super.addToppings1(topping);
        this.deluxeToppingsList.add(topping);
    }

    @Override
    public void addToppings2(String topping) {
        super.addToppings2(topping);
        this.deluxeToppingsList.add(topping);
    }

    public void addTopping(String topping) {
        topping = topping.toLowerCase();

        if (Burger.isValidToppingOffering(topping)) {
            this.deluxeToppingsList.add(topping);
            Burger.printAddToppingMsg(topping);
        } else {
            Burger.printAddToppingError(topping);
        }
    }

    public void totalDeluxeBurgerPrice() {
        double totalDeluxeBurgerPrice = super.getPlainBurgerPrice();
        double deluxeComboDiscount = 0.25;

        for (String topping : deluxeToppingsList) {
            totalDeluxeBurgerPrice += Burger.getToppingPrice(topping);
        }

        totalDeluxeBurgerPrice += Side.PRICE - deluxeComboDiscount;
        System.out.printf("Total Deluxe Burger price with %s and drink is $%.2f\n", Side.CHIPS, totalDeluxeBurgerPrice);
    }

    @Override
    public double totalBurgerPrice() {
        double totalDeluxeBurgerPrice = super.getPlainBurgerPrice();

        for(String topping: deluxeToppingsList) {
            totalDeluxeBurgerPrice += Burger.getToppingPrice(topping);
        }
        System.out.printf("Total Deluxe Burger price is $%.2f\n", totalDeluxeBurgerPrice);
        return totalDeluxeBurgerPrice;
    }
}
