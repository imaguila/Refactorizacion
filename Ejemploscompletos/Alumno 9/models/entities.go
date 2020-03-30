package models

import (
	"fmt"
)

const (
	BAG_WEIGHT_UP_LIMIT = 20000
	BAG_WEIGHT_DOWN_LIMIT = 1

	DONKEYS_BAGS_UP_LIMIT = 1000000
	DONKEYS_BAGS_DOWN_LIMIT = 1
) 

type Donkey struct {}

type Bag struct {
	weight int
}

func NewBag(weight int) Bag {
	return Bag{
		weight: weight,
	}
}

func (b Bag) Weight() int {
	return b.weight
}

type Solution struct {
	donkeys []Donkey
	bags []Bag

	count int
}

func NewSolution(donkeys []Donkey, bags []Bag) Solution {
	weightsMap := make(map[int]int)
	for _, bag := range bags {
	  weightsMap[bag.Weight()] = countWeights(bags, bag.Weight())
	}
  
	solution := Solution{
		donkeys: donkeys,
		bags: bags, 
	}
	for _, w := range weightsMap {
	  solution.count += getSolutions(w)
	}
	if solution.count > len(donkeys) {
		solution.count = len(donkeys)
	}
	return solution
}

func (s Solution) Result() int {
	return s.count
}

func (s Solution) Print() string {
	return fmt.Sprintf("You can use %v donkeys.", s.count)
}

func getSolutions(n int) int {
	if !(n%2==0) {
	  n = n - 1
	}
	if n == 2 {
	  return 1;
	}
	return n/2;
  }
  
  func countWeights(list []Bag, value int) int {
	var total int
	for _, item := range list {
	  if item.Weight() == value {
		total++
	  }
	}
	return total
  }
