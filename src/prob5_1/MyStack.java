package prob5_1;

public class MyStack<T> {
	private int top;
	private T[] buffer;
	
	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		this.top = -1;
		buffer = (T[])new Object[capacity];
	}

	public void push(T t) {
		if(top == buffer.length-1) { // stack is full
			resize();
		}
		top += 1;
		buffer[top] = t;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public T pop() throws MyStackException {
		if(isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		
		T result = buffer[top];
		buffer[top--] = null;
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private void resize() {
		T[] temp = (T[])new Object[buffer.length*2];
		
		for(int i=0; i<=top; i++) {
			temp[i] = buffer[i];
		}
		
		buffer = temp;
	}
	
}