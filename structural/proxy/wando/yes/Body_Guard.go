package yes

import (
	"fmt"
)

// type BodyGuard struct {
// 	Name string
// }

// func (b BodyGuard) GetOut(o OutSider) {
// 	o.InnerBehavior.Inner()
// 	fmt.Print(" 들어오는 " + o.Name + " ")
// 	fmt.Println("넌 못들어와!")
// }

// 프로시 패턴 구현

// 프록시를 사용하고 객체를 사용하려면 동일한 메서드를 구현해야 함.
type IObject interface {
	GetOut(o OutSider)
}

// Object는 프록시가 데이터를 위임 할 실제 객체를 나타냄
type Object struct {
	o OutSider
}

// GetOut는 IObject 인터페이스 및 핸들의 모든 로직을 구현함
func (obj *Object) GetOut(o OutSider) {
	o.InnerBehavior.Inner()
	fmt.Print(" 들어오는 " + o.Name + " ")
	fmt.Println("넌 못들어와!")
}

// ProxyObject는 인터셉트 작업이 있는 프록시 객체를 나타냄
type ProxyObject struct {
	object *Object
}

// GetOut은 실제 개체를 전송하기 전에 IO 개체 및 가로채기 작업을 구현
func (p *ProxyObject) GetOut(o OutSider) {
	if p.object == nil {
		p.object = new(Object)
	}
	if o.Name != "완도패밀리" {
		fmt.Println("안녕하세요. 저는 완도패밀리의 보디가드입니다.") // 스마트 레퍼런스 프록시 사용 - 선작업
		p.object.GetOut(o)
	}
}
