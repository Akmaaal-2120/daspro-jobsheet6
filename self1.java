import java.util.Scanner;
public class self1 {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, max;

        System.out.print("Enter num1 : ");
        num1 = input.nextInt();
         System.out.print("Enter num2 : ");
        num2 = input.nextInt();
        System.out.print("Enter num3 : ");
        num3 = input.nextInt();

        if (num1 > num2){
            if(num1 > num3){
                System.out.println("Max number is : " + num1);
            }else{
                System.out.println("Max number is : " + num3);
            }
        }else{
            if(num2 > num3){
                System.out.println("Max number is : " + num2);
            }else{
                System.out.println("Max number is : " + num3);
            }
        }
    }   

    
}