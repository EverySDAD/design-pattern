package yes

import "fmt"

type BodyGuard struct {
	Name string
}

func (b BodyGuard) GetOut(o OutSider) {
	o.InnerBehavior.Inner()
	fmt.Print(" 들어오는 " + o.Name + " ")
	fmt.Println("넌 못들어와!")
}
