package accademy.learnprogramming;

import javax.sound.midi.Soundbank;
import java.util.Map;
import java.util.Scanner;

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
        System.out.println("Palindrome = " + WhileLoop.IsPalindrome(1221));
        System.out.println(WhileLoop.sumFirstAndLastDigit(212));
        System.out.println(WhileLoop.sumFirstAndLastDigit(217));
        System.out.println(WhileLoop.sumFirstAndLastDigit(0));
        System.out.println(WhileLoop.sumFirstAndLastDigit(5));
        System.out.println(ForLoops.GetEvenDigitSum(123456789));
        System.out.println(ForLoops.HasSharedDigit(12,23));
        System.out.println(ForLoops.HasSharedDigit(33,44));
        System.out.println(ForLoops.HasSameLastDigit(23,13));
        System.out.println(ForLoops.GetGreatestCommonDivisor(12,30));
        System.out.println(ForLoops.GetGreatestCommonDivisor(25,15));

        // PARS STRING TO INT
        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);
        int myNum = Integer.parseInt(numberAsString);
        System.out.println("myNum = " + myNum);
        numberAsString += 1;
        myNum += 1;
        System.out.println("numberAsString= "+ numberAsString);
        System.out.println("myNum = " + myNum);

        //SCANNER CLASS

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth: ");
//        int yearOfBirth = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        int age = 2021 - yearOfBirth;
//        System.out.println("Your name is " + name + " and you are " + age + " years old");
//
//        scanner.close();

        // Scanner Challenge
//        Scanner scanner1 = new Scanner(System.in);
//        int counter = 1;
//        int total = 0;
//        while (counter < 11){
//            System.out.println("Enter number#" + counter);
//            counter++;
//            total += scanner1.nextInt();
//            scanner1.nextLine();
//        }
//        System.out.println("Total = " + total);
//        scanner1.close();





    }
}
