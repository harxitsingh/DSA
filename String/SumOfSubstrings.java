
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
