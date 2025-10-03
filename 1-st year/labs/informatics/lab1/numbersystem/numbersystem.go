package numbersystem

import (
	"math"
	"strconv"
)

func ToNumberSystem(number, system int) string {
	var remainder int
	result := ""
	for number > 0 {
		remainder = number % system
		number = number / system
		result = "(" + strconv.Itoa(remainder) + ")" + result
	}
	return result
}

func ToDecimal(number string, baseSystem int) int {
	result, degree := 0, 0
	tempString := ""
	for i := 0; i < len(number); i++ {
		if string(number[len(number)-i-1]) == ")" {
			tempString = ""
		} else if string(number[len(number)-i-1]) == "(" {
			tempInt, _ := strconv.Atoi(tempString)
			result = result + tempInt*int(math.Round(math.Pow(float64(baseSystem), float64(degree))))
			degree++
		} else {
			tempString = string(number[len(number)-i-1]) + tempString
		}
	}
	return result
}
