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
}
