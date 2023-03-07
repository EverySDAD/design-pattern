package main

import (
	"creational/singleton/wando/src"
	"fmt"
)

func main() {
	instance1 := src.GetInstance()
	fmt.Printf("before 1 count:%d\n", instance1.GetCount())
	instance1.AddOne()
	fmt.Printf("after 1 count:%d\n", instance1.GetCount())

	instance2 := src.GetInstance()
	fmt.Printf("before 2 count:%d\n", instance2.GetCount())
	instance1.AddOne()
	fmt.Printf("after 2 count:%d\n", instance2.GetCount())

	fmt.Printf("result 1 count:%d\n", instance1.GetCount())
	fmt.Printf("result 2 count:%d\n", instance2.GetCount())
}
