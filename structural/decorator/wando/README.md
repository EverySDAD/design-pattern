# decorator pattern

> 정의  

데코레이터 패턴(Decorator pattern)이란 주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴!  
기능 확장이 필요할 때 서브클래싱 대신 쓸 수 있는 유연한 대안이 될 수 있다.

출처 : [갓키피디아-데코레이터패턴][wiki-decorator-pattern]

[wiki-decorator-pattern]: https://ko.wikipedia.org/wiki/%EB%8D%B0%EC%BD%94%EB%A0%88%EC%9D%B4%ED%84%B0_%ED%8C%A8%ED%84%B4 "위키피디아로 고고씽"

<hr/>

> 내 생각

일단 데코레이터는 장식이라는 의미를 가지고 있다.  
뭔가를 감싸서 사용한다고 볼수있을거 같다.  
ex. (A) -> B(A) => C(B(A)) 요런느낌..?  

<hr />

> golang 으로 구현

데코레이터 패턴 구현 시나리오
```plaintext
1. Hello 라는 함수가 있다. (name을 받아 환영메세지를 출력하는 함수)
1-1. Hello 전과 후에 이 함수의 시작, 끝을 알리는 메세지를 출력하고 싶다.
2. LogDecorate 함수를 만들어서 처리
```

<hr/>

> 이견 or 의견

```
이견 이나 의견 혹은 잘못된 정보가 있다면 언제든 박살내주시기 바랍니다. :)
```
