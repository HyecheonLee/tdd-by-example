package com.hyecheon.tddbyexample

import java.util.*

open class Money(protected val amount: Int, private val currency: String) {
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

	companion object {
		fun franc(amount: Int) = Franc(amount, "USD")
		fun dollar(amount: Int) = Dollar(amount, "CHF")
	}

}