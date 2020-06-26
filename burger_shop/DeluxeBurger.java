package burger_shop;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    private ArrayList<String> deluxeToppingsList;

    public DeluxeBurger(String breadRollType, String meat) {
        super(breadRollType, meat);
        this.deluxeToppingsList = new ArrayList<>(6);
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

    @Override
    public void totalBurgerPrice() {
        double totalDeluxeBurgerPrice = super.getPlainBurgerPrice();
        double deluxeComboDiscount = 0.25;

        for (String topping : deluxeToppingsList) {
            totalDeluxeBurgerPrice += Burger.getToppingPrice(topping);
        }

        totalDeluxeBurgerPrice += Side.CHIPS_PRICE + Side.DRINK_PRICE - deluxeComboDiscount;
        System.out.printf("Total Deluxe Burger price with %s and %s is $%.2f\n", Side.CHIPS, Side.DRINK, totalDeluxeBurgerPrice);
    }
}
