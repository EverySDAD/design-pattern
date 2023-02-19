package src

import "fmt"

type InnerBehaviorS struct{}
type InnerBehaviorC struct{}

func (i InnerBehaviorS) Inner() {
	fmt.Print("살금살금")
}

func (i InnerBehaviorC) Inner() {
	fmt.Print("철퍽철퍽")
}
