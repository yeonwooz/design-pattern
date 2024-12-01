package abstractFactoryPattern.pizzas;

public abstract class PizzaStore {
    /*
        추상 팩토리 패턴 : 제품군을 생성하는 팩토리 인터페이스(NY / Chicago IngredientFactory)들을 만든다.
        그리고 구상클래스는 서브클래스(NYStore / ChicagoStore)에서 만든다.
    */
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
