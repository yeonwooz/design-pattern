package singletonPattern;

public class Main {
    public static void main(String[] args) {
//        var instance = new Singleton();   // var 되네 헐..
//        Pub pub = new Pub();
//        chapter5.Pvt pvt = new chapter5.Pvt();   //  private 생성자를 가진 클래스는 인스턴스화할 수 없다.


        Singleton2 singleton = Singleton2.UNIQUE_INSTANCE;

        // 메서드 호출
        singleton.doSomething();  // "싱글톤 인스턴스에서 작업을 수행합니다." 출력

        // 같은 인스턴스가 유지되는지 확인
        Singleton2 anotherSingleton = Singleton2.UNIQUE_INSTANCE;

        // 같은 객체를 참조하는지 확인
        System.out.println(singleton);  // true 출력
        System.out.println(singleton == anotherSingleton);  // true 출력
    }
}