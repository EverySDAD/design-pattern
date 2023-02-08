package no

type BodyGuard struct {
	Name string
}

// 이렇게 되면 마르코 일때, 또 다른 누군가 일때 마다 추가해 줘야한다.
// 매우 비효율적
func (b BodyGuard) GetOut(m Marco) string {
	return m.GetInnerBehavior() + " 들어오는 " + m.MyName() + ", 너는 완도 패밀리가 아닌데? 못들어와!"
}
