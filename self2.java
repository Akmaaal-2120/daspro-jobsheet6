import java.util.Scanner;
public class self2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxdiscount, bookNum, category;
        maxdiscount = 0;

        System.out.print("Enter your Book Category ((1)dictionary/(2)novel/(3)other) : ");
        category = input.nextInt();
        System.out.print("Enter your Book Number  : ");
        bookNum = input.nextInt();

        if(category == 1 && (bookNum > 2 || bookNum < 2)){
            maxdiscount += 12;
            if(bookNum < 2){
                maxdiscount -= 2;
            }
        }else if(category == 2 && (bookNum > 3 || bookNum <= 3) ){
            maxdiscount += 9;
            if (bookNum <= 3) {
                maxdiscount -= 1;
            }
        }else if (category == 3 && (bookNum > 3 || bookNum < 3)){
           maxdiscount += 5;
           if (bookNum < 3) {
                maxdiscount -= 5;
           }
        }else{
            System.out.println("No Category");
        }

        System.out.println("Discount amount : " + maxdiscount + " %");

    }
}