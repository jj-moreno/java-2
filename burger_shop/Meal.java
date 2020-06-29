package burger_shop;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private Burger burger;
    private Drink drink;
    private List<String> sides;


    public Meal() {
        this.burger = Burger.plain;
    }

    public Meal(Burger burger, Drink drink, String side) {
        this.burger = burger;
        this.drink = drink;
        this.sides = new ArrayList<>();
        if (side != null) {
            sides.add(side);
        }
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

    public List<String> getSides() {
        return sides;
    }

    public void setSides(List<String> sides) {
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
