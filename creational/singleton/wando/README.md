# singleton pattern

> 정의  

생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.
DataBase Connection Pool 등에 사용된다.

출처 : [갓키피디아-싱글턴패턴][wiki-singleton-pattern]

[wiki-singleton-pattern]: https://ko.wikipedia.org/wiki/%EC%8B%B1%EA%B8%80%ED%84%B4_%ED%8C%A8%ED%84%B4 "위키피디아로 고고씽"

<hr/>

> 내 생각

대부분 많이 쓰는 애플리케이션 프레임워크인 spring boot를 보면 bean들을 생성할때 기본적으로 singleton으로 관리한다.  

써봤다면 was 구동 될때 로그만 봐도 알거라고 생각한다.

<hr />

> golang 으로 구현

프록시 패턴 구현 시나리오 (전략패턴에서 구현했던 소스에 2번을 이용해서 구현할 예정)
```plaintext
이번에는 새로 간단하게 만들어보려한다.
1. 숫자를 증가 시키는 singleton instance를 만들어 보겠다.
```

<hr/>

> 이견 or 의견

```
이견 이나 의견 혹은 잘못된 정보가 있다면 언제든 박살내주시기 바랍니다. :)
```
