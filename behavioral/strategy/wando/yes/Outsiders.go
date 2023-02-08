package yes

type IInnerBehavior interface {
	Inner()
}

type OutSider struct {
	Name          string
	InnerBehavior IInnerBehavior
}

func (o OutSider) performInner() {
	o.InnerBehavior.Inner()
}
