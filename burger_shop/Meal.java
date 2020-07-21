package burger_shop;

public class Meal {
    private Burger burger;
    private Drink drink;
    private String[] sides = new String[3];


    private Meal() {
        this.burger = Burger.plain;
    }

    private Meal(Burger burger, Drink drink, String side) {
        this.burger = burger;
        this.drink = drink;
        sides[0] = side;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public String[] getSides() {
        return sides;
    }

    public void setSides(String[] sides) {
        this.sides = sides;
    }

    protected enum Drink {
        water(0.00), coke(0.90), dietCoke(0.89), mountainDew(0.82), fanta(0.84), sprite(0.85), drPepper(0.87), gatorode(0.95), powerade(0.94);
        private double price;

        Drink(double price) {
            this.price = price;
        }

        protected double getPrice() {

            return this.price;
        }
    }

    protected enum Combo {
        healthy, deluxe;
    }

}
