package main

import (
	"fmt"
	"lab1/numbersystem"
)

func main() {
	num1 := 52447
	system1 := 13
	value1 := numbersystem.ToNumberSystem(num1, system1)
	fmt.Println("num1: ", value1)

	num2 := "(5)(4)(3)(0)(5)"
	system2 := 11
	value2 := numbersystem.ToDecimal(num2, system2)
	fmt.Println("num2: ", value2)

	num3 := "(5)(0)(2)(0)(4)"
	system3from := 13
	system3to := 7
	value3 := numbersystem.ToDecimal(num3, system3from)
	value3s := numbersystem.ToNumberSystem(value3, system3to)
	fmt.Println("num3: ", value3s)

}
