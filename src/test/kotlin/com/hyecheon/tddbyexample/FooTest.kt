package com.hyecheon.tddbyexample

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FooTest {

	@Test
	internal fun getBar() {
		val foo = Foo()

		val result = foo.getBar()

		assertEquals("FooBar", result)
	}
}