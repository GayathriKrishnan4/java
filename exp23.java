public class exp23 {
    static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack<T> {
        private Node<T> top;
        
        public Stack() {
            this.top = null;
        }
        
        public void push(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = top;
            top = newNode;
        }
        
        public T pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            T data = top.data;
            top = top.next;
            return data;
        }
        
        public T peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return top.data;
        }
        
        public boolean isEmpty() {
            return top == null;
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        
        System.out.println("Stack after pushing 10, 20, 30:");
        System.out.println("Top element: " + intStack.peek());
        
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Popped: " + intStack.pop());
        System.out.println("Top element after pops: " + intStack.peek());
        
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        
        System.out.println("String stack:");
        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Popped: " + stringStack.pop());
    }
}

/*PS C:\Users\MCA\Desktop\gautham> javac exp23.java
PS C:\Users\MCA\Desktop\gautham> java exp23      
Stack after pushing 10, 20, 30:
Top element: 30
Popped: 30
Popped: 20
Top element after pops: 10
String stack:
Popped: World
Popped: Hello */