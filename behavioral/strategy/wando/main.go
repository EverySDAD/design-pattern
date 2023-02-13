package main

import "behavioral/strategy/wando/yes"

// "fmt"
// "strategy/no"

func main() {
	// 전략패턴을 이용하지 않았을때
	// marco := no.Marco{
	// 	Name:          "마르코",
	// 	InnerBehavior: "살금살금",
	// }
	// fmt.Printf("%v 입장할래!\n", marco.MyName())

	// bodyguard := no.BodyGuard{
	// 	Name: "완도네 보디가드",
	// }
	// fmt.Println(bodyguard.GetOut(marco))

	// 전략패턴 이용했을때
	// 외부인의 발걸음과 이름을 각각 정의해서 사용하도록 됨.
	// 일단 go는 상속 class가 없어서 정확히 구현하기가 쉽지않았음.
	// ~처럼 만들어 둔 느낌..
	bodyguard := yes.BodyGuard{
		Name: "완도네 보디가드",
	}
	marco := yes.OutSider{
		Name:          "마르코",
		InnerBehavior: yes.InnerBehaviorS{},
	}
	luppy := yes.OutSider{
		Name:          "루피",
		InnerBehavior: yes.InnerBehaviorC{},
	}

	bodyguard.GetOut(marco)
	bodyguard.GetOut(luppy)

}
