package com.hyecheon.tddbyexample

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MoneyTest {
	@Test
	internal fun testMultiplication() {
		val five = Money.dollar(5)

		assertEquals(Money.dollar(10), five.times(2))
		assertEquals(Money.dollar(15), five.times(3))
	}

	@Test
	internal fun testEqualityDollar() {
		assertEquals(Money.dollar(5), Money.dollar(5))
		assertNotEquals(Money.dollar(5), Money.dollar(8))
		assertNotEquals(Money.dollar(5), Money.franc(5))
	}

	@Test
	internal fun testMultiplicationFranc() {
		val five = Money.franc(5)
		assertEquals(Money.franc(10), five.times(2))
		assertEquals(Money.franc(15), five.times(3))
	}

	@Test
	internal fun testEqualityFranc() {
		assertEquals(Money.franc(5), Money.franc(5))
		assertNotEquals(Money.franc(5), Money.franc(8))
	}
}