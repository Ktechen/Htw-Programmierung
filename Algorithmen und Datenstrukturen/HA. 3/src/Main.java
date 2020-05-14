import data.Student;
import stack.Stack;
import stack.Stackable;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Mosby", "Ted", 1, 100);
		Student s2 = new Student("Cooper", "Shelden", 1, 999);
		Student s3 = new Student("Donald", "Duck", 56, 55);

		Stackable<Student> stack = new Stack<Student>();

		stack.push(s1);
		stack.push(s2);
		stack.push(s3);

		stack.printAll();
		printPropertiesOfStack(stack);
		stack.pop();
		System.out.println(stack.pop());
		printPropertiesOfStack(stack);
		
		stack.clear();
		printPropertiesOfStack(stack);

	}
	
	private static void printPropertiesOfStack(Stackable<Student> stack) {
		System.out.println("---------------------------------");
		System.out.println("peek  : " + stack.peek());
		System.out.println("Size  : " + stack.size());
		System.out.println("empty : " + stack.empty());
		System.out.println();
	}

}
