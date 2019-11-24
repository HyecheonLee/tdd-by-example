package com.hyecheon.tddbyexample

class Bank {
	private val rateMap = mutableMapOf<Pair<String, String>, Int>()
	fun reduce(source: Expression, toCurrency: String): Money {
		return source.reduce(this, toCurrency)
	}

	fun rate(from: String, to: String): Int {
		return if (from == to) {
			1
		} else {
			rateMap.getOrElse(from to to, { 1 })
		}
	}

	fun addRate(from: String, to: String, rate: Int) {
		rateMap[Pair(from, to)] = rate
	}

}