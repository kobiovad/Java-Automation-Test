package pageObject;

public class Palindrome {
    public void isPalindromeInt(int num) {
        int r, sum = 0, temp;
        if (num > 9  ) {
            temp = num;
            while (num > 0) {
                r = num % 10;
                sum = (sum * 10) + r;
                num /= 10;
            }
            System.out.println("The number: " + temp);
            if (temp == sum) {
                System.out.println("Palindrome :)");
            } else
                System.out.println("Not Palindrome !");
        }
        else
            System.out.println("Enter Number with to digit or more !");
    }

    public void isPalindromeString(String str) {
        String revers = "";
        int le = str.length();
        if (le > 1) {
            for (int i = le - 1; i >= 0; i--) {
                revers = revers + str.charAt(i);
            }
            System.out.println("The String: " + str);
            if (str.equals(revers)) {
                System.out.println("Palindrome :)");
            } else
                System.out.println("Not Palindrome !");
        }
        else
            System.out.println("Enter String with tow Char or more !");
    }
}
