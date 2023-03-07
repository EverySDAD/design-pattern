package main

import (
	"creational/singleton/wando/src"
	"testing"
)

func Test_Singleton(t *testing.T) {
	instance1 := src.GetInstance()
	if instance1.GetCount() != 0 {
		t.Errorf("before add 기대값 : 0, 출력값 :%d\n", instance1.GetCount())
	}
	instance1.AddOne()
	if instance1.GetCount() != 1 {
		t.Errorf("after add 기대값 : 1, 출력값 :%d\n", instance1.GetCount())
	}

	instance2 := src.GetInstance()
	if instance2.GetCount() != 1 {
		t.Errorf("before add 기대값 : 1, 출력값 :%d\n", instance2.GetCount())
	}
	instance2.AddOne()
	if instance2.GetCount() != 2 {
		t.Errorf("after add 기대값 : 2, 출력값 :%d\n", instance2.GetCount())
	}
}
