package main

import "structural/proxy/wando/yes"

func main() {
	// bodyguard := yes.BodyGuard{
	// Name: "완도네 보디가드",
	// }
	marco := yes.OutSider{
		Name:          "마르코",
		InnerBehavior: yes.InnerBehaviorS{},
	}
	luppy := yes.OutSider{
		Name:          "루피",
		InnerBehavior: yes.InnerBehaviorC{},
	}

	// bodyguard.GetOut(marco)
	// bodyguard.GetOut(luppy)

	var bodyGuard yes.IObject
	bodyGuard = &yes.ProxyObject{} // new(yes.ProxyObject) 와 동일
	bodyGuard.GetOut(marco)
	bodyGuard.GetOut(luppy)
}
