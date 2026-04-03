class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

//Search Function
 class LinkedList{ //user defined data structure
  Node head;
  Node tail;
  int size;
  int search(int val){
    if(head==null) return -1 ;
    Node temp=head;
    int idx=0;
    while (temp!= null) {
      if(temp.val == val) return idx;
      temp = temp.next;
      idx++;  
    }
    return -1;  
  }
  public class LinkedList2 {
    public static void main(String[] args) {
      LinkedList ll = new LinkedList();
   
    }
  }

}
