 public class stack_client {
    public static void main(String[]args){
       //mystack st = new  mystack();
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);
//         st.push(5);
//         st.display();
//         st.pop();
//         st.pop();
//         st.pop();
//         st.pop();
//         st.push(6);
//         st.push(7);
//         st.push(8);
//         st.display();
//     }
// }


// import java.util.EmptyStackException;

// public class stack_client {
//     public static void main(String[] args) {
//         exception2 stack = new exception2(3); // Changed mystack to exception2

//         try {
//             stack.push(10);
//             stack.push(20);
//             stack.push(30);
//             stack.push(40);  // This will throw StackOverflowError
//         } catch (StackOverflowError e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         }

//         stack.display();

//         try {
//             System.out.println("Popped: " + stack.pop());
//             System.out.println("Popped: " + stack.pop());
//             System.out.println("Popped: " + stack.pop());
//             System.out.println("Popped: " + stack.pop()); // This will throw EmptyStackException
//         } catch (EmptyStackException e) {
//             System.out.println("Exception caught: Stack is empty");
//         }
//     }
// }



genrics<Integer> st=new genrics<>();
        st.push(0);
        st.push(1);
        st.push(2);
        System.out.println(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }


        // //genrics<String> st=new genrics<>();
        // st.push("abc");
        // st.push("def");
        // st.push("ps");
        // System.out.println(st);
        // while(!st.isEmpty()){
        //     System.out.println(st.pop());
        // }
    }
}