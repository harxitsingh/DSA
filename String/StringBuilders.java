// StringBuilders - This works like Arraylist 
// initial capacity(By default) 16 then it increases 

public class StringBuilders {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("raghav") ;
        System.out.println(s);

        //to add
        s.append("garg");
        System.out.println(s);// raghavgarg

        // Capacity and length
        System.out.println(s.capacity()); // 22
        System.out.println(s.length()+ " "+ s.capacity() ); // 10 22

        // to declare capacity
        StringBuilder t = new StringBuilder(10) ;
        System.out.println(t.capacity()); //capacity 10

        // String u = s.charAt(1,'o')
        // System.out.println(u);

//Reverse strings >>>>
        String a = "Harshit"; 
        StringBuilder b = new StringBuilder(a);

        // b.reverse();
        // interview -manuallly reverse
        int i = 0;
        int j = b.length() - 1;
        while (i <= j) {
            char temp1 = b.charAt(i); 
            char temp2 = b.charAt(j);

            b.setCharAt(i, temp2); // Put right side character at the left position
            b.setCharAt(j, temp1);  // Put left side character at the right position
            i++;
            j--;
        }
        System.out.println(b); // tihsraH
    }


}
