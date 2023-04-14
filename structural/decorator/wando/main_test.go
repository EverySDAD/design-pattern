package main

import (
	"structural/decorator/wando/src"
	"testing"
)

func TestMain(t *testing.T) {
	testCase := "wando"
	expect := "Hello wando!"

	fn := src.LogDecorator[src.Fn](Hello)
	result := fn(testCase)

	if expect != result {
		t.Errorf("기대값: %s, 출력값: %s", expect, result)
	}

}
