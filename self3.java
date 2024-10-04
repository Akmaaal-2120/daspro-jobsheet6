import java.util.Scanner;
public class self3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int brand, size, price;
        String category;
        price = 0;

        System.out.print("Enter your brand ((1)converse,(2)Sketcher,(3)Nike) : ");
        brand = input.nextInt();
        input.nextLine();
        System.out.print("Enter your category : ");
        category = input.nextLine().toLowerCase();
        System.out.print("Enter your size 1.36-40 2.40-44 3.36-41 4.41-44 : ");
        size = input.nextInt();

        if(brand == 1){
            switch (category) {
                case "slip on":
                    if(size == 1){
                        price = 800000;
                    }
                    
                    break;
                case "high top":
                    if(size == 2){
                        price = 1200000;
                    }
                    break;
                default:
                    break;
            }
        }else if (brand == 2){
            switch (category) {
                case "woman":
                    if(size == 3){
                        price = 1000000;
                    }
                    
                    break;
                case "man":
                    if(size == 4){
                        price = 1800000;
                    }
                    break;
                default:
                    break;
            }
            

        }else if (brand == 3){
            switch (category) {
                case "kids":
                    if(size == 1){
                        price = 750000;
                    }
                    
                    break;
                case "adult":
                    if(size == 2){
                        price = 1500000;
                    }
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("No Brand selected");
        }
        System.out.println("The price of your shoe is : " + price);


    }
}