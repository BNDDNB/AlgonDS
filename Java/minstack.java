//MinStack Java
//the implementation requires the operation of push, pop, top, getMin to be 
//all operating on a constant run time basis

//one way to implement is to implement two stack, one tracks the element being input
//the other tracks for the smallest corresponding to the location of the stack


class MinStack{
	public void push(int n){
		s.push(n);
		int minValue = m.isEmpty()? n:Math.min(n,s.peek());
		m.push(minValue);
	}

	public void pop(){
		s.pop();
		m.pop();
	}

	public int top(){
		return s.peek();
	}

	public int getMin(){
		return m.peek();
	}

	private Stack<Integer> s = new Stack<>();
	private Stack<Integer> m = new Stack<>();
}