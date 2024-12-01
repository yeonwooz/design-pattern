public class Main {
    public static void main(String[] args) {
        var instance = new Singleton();   // var 되네 헐..
        Pub pub = new Pub();
//        Pvt pvt = new Pvt();   //  private 생성자를 가진 클래스는 인스턴스화할 수 없다.
    }
}