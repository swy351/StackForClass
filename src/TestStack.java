import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class TestStack {

	@Test
	public void test() {
	
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(3,stack.pop().intValue());
		assertEquals(2,stack.pop().intValue());
		assertEquals(1,stack.pop().intValue());
		
		assertTrue(stack.isEmpty());
	}
	@Test
	public void testIterator() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		int value=1;
		
		for(Integer i:stack)
		{
			assertEquals(value, i.intValue());
			value ++;
		}
		assertFalse(stack.empty());
	}
	
	

}
