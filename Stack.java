package PA1;


public class Stack {
	char[] stackArray;
	int maxStackSize, topOfStack; 
	public Stack(int maxStackSize){
		maxStackSize = this.maxStackSize;
		stackArray= new char[maxStackSize];
		topOfStack = maxStackSize - maxStackSize - 1;
	}
	void push(char val) {
		if (topOfStack == maxStackSize - 1) {
			System.out.println("Cannot push! Stack is full");
		}
		else {
			topOfStack++;
			stackArray[topOfStack] = val;
		}
	}
	char pop() {
		if(topOfStack == -1) {
			System.out.println("Cannot pop! Stack is empty");
			return '\0';
		}
		else {
			char m = stackArray[topOfStack];
			topOfStack--;
			return m;
		}
	}
	char peek() {
		if(topOfStack == -1) {
			System.out.println("Cannot peek! Stack is empty");
			return '\0';
		}
		else {
			return stackArray[topOfStack];
		}
	}
	int getSize() {
		return (topOfStack +1);
	}
	public String toString() {
		String Array = "[";
		for (int i = 0; i <= topOfStack; i++) {
			Array = Array + stackArray[i] + ",";
		}
		Array = Array + "]";
		return Array;
	}
}
