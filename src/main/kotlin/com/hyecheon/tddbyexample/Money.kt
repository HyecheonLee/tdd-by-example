package com.hyecheon.tddbyexample

open class Money(val amount: Int, val currency: String) : Expression {
	fun times(multiplier: Int) = Money(amount * multiplier, currency);
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is Money) return false
		if (currency != other.currency) {
			return false
		}
		if (amount != other.amount) return false

		return true
	}

	override fun hashCode(): Int {
		return amount
	}

	override fun toString(): String {
		return "Money(amount=$amount, currency='$currency')"
	}

	fun plus(money: Money): Expression {
		return Money(amount + money.amount, currency)
	}

	companion object {
		fun franc(amount: Int) = Money(amount, "CHF")
		fun dollar(amount: Int) = Money(amount, "USD")
	}
}