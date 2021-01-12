package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    SwitchStatement.MySwitch('A');
	    SwitchStatement.MySwitch('Z');
	    SwitchStatement.PrintDayOfTheWeek(1);
	    SwitchStatement.PrintDayOfTheWeek(8);
	    SwitchStatement.PrintNumberInWord(1);
	    SwitchStatement.PrintNumberInWord(10);
        System.out.println(SwitchStatement.IsLeapYear(1600));
        System.out.println(SwitchStatement.IsLeapYear(2017));

        for(int i=2; i<9; i++){
            System.out.println("10000 at " + (i + .0)+ "% interest = " + ForLoops.CalculateInterest(10000.0,i+.0));
        }

        for(int i=8; i >= 2; i--){
            System.out.println("10000 at " + (i + .0)+ "% interest = " + ForLoops.CalculateInterest(10000.0,i+.0));
        }

        System.out.println("Total = " + ForLoops.SumTotal());
        System.out.println("Sum = " + ForLoops.SumOdd(1,100));
        System.out.println("Sum = " + ForLoops.SumOdd(-1,100));
        System.out.println("Sum = " + ForLoops.SumOdd(13,13));
        System.out.println("Sum = " + ForLoops.SumOdd(100,-100));

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber){
            number++;
            if (count == 5){
                System.out.println(count + " Even numbers have been found");
                break;
            } else if (!WhileLoop.IsEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number);

        }

        System.out.println("Sum of digits is " + WhileLoop.SumDigits(125));

    }
}
