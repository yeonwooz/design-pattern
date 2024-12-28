## 팩토리 패턴
객체 '생성'을 캡슐화하는 패턴

### 추상 팩토리 패턴
구체 클래스에 의존하지 않고도 서로 연관된 객체로 이루어진 제품군을 생성하는 인터페이스를 제공하는 패턴

구체 클래스는 서브클래스가 만듬

#### 나만의 정의
- 합성을 사용하는 팩토리 패턴
- 서브 클래스가 아예 구체 클래스를 만드는 것부터 직접 한다. 구체 클래스를 만들 때, 인터페이스 합성을 사용한다.
  ![img_1.png](img_1.png)

### 관련된 객체지향 원칙
- 바뀌는 부분은 캡슐화한다
- 상속보다는 구성을 활용한다
- 구현보다는 인터페이스에 의존한다
- 상호작용하는 객체들은 느슨하게 결합해야 한다
- 클래스는 확장에는 열려 있어야 하지만, 변경에는 닫혀 있어야 한다 (OCP)
- **추상화된 것에 의존하게 만들고 구체 클래스에 의존하지 않게 만든다**