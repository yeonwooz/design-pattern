package pizzas;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "시카고 치즈 피자";
        dough = "두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("모짜렐라 시트 슬라이스");

    }

    void cut() {
        System.out.println("네모난 모양으로 자르기");
    }
}