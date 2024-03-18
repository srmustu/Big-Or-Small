import java.util.Scanner;
public class BigOrSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String element1,element2,element3;
        String message1;
        double number1, number2, number3,process;

        element1 = "Number 1 : ";
        element2 = "Number 2 : ";
        element3 = "Number 3 : ";
        message1 = "Please enter your numbers";
        message1 = " is less than ";


        System.out.print(message1 + "\n" + element1);
        number1 = input.nextDouble();
        System.out.print(element2);
        number2 = input.nextDouble();
        System.out.print(element3);
        number3 = input.nextDouble();

        int process1 = (number1 < number2 && number1 < number3) ? 1:0;
        int process2 = (number2 < number3 && number2 < number1) ? 1:0;
        int process3 = (number3 < number1 && number3 < number2) ? 1:0;

        if (process1 == 1){
            if (number2 < number3){
                System.out.println(number1 + message1 + number2 + message1 + number3);
            } else {
                System.out.println(number1 + message1 + number3 + message1 + number2);
            }

        } else if (process2 == 1) {
            if (number3 < number1){
                System.out.println(number2 + message1 + number3 + message1 + number1);
            } else  {
                System.out.println(number2 + message1 + number1 + message1 + number3);
            }
        } else {
            if (number1 < number2){
                System.out.println(number3 + message1 + number1 + message1 + number2);
            } else {
                System.out.println(number3 + message1 + number2 + message1 + number1);
            }
        }


    }



}
