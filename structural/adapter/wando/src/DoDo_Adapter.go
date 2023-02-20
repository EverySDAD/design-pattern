package src

import "fmt"

type InnerBehaviorDoDo struct{}

func (i InnerBehaviorDoDo) Inner() {
	fmt.Print("춐춐")
}

func dodo_OutSider() OutSider {
	dodo := OutSider{
		Name:          Get_Name(),
		InnerBehavior: InnerBehaviorDoDo{},
	}
	return dodo
}

func DoDo_Adapter() OutSider {
	return dodo_OutSider()
}
