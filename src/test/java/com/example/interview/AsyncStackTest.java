/*
 * Overview
 * 1. Given the following code, write the simplest implementation which will pass both tests
 * 2. What faults exist in the following code?
 * 3. What should be modified to fail the test?
 */
package com.example.interview;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class AsyncStackTest {

    public interface Stack<T> {
	int size();
	void push(T type);
	T pop();
    }

    /**
     * The solution!
     */
    public class AsyncStack implements Stack<String> {

	@Override
	public int size() {
	    return 0;
	}

	@Override
	public void push(final String type) {
	}

	@Override
	public String pop() {
	    return "";
	}}

    private Stack<String> tested;

    @Before
    public void setUp() {
	tested = new AsyncStack();
    }

    @Test
    public void testSize() throws Exception {
	 assertEquals("size", 0, tested.size());
    }

    @Test
    public void testPushPop() throws Exception {
	final String value = "somestring";
	tested.push(value);

	final String result = tested.pop();
	assertNotNull("result", result);
	/* assertEquals(value, result); */
    }
}
