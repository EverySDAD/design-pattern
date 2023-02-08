package no

type Marco struct {
	Name          string
	InnerBehavior string
}

func (m Marco) MyName() string {
	return m.Name
}

func (m Marco) GetInnerBehavior() string {
	return m.InnerBehavior
}
