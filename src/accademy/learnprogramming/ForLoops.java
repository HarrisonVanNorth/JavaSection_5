package accademy.learnprogramming;

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
}
