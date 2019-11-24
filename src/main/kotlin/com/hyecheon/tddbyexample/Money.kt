package com.hyecheon.tddbyexample

class Money(val amount: Int, val currency: String) : Expression {
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

	override fun reduce(bank: Bank, to: String): Money {
		return Money(amount / bank.rate(currency, to), to)
	}

	override fun plus(addend: Expression): Expression {
		return Sum(this, addend)
	}

	override fun times(multiplier: Int): Expression {
		return Money(amount * multiplier, this.currency)
	}


	companion object {
		fun franc(amount: Int) = Money(amount, "CHF")
		fun dollar(amount: Int) = Money(amount, "USD")
	}
}