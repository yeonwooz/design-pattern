package pizzas;

import ingredients.cheeses.Cheese;
import ingredients.clams.Clams;
import ingredients.dough.Dough;
import ingredients.pepperonis.Pepperoni;
import ingredients.sauces.Sauce;
import ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    void box() {
        System.out.println("피자 포장");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        // 피자 이름 출력
        return "";
    }
}
