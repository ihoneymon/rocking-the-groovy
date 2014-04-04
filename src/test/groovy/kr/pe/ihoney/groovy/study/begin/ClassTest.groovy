package kr.pe.ihoney.groovy.study.begin

import static org.junit.Assert.*;

import org.junit.Test;

class Greet {
	String greeting(String name) {
		return "Hello, $name"
	}
	
	String greetings(String[] names) {
		def stat = "Hello, "
		names.each() {itr -> stat += " - $itr"}
		return stat
	}
}

class ClassTest {
	@Test
	void testGreetig() {
		def greet  = new Greet()
		assert greet.greeting("Honeymon") == "Hello, Honeymon"
	}
	
	@Test
	void testGreetings() {
		def greet = new Greet()
		assert greet.greetings("Honeymon", "Kim Ji Heon") == "Hello, Honeymon - Kim Ji Heon"
	}
}
