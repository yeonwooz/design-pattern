package pizzas;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;   // 추상 클래스에 의존

        pizza = createPizza(type);  // new 연산자로 바로 구상 클래스의 레퍼런스를 사용하지 말고, 팩토리 메서드를 사용
        
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("아직 오픈 전입니다!");
        }

        return pizza;
    }

    abstract Pizza createPizza(String type);
    // factory method
}
