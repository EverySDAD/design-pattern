package src

import "fmt"

type IObject interface {
	GetOut(o OutSider)
}

type Object struct {
	o OutSider
}

func (obj *Object) GetOut(o OutSider) {
	o.InnerBehavior.Inner()
	fmt.Print(" 들어오는 " + o.Name + " ")
	fmt.Println("넌 못들어와!")
}

type ProxyObject struct {
	object *Object
}

func (p *ProxyObject) GetOut(o OutSider) {
	if p.object == nil {
		p.object = new(Object)
	}
	if o.Name != "완도패밀리" {
		fmt.Println("안녕하세요. 저는 완도패밀리의 보디가드입니다.")
		p.object.GetOut(o)
	}
}
