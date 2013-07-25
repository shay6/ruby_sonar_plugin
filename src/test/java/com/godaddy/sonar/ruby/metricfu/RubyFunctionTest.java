package com.godaddy.sonar.ruby.metricfu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RubyFunctionTest {

	RubyFunction function;
	@Before
	public void setUp() throws Exception {
		function = new RubyFunction("foobar", 1, 10);
	}

	@Test
	public void testConstructor() {
		assertNotNull(function);
	}

	@Test
	public void testGetComplexity() 
	{
		assertTrue(function.getComplexity() == 1);
	}

	@Test
	public void testSetComplexity() 
	{
		function.setComplexity(5);
		assertTrue(function.getComplexity()==5);
	}

	@Test
	public void testGetLine() {
		assertTrue(function.getLine() == 10);
	}

	@Test
	public void testSetLine() {
		function.setLine(5);
		assertTrue(function.getLine()==5);
	}

	@Test
	public void testGetName() {
		assertTrue(function.getName().equals("foobar"));
	}

	@Test
	public void testSetName() {
		function.setName("barfoo");
		assertTrue(function.getName().equals("barfoo"));
	}

	@Test
	public void testToString() {
		String toString = "name: foobar complexity: 1 lines: 10";
		System.out.println(function.toString());
		assertTrue(function.toString().equals(toString));
	}

}
