package accademy.learnprogramming;

public class WhileLoop {
    public static boolean IsEvenNumber (int num){
        if(num%2 == 0){
            return true;
        }
        return false;
    }

    public static int SumDigits (int n){
        int sum = 0;
        if (n<10){
            sum = -1;
        } else {
            while (n>0){
                int digit = n % 10;
                sum += digit;

                n /= 10;
            }
        }
        return sum;
    }

    public static boolean IsPalindrome (int number){
        int reversed = 0;
        int num = number;

        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /=10;
        }
        return (number == reversed);
    }

    public static int sumFirstAndLastDigit (int number) {
        int total = 0;
        if(number != 0 && number > 9) {

            while (number != 0) {
                int digit = number % 10;
                total += digit;
                number /= 10;
                total -= 1;
            }
            total += 2;
        } else {
            total = number + number;
        }
        return total;
    }


}
