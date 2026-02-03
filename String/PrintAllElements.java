public class PrintAllElements {
    public static void main(String[] args) {
        String s = "gopi";
        for(int i = 0 ; i<s.length(); i++){
              for(int j = i ; j<s.length(); j++){

            System.out.println(s.substring(i,j+1));// s.substring(1,5) prints elements from index 1 to 4
        }
        System.out.println();
    }
}
    
}
