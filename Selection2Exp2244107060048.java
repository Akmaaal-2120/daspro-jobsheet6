import java.util.Scanner;
public class Selection2Exp2244107060048 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int angle1, angle2, angle3, totalAngle;

        System.out.print("Input angle 1 : ");
        angle1 = input15.nextInt();
        System.out.print("Input angle 2 : ");
        angle2 = input15.nextInt();
        System.out.print("Input angle 3 : ");
        angle3 = input15.nextInt();
        totalAngle = angle1 + angle2 + angle3;

        if(totalAngle == 180){
            if(angle1 == 90 || angle2 == 90 || angle3 == 90){
                System.out.println("Right Triangle");
            }else if(angle1 == angle2 && angle2 == angle3){
                System.out.println("Equilateral Triangle");
            }else if(angle1 == angle2 || angle2 == angle3 || angle3 == angle1){
                System.out.println("Isosceles Triangle");
            }else{
                System.out.println("scalene");
            }
        }else{
            System.out.println("Not a Triangle");
        }
    }
}
