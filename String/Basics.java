// // // String 

public class Basics {
    public static void main(String[] args) {
        char[] arr = { 'p', 'q', 'e', 'r', 's', 't' };

        // print chracter array
        for (char ele : arr) {
        System.out.print(ele + " ");
        }

        System.out.println();

        // print specific character in array
        System.out.println(arr[3]); //out - r

        }
        }

        // print string
        String s = "shruti is a good girl" ;
        System.out.println(s);

        // print String using user input
        import java.util.Scanner;
        public class Basics {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();// print only single word
        System.out.println(s);

        String t = sc.nextLine(); // print full line
        System.out.println(t);
        }

        }
        CharAt() & length()
        String s = "chai and teA";
        System.out.println(s.charAt(5)); // starts from 0 and also counts ( ) spaces

        //

        }
        }

        // Built in Methods

        // (a) s.indexof(' array element ') s - array name
        String s = "harshitr";
        System.out.println(s.indexOf('r')); // Returns index when
        // elements appears first time.

        // (b) s.lastindexof('')
        System.out.println(s.lastIndexOf('r')); // 7 returns last index

        //(c) s.toUpperCase()
        System.out.println(s.toUpperCase()); // HARSHITR

        //(d)s.contains()
        System.out.println(s.contains("harsh")); // true - it checks whether the
        string contains it (harsh) or not

        // index of() & compareTo()

        String a = "raghav";
        String b = "preet";

        System.out.println(s.compareTo(b)); // -8 - bcz |s = h....| b = p....|
        System.out.println(a.compareTo(b));// 2 - |a (r) b(r)| a jyda hoga t plus(+)
        aayega
        // a jyda hoga t plus(+) aayega

        }
        }

        String + Int/char/String ( plus operator ) -

        String s = "gitanjali";
        String b = "preet";

        // String + String
        s = s + b;
        System.out.println(s); // gitanjalipreet

        // add text
        b = s + "john";
        System.out.println(b); // gitanjalipreetjohn

        // add numbers
        s += 10;
        System.out.println(s); // gitanjalipreet10

        // left to right moves ->
        System.out.println("raghav" + 10 + 20); // raghav1020 - string + 10 +20 = string10+ 20 = string1020

        System.out.println(10 + 20 + "Raghav"); // 30Raghav - int + int + string = Int + string

        System.out.println("Raghav" + (10 + 20)); // Raghav30 - string + (int ) - Bracket highest priority

        // Convert numbers to string
        int number = 1234;
        String su = ""; // String (not Strings)

        su += number; // int auto converts to String during concatenation

        System.out.println(su);

        System.out.println(su.getClass().getName()); // java.lang.String -to findout data type of su

        //

    }
}
