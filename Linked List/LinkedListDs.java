class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
  class LinkedList { // user defined data structure
    Node head;
    Node tail;
    void addAtTail(int val){
      Node temp = new Node(val);
      if(tail==null) head = tail = temp;
      else{
        tail.next=temp;
        tail=temp;
    }
 }
 void display (){
  if(head == null) return;
  Node temp = head;
  while (temp!= null) {
    System.out.print(temp.val+" ");
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
   
  }
}
