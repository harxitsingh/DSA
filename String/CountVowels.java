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
}
