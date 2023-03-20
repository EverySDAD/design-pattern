package main

import (
	"behavioral/template/wando/src"
	"testing"
)

func Test_Template(t *testing.T) {
	result := src.Hello("Wando")
	if result != "Welcome, your person Wando to our home!" {
		t.Errorf("기대값 : Welcome, your person Wando to our home!, 결과값: %v", result)
	}
}
