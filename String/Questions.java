 // Question 1  - count the number of vowels
public class CountVowels {
    public static void main(String[] args) {
        String s = "harshit";
        int count = 0;
        String vowels = ""; // to print vowels also

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                vowels = vowels + ch; // adding ch
            }
        }

        System.out.println(count);
        System.out.println("Vowels: " + vowels);
    }
    
// question 2 - print all the elements of substring
public class PrintAllElements {
    public static void main(String[] args) {
        String s = "gopi";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                System.out.println(s.substring(i, j + 1));// s.substring(1,5) prints elements from index 1 to 4
            }
            System.out.println();
        }
    }

}
      // output - 
     // g go  gop  gopi    o op opi     p  pi  i

    
// Question 3 - print sum of all substrings
public class SumOfSubstrings {
    public static void main(String[] args) {
        String num = "1234";
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            for (int j = i; j < num.length(); j++) {
                String sub = num.substring(i, j + 1);

                int convert = Integer.parseInt(sub); // sum += Integer.parseInt(sub);
                sum = sum + convert;

            }
        }

        System.out.println("Sum = " + sum);
    }
}
 

