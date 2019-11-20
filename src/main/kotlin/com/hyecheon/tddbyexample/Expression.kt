package com.hyecheon.tddbyexample

interface Expression {
	fun reduce(bank: Bank, to: String): Money
}