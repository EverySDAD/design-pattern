package src

import "log"

type Fn func(string) string

func LogDecorator[T Fn](fn T) Fn {
	return func(name string) string {
		log.Printf("Start Fn , string: %s", name)
		result := fn(name)
		log.Printf("End Fn, result: %s", result)
		return result
	}
}
