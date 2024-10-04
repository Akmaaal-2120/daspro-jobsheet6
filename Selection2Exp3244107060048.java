import java.util.Scanner;
public class Selection2Exp3244107060048 {
    public static void main(String[] args) {
        Scanner input244107060048 = new Scanner(System.in);
        String category;
        int income, netSalary;
        double tax = 0;

        System.out.print("Input Categoty : ");
        category = input244107060048.nextLine();
        System.out.print("Input Income : ");
        income = input244107060048.nextInt();

        if (category.equalsIgnoreCase("worker")){
            if(income <= 2000000){
                tax = 0.1;
            }else if (income <= 3000000){
                tax = 0.15;
            }else{
                tax = 0.2;
            }
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett salary = " + netSalary);

        }else if (category.equalsIgnoreCase("businessman")){
            if(income <= 2500000){
                tax = 0.15;
            }else if (income <= 3500000){
                tax = 0.2;
            }else{
                tax = 0.25;
            }
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett salary = " + netSalary);
        }else{
            System.out.println("Invalid category");
        }
    }
}
