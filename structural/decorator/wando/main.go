package main

import (
	"fmt"
	"structural/decorator/wando/src"
)

func Hello(name string) string {
	return fmt.Sprintf("Hello %s!", name)
}

func main() {
	f := src.LogDecorator[src.Fn](Hello)
	result := f("wando")
	fmt.Println(result)
}
