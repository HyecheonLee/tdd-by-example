package com.hyecheon.tddbyexample

class Sum(var augmend: Expression, var addmend: Expression) : Expression {
	override fun reduce(bank: Bank, to: String): Money {
		val amount = augmend.reduce(bank, to).amount + addmend.reduce(bank, to).amount
		return Money(amount, to)
	}

	override fun plus(addend: Expression): Expression {
		return Sum(this, addmend)
	}

	override fun times(multiplier: Int): Expression {
		return Sum(augmend.times(multiplier),addmend.times(multiplier))
	}
}