import java.util.EmptyStackException;

public class exception2 {
    private int size = 5;
    private int[] arr;
    private int top = -1;

    exception2() {
        arr = new int[size];
    }

    exception2(int n) {
        size = n;
        arr = new int[size];
    }

    public void push(int x) {
        if (isFull()) {
            throw new StackOverflowError("Stack overflow");
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed to stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
