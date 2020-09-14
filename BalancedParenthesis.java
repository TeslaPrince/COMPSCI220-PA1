package PA1;

public class BalancedParenthesis {

	private char[] expression;
	char[] stack;
	int maxStackSize, topOfStack;
	char a;
	char b;
	public BalancedParenthesis(char[] expression) { // complete the constructor
		this.expression = expression;
	}

	public boolean isBalanced() { // complete this method
		Stack stack = new Stack(expression.length);
		for(int i = 0; i <= expression.length - 1; i++){
			a = expression[i];
			if(a == '(' || a == '{') {
				stack.push(a);
			}
			else if(a == ')' || a == '}') {
				if (stack.size() == 0) {
					return false;
				}
			}
			else{
				b = stack.pop();
				if((b == '{' && a == ')') || (b == '(' && a == '}')) {
					return false;
				}
			}
		}
		if(stack.size() != 0) {
			return false;
		}
		else {
			return true;
		}
	}

	public String toString() { // complete this method
		String val = "";
		for(int i = 0; i <= expression.length - 1; i++) {
			val = val + expression[i];
		}
		return val;
	}
}
