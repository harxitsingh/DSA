class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int val, int idx){
        if (idx < 0 || idx > size){
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else{
            Node temp = head;
            for(int i = 1; i < idx; i++){
                temp = temp.next;
            }

            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    void display (){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDs{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);

        ll.display();
        ll.insert(99, 2);
        ll.display();
    }
}
