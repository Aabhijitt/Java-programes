package sept8;

public class stackclint {
	private static int[] spans;

	public static void main(String[] args) {
		// int[] prices = { 30, 35, 40, 60, 50, 48, 18, 49, 55, 20, 29, 35, 30,
		// 20 };
		// int[] spans = stockspan(prices);
		// for (int i = 0; i < spans.length; i++) {
		// System.out.println(prices[i]+" "+spans[i]);
		// incdec("diddiddd");
		// }
		// System.out.println(isbalanced("[a+{b+(c+d)+e}+f]"));
		// System.out.println(isbalanced("[a+{b+(c+d)+e)+f]"));
		// System.out.println(isduplicate("(a+(b+(c+d)+e)+f)"));
		// System.out.println(isduplicate("(a+((((b+c)+d)+e))+f)"));

		stack stack = new dynamicstack(5);

		stack.push(10);
		stack.display();

		stack.push(20);
		stack.display();

		stack.push(30);
		stack.display();

		stack.push(40);
		stack.display();

		stack.push(50);
		stack.display();

		stack.push(60);
		stack.display();

		stack.pop();
		stack.display();

		int r = stack.top();
		System.out.println(r);
		stack.display();
	}

	public static boolean isbalanced(String str) {
		stack stack = new stack(str.length());

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			} else if (ch == '}' || ch == ')' || ch == ']') {
				// System.out.println(stack.top() + " " + ch );
				if (stack.size() == 0) {
					return false;
				} else {
					if (ch == '}' && stack.top() == '{') {
						stack.pop();
					} else if (ch == ')' && stack.top() == '(') {
						stack.pop();
					} else if (ch == ']' && stack.top() == '[') {
						stack.pop();
					}

					else {
						return false;
					}
				}

			}
		}
		stack.top();
		if (stack.size() > 0)

		{
			return false;
		} else {
			return true;
		}
	}

	public static boolean isduplicate(String str) {
		stack stack = new stack(str.length());

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ')') {
				stack.push(ch);
			} else {
				if (stack.top() == '(') {
					return true;
				}
				while (stack.top() != '(') {
					stack.pop();
				}
				stack.pop();
			}

		}
		return false;
	}

	public static int[] stockspan(int[] prices) {
		int[] spans = new int[prices.length];
		stack stack = new stack(prices.length);
		stack.push(0);
		spans[0] = 1;

		for (int i = 1; i < prices.length; i++) {
			while (stack.size() > 0 && prices[i] > prices[stack.top()]) {
				stack.pop();
			}
			spans[i] = stack.size() == 0 ? i + 1 : i - stack.top();
			stack.push(i);

		}
		return spans;

	}

	public static void incdec(String str) {
		stack stack = new stack(str.length() + 1);
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			stack.push(count++);
			if (str.charAt(i) == ('i')) {
				while (stack.size() > 0) {
					System.out.print(stack.pop());
				}
			}
			stack.push(count++);
			while (stack.size() < 0) {
				System.out.print(stack.pop());

			}
		}
	}
}
