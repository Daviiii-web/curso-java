import java.util.Locale;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {


                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                Product product = new Product();
                System.out.println("Enter product data:");
                System.out.println("Name: ");
                product.name = sc.nextLine();
                System.out.println("Price: ");
                product.price = sc.nextDouble();
                System.out.println("Quantity in stock: ");
                product.quantity = sc.nextInt();

                System.out.println();
                System.out.println("Product data: " + product.toString());

                System.out.println();
                System.out.print("Enter the numer of products to be added in stock: ");
                int quantity = sc.nextInt();
                product.addProducts(quantity);

                System.out.println();
                System.out.print("Enter the numer of products to be removed from stock: ");
                quantity = sc.nextInt();
                product.removeProducts(quantity);
                System.out.println();
                System.out.println("Updated data: " + product);

        
                




               

                 sc.close();




            }
        }



