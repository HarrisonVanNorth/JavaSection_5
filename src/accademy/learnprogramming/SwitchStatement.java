package accademy.learnprogramming;

public class SwitchStatement {
    public static void MySwitch(char switchValue){
        switch (switchValue){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println(switchValue + " is a valid value");
                break;
            default:
                System.out.println(switchValue + " is not a valid value");
                break;
        }
    }

    public static void PrintDayOfTheWeek (int Day){
        switch (Day){
            case 0: System.out.println("Sunday");
            break;
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            default: System.out.println("Invalid Day");

        }
    }

    public static void PrintNumberInWord(int number){
        switch (number){
            case 1: System.out.println("ONE");
                break;
                case 2: System.out.println("TWO");
                    break;
                case 3: System.out.println("THREE");
                    break;
                case 4: System.out.println("FOUR");
                    break;
                case 5: System.out.println("FIVE");
                    break;
                case 6: System.out.println("SIX");
                    break;
                case 7: System.out.println("SEVEN");
                    break;
                case 8: System.out.println("EIGHT");
                    break;
                case 9: System.out.println("NINE");
                    break;
                default: System.out.println("OTHER");
                    break;
        }

    }

    public static boolean IsLeapYear (int year){
        boolean leapYear = false;

        if (year >= 1 && year <= 9999 && year % 4 == 0){
            leapYear = true;
        }

        return leapYear;
    }
}
