package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number){
        int original = number;
        int reversed = 0;
        if(number < 0) {
            number = number * -1;
        }
        while(number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectNumber(int number){
        if (number <= 0) {
            return false;
        }

        int sum = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum+=i;
            }
        }

        return  sum == number;
    }

    public static String numberToWords(int number){
        if(number < 0){
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String result = "";

        while (number > 0) {
            int digit = number % 10;

            String word = "";

            switch (digit) {
                case 0: word = "Zero"; break;
                case 1: word = "One"; break;
                case 2: word = "Two"; break;
                case 3: word = "Three"; break;
                case 4: word = "Four"; break;
                case 5: word = "Five"; break;
                case 6: word = "Six"; break;
                case 7: word = "Seven"; break;
                case 8: word = "Eight"; break;
                case 9: word = "Nine"; break;
            }

            result = word + " " + result;
            number /= 10;
        }

        return result.trim();
    }


}
