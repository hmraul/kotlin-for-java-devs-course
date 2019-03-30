package week3

class Person(val name: String, age: Int)
/*

people.maxBy {it.age}
people.maxBy(Person::age)

You can store lambdas as a variable, but not functions

val isEven : (Int) -> Boolean = {i: Int -> i % 2 == 0}

fun isEven(i: Int): Boolean = i % 2 == 0
val predicate = isEvent <-- COMPILE ERROR

To solve this compile error, you can use Function Reference

fun isEven(i: Int): Boolean = i % 2 == 0
val predicate = ::isEven

You can pass function references as a parameter, i.e

        listInt.filter(::isEven)

