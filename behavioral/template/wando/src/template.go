package src

import "fmt"

type Greeter interface {
	message() string
}

type GreeterTemplate interface {
	first() string
	third() string
	greet(Greeter) string
}

type PersonGreeterTmpl struct{}

func (p PersonGreeterTmpl) first() string {
	return "Welcome"
}
func (p PersonGreeterTmpl) third() string {
	return "to our home!"
}
func (p PersonGreeterTmpl) greet(g Greeter) string {
	return fmt.Sprintf("%s, %s %s", p.first(), g.message(), p.third())
}

type PersonGreeter struct {
	name string
}

func (p *PersonGreeter) message() string {
	return fmt.Sprintf("your person %s", p.name)
}

func Hello(name string) string {
	prGreeter := &PersonGreeter{name}
	tmpl := PersonGreeterTmpl{}

	return tmpl.greet(prGreeter)
}
