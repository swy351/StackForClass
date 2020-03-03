import java.util.Iterator;
import java.util.Stack;

public class ProperStack <E> extends Stack<E> {

	@Override
	public synchronized Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new ProperIteratorForStack<E>(this);
	}

	@Override
	public synchronized void removeElementAt(int index) {
		
		if(index == this.size()-1)
		{
			super.removeElementAt(index);
		}
		else
		{
			throw new RemoveException();
		}	
	}
	
	
}
