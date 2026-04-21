public class mystack {
    private int size = 5;
    private int[] arr = new int[size];
    private int top = -1;

    
    mystack(){
        arr = new int[5];
    }
     mystack(int n){
        arr = new int[5];
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack overflow");

        }
        else{
            arr[++top] = x;
            System.out.println(x + " pushed to stack");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size-1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: ");
        for(int i = 0;i<= top;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    
}
