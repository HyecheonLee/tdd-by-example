package com.hyecheon.tddbyexample

interface Expression {
	fun reduce(to: String): Money
}