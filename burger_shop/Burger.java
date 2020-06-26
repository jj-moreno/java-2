package burger_shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Burger {
    private String breadRollType;
    private String meat;
    private static Map<String, Double> toppings = new HashMap<String, Double>() {{
        put("lettuce", 0.59);
        put("tomatoes", 0.42);
        put("carrots", 0.33);
        put("onions", 0.22);
        put("mustard", 0.00);
        put("ketchup", 0.00);
        put("mayonaise", 0.00);
        put("relish", 0.11);
        put("guacamole", 1.29);
        put("mushrooms", 0.85);
        put("cheese", 1.06);
        put("bacon", 1.78);
        put("pepperoni", 1.03);
    }};
    private String toppings1;
    private String toppings2;
    private static double plainBurgerPrice = 4.99;

    public Burger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        printInitBurgerMsg();
    }

    public String getToppings1() {
        return toppings1;
    }

    public String getToppings2() {
        return toppings2;
    }

    private void printInitBurgerMsg() {
        System.out.println("Created burger on a " + this.breadRollType + " roll with " + this.meat + ", price is $" + plainBurgerPrice);
    }

    public double getPlainBurgerPrice() {
        return plainBurgerPrice;
    }

    public void addToppings1(String topping) {
        topping = topping.toLowerCase();
        if (isValidToppingOffering(topping)) {
            this.toppings1 = topping;
            printAddToppingMsg(topping);
        } else {
            printAddToppingError(topping);
        }
    }

    public void addToppings2(String topping) {
        topping = topping.toLowerCase();
        if (isValidToppingOffering(topping)) {
            this.toppings2 = topping;
            printAddToppingMsg(topping);
        } else {
            printAddToppingError(topping);
        }
    }

    protected static boolean isValidToppingOffering(String topping) {
        return toppings.containsKey(topping);
    }

    protected static void printAddToppingMsg(String topping) {
        System.out.println("Added " + topping + " for an extra $" + getToppingPrice(topping));
    }

    protected static double getToppingPrice(String topping) {
        BigDecimal bd = BigDecimal.valueOf(toppings.get(topping));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    protected static void printAddToppingError(String topping) {
        System.out.println("Error! Do not have topping " + topping);
    }

    public void totalBurgerPrice() {
        double totalBurgerPrice = Burger.plainBurgerPrice;

        if (this.toppings1 != null) {
            totalBurgerPrice += getToppingPrice(this.toppings1);
        }

        if (this.toppings2 != null) {
            totalBurgerPrice += getToppingPrice(this.toppings2);
        }

        System.out.printf("Total Burger price is $%.2f\n", totalBurgerPrice);

    }
}
