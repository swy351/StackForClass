import java.util.Iterator;

public class ProperIteratorForStack<E> implements Iterator<E> {

	ProperStack<E> stack;
	
	public ProperIteratorForStack(ProperStack<E> stack) {
		this.stack = stack;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return !stack.empty();
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return stack.pop();
	}

}
