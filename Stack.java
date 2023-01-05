import java.util.Scanner;

public class Stack {
    int size;
    int stack[];

    Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    int top = 0;

    void push(int value) {

        if (top < stack.length) { // checking if stack is full
            stack[top] = value;
            top++;
        } else {
            System.out.println("Stack is Full");
        }
    }

    void show() {
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + "\t");
        }
    }

    int pop() {

        if (top > 0) { // checking if stack is empty
            top--;
            return stack[top];
        } else {
            System.out.println("Stack is Empty");
            return 0;
        }

    }

    int peek() {
        if (top > 0) { // checking if stack is empty
            top--;
            return stack[top];
        } else {
            System.out.println("Stack is Empty");
            return 0;
        }

    }

    public static void main(String args[]) {
        System.out.println("Enter size of the stack : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Stack S = new Stack(size);
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        S.push(6);
        S.push(7);
        S.push(8);
        S.push(9);
        S.push(10);
        S.push(11);
        S.push(12);

        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());
        

        S.push(11);
        S.push(12);

        System.out.println(S.peek());
        System.out.println(S.peek());
        System.out.println(S.peek());
        System.out.println(S.peek());


        S.show();

        scanner.close();
    }
}