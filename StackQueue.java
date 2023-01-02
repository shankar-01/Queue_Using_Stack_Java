/**
 * Realization of a queue as an adaptation of Java built-in stacks.
 *
 * @see Java built-in Stack class(https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/util/Stack.html)
 */

import java.util.Stack;

class StackQueue<T> implements Queue<T>{
	private Stack<T> stack1;
	private Stack<T> stack2;
	private int size;

	public StackQueue(){
		//add code
		stack1 = new Stack<T>();
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size==0;
	}

	/*
	 * Provide estimated runtime in big-O
	 * estimated runtime: O(n)
	 */
	public T first(){
		//add code
		stack2 = new Stack<T>();
		if(!isEmpty()){
			while (!stack1.empty()){
				stack2.push(stack1.pop());
			}
			T object = stack2.peek();
			while (!stack2.empty()){
				stack1.push(stack2.pop());
			}
			stack2 = null;
			return object;
		}
		return null;
	}

	/*
	 * Provide estimated runtime in big-O
	 * estimated runtime: O(1)
	 */
	public void enqueue(T x){
		//add code
		stack1.push(x);
		size++;
	}

	/*
	 * Provide estimated runtime in big-O
	 * estimated runtime: O(n)
	 */
	public T dequeue(){
		//add code
		stack2 = new Stack<T>();
		if(!isEmpty()){
			while (!stack1.empty()){
				stack2.push(stack1.pop());
			}
			T object = stack2.pop();
			while (!stack2.empty()){
				stack1.push(stack2.pop());
			}
			stack2 = null;
			size--;
			return object;
		}
		return null;
	}

	public String toString(){
		// add code
		String result = "StackQueue: ";
		stack2 = new Stack<T>();
		while (!stack1.empty()){
			stack2.push(stack1.pop());
		}
		while (!stack2.empty()){
			result += stack2.peek();
			stack1.push(stack2.pop());
			if (!stack2.empty()){
				result += ", ";
			}
		}
		stack2 = null;
		return result;
	}

	public static void main(String[] args){
		StackQueue<Integer> q = new StackQueue<>();
		q.enqueue(0);
		System.out.println("first element: " + q.first()); // first element: 0
		q.enqueue(1);
		q.enqueue(2);
		System.out.println("dequeued: " + q.dequeue()); // dequeued: 0 
		System.out.println(q.toString()); // StackQueue: 1, 2 
		System.out.println("size: " + q.size()); // size: 2
		System.out.println("first element: " + q.first());// first element: 1
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.toString()); //StackQueue: 1, 2, 3, 4, 5 
		System.out.println("dequeued: " + q.dequeue()); // dequeued: 1 
		System.out.println(q.toString()); //StackQueue: 2, 3, 4, 5 
		System.out.println("first element: " + q.first()); //first element: 2
	}

}
