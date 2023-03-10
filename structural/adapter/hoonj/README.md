# Adapter pattern

    클래스의 인터페이스를 사용자가 기대하는 인터페이스 형태로 적응(변환)시킨다.
    서로 일치하지 않는 인터페이스를 갖는 클래스들을 함께 동작시킨다.
    
    Wrapper pattern 이라고도 부른다.

### 범주
Class Pattern, Structural Pattern

- 서로 일치하지않는 클래스 모두 상속받아서 Class Pattern 으로 구현
- 기대하는 인터페이스를 구성을 사용하고 인터페이스를 구현하는 Structural Pattern 으로 구현

_자바에선 다중상속을 지원하지않으므로 `Structural Adapter Pattern` 기준으로 진행_

### 활용성
- 기존 클래스를 사용하고싶은데 인터페이스가 맞지 않을때
- 이미 만들어진 것을 재사용하고싶은데 재사용 가능한 라이브러리를 수정할수 없을때
- 이미 존재하는 여러개의 서브클래스를 사용해야하는데 상속을 통해서 이들의 인터페이스를 다 개조한다는것이 현실성없을때

### 참여자
- Target: 사용자가 사용할 인터페이스를 정의하고있는 클래스
- Adaptee: 인터페이스의 적응이 필요한 기존 인터페이스를 정의하는 클래스
- Adapter: Target 인터페이스에 Adaptee의 인터페이스를 적응시키는 클래스

사용자는 Target만 바라보고 호출시 Target을 구현한 Adapter 인스턴스에게 연산을 호출하고 Adepter 는 해당 요청을 수행하기 위해 Adaptee의 연산을 호출한다.

### 장점
- Adapter 클래스 하나만 있어도 수많은 Adaptee 클래스들과 동작할수 있다.

### 단점
- Adaptee 클래스의 행동을 재정의 하기가 매우 어렵다.

출처: **`gof의 디자인 패턴`**, **`해드퍼스트 디자인 패턴`**

비교
> 파사드 패턴과 뉘앙스가 비슷해서인지 헤드퍼스트에선 같이 다루고있다.
>
> 같은 구조 패턴이여서 그런가같다.
>
> 쉽게 비교하자면 파사드 패턴은 복잡하게 얽혀있는 여러 서브클래스들을 사용하기 편한 하나의 **통합된** 인터페이스를 제공하는거고
> 어댑터 패턴은 각각의 클래스를 통일 시켜주는 역할로 보면 될꺼같다.

## 구현 시나리오

---

##### 스크린골프장 스코어 관리
1. 골프존 스크린 골프장과 카카오스크린 골프장의 스코어를 통합으로 관리하고싶다.
2. 두 스크린 골프장에서 건내주는 데이터 구조가 다르다.
3. 어댑터 패턴을 이용해 이를 해결하고 골프장 어플이 1등자리를 노리자!