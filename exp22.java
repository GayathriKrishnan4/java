public class exp22 {
    static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList<T> {
        Node<T> head;
        public void add(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        public void removeAll() {
            head = null;
        }
        public void printList() {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Generic");
        list.add("Linked");
        list.add("List");
        System.out.println("List before removal:");
        list.printList();
        list.removeAll();
        System.out.println("List after removal:");
        list.printList();
    }
}

/*List before removal:
Hello World Generic Linked List 
List after removal:
 */