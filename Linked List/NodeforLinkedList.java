class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class main {
    public static void main(String[] args) {

        Node a = new Node(10); // head node 
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next = c;

         System.out.println(a.val); // 10
        System.out.println(a.next.val); // 20
        System.out.println(a.next);  //output - Node@251a69d7
        System.out.println(b); // Node@251a69d7  |Adress
        
    }
}
//del *.class - to delete class 
