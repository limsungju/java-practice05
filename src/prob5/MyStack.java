package prob5;

public class MyStack {
	private int top = -1;
	private String[] buffer;
	
	public MyStack(int i) {
		this.top = -1;
		buffer = new String[i];
	}

	public String push(String str) {
		
		if(top>=(buffer.length-1)) {
			String[] buffer2 = new String[(buffer.length*2)];
			for(int i=0; i<buffer.length; i++) {
				buffer2[i] = buffer[i];
			}
			buffer=buffer2;
		}
		this.top += 1;
		buffer[top] = str;
		return buffer[top];
		
		
	}
	
	public String pop() throws MyStackException {
		if(this.top==-1) {
			throw new MyStackException("stack is empty");
		}
		
		String val = buffer[top];
		this.top -= 1;
		
		return val;
		
	}
	
	public boolean isEmpty() {
		return (this.top < 0) ? true : false;
	}
}