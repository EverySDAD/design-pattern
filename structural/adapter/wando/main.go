package main

import (
	"structural/adapter/wando/src"
)

func main() {
	marco := src.OutSider{
		Name:          "마르코",
		InnerBehavior: src.InnerBehaviorS{},
	}
	luppy := src.OutSider{
		Name:          "루피",
		InnerBehavior: src.InnerBehaviorC{},
	}

	dodo := src.DoDo_Adapter()

	var bodyGuard src.IObject
	bodyGuard = &src.ProxyObject{} // new(src.ProxyObject) 와 동일
	bodyGuard.GetOut(marco)
	bodyGuard.GetOut(luppy)
	bodyGuard.GetOut(dodo)
}
