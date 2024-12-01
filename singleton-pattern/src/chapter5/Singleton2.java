package chapter5;

public enum Singleton2 {
    UNIQUE_INSTANCE;  // 이 부분이 바로 유일한 인스턴스입니다.

    // 예를 들어 메서드
    public void doSomething() {
        System.out.println("싱글톤 인스턴스에서 작업을 수행합니다.");
    }
}



