import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class TestProperStack extends TestStack {
	
	@Test
	public void testIterator() {
		ProperStack<Integer> stack = new ProperStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		int value=3;
		
		for(Integer i:stack)
		{
			assertEquals(value, i.intValue());
			value --;
		}
		assertTrue(stack.empty());
	}
	@Test
	public void testRemove() {
		ProperStack<Integer> stack = new ProperStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		try {
			stack.removeElementAt(0);
			fail("cannot do this");
		}
		catch (RemoveException re)
		{
			
		}
	}
}
