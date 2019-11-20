package com.hyecheon.tddbyexample

import java.util.*

class Bank {
	fun reduce(source: Expression, toCurrency: String): Money {
		return source.reduce(toCurrency)
	}
}