import java.util.Scanner;
public class Selection2Exp1244107060048 {
    public static void main(String[] args) {
        Scanner input244107060048 = new Scanner(System.in);

        int year;
        System.out.print("Input Year : ");
        year = input244107060048.nextInt();

        if(year % 4 == 0){
            if(year % 100 != 0){
                System.out.println("Leap Year");
            }else{
                if(year % 400 == 0){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Not a Leap Year");
                }
            }
        }else{
            System.out.println("Not a Leap Year");
        }
        
    }
}
