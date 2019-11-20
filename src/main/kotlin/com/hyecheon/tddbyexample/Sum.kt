package com.hyecheon.tddbyexample

class Sum(var augmend: Money, var addmend: Money) : Expression {
	override fun reduce(to: String): Money {
		val amount = augmend.amount + addmend.amount
		return Money(amount, to)
	}
}