package accademy.learnprogramming;
import java.util.ArrayList;
import java.util.List;

public class ForLoops {

    public static double CalculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }

    public static int SumTotal (){
        int total = 0;
        int count = 0;
        for(int i=1; i <= 1000; i++){
            if (i%3 == 0 && i%5 == 0){
                total += i;
                count++;
            }

            if (count == 5){
                break;
            }
        }
        return total;
    }

    public static boolean IsOdd (int num){
        if (num > 0 && num%2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int SumOdd (int start, int end){
        int total = 0;
        if (end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if (IsOdd(i)) {
                    total += i;
                }
            }
        } else {
            total = -1;
        }
        return total;
    }

    public static int GetEvenDigitSum (int number){
        int total = 0;
        List<Integer> digits = new ArrayList<>();
        while (number > 0){
            digits.add(number % 10);
            System.out.println(digits);
            number /= 10;
            System.out.println(number);
        }

        for (int i = 0; i < digits.size(); i++){
            if (digits.get(i)%2 == 0){
                total += digits.get(i);
            }
        }
        System.out.println(digits);
        return total;
    }
// NOT A GOOD SOLUTION BUT IT WORKED
    public static boolean HasSharedDigit (int num1, int num2){
        boolean result = false;
        int count = 0;
        if (num1 > 9 && num2 > 9) {
            List<Integer> digits1 = new ArrayList<>();
            while (num1 > 0) {
                digits1.add(num1 % 10);
                num1 /= 10;
            }
            List<Integer> digits2 = new ArrayList<>();
            while (num2 > 0) {
                digits2.add(num2 % 10);
                num2 /= 10;
            }
            for (int i = 0; i < digits1.size(); i++) {
                for (int j = 0; j < digits2.size(); j++){
                    if (digits1.get(i) == digits2.get(j)){
                        count +=1;
                    }
                }
            }
        }
        if (count > 0){
            result = true;
            return result;
        }
        return result;
    }

    public static boolean HasSameLastDigit (int num1, int num2){
        boolean result;
        List<Integer> digits1 = new ArrayList<>();
        List<Integer> digits2 = new ArrayList<>();
        if (num1 > 9 && num2 > 9) {
            while (num1 > 0) {
                digits1.add(num1 % 10);
                num1 /= 10;
            }
            while (num2 > 0) {
                digits2.add(num2 % 10);
                num2 /= 10;
            }
        }
        if (digits1.get(digits1.size()-2) == digits2.get(digits2.size()-2)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static int GetGreatestCommonDivisor (int num1, int num2){
        int common = 0;
        for (int i = 1; i < num1; i++){
            for (int j = 1; j < num2; j++){
                if ( num1 % i == 0 && num2 % j == 0){
                    common = i;
                }

            }
        }

        return common;
    }

}
