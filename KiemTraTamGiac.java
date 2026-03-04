
package Demo_Code;


import java.util.Scanner;

public class KiemTraTamGiac {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Nhap canh a: ");
        a = sc.nextDouble();

        System.out.print("Nhap canh b: ");
        b = sc.nextDouble();

        System.out.print("Nhap canh c: ");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a){

            System.out.println("\n=> Day la TAM GIAC");

           
            if (a == b && b == c){
                System.out.println("=> Tam giac DEU");
            }

            
            else if (a*a + b*b == c*c ||
                     a*a + c*c == b*b ||
                     b*b + c*c == a*a){

                
                if (a == b || b == c || a == c){
                    System.out.println("=> Tam giac VUONG CAN");
                } else {
                    System.out.println("=> Tam giac VUONG");
                }
            }
         
            else if (a == b || b == c || a == c){
                System.out.println("=> Tam giac CAN");
            }

       
            else {
                System.out.println("=> Tam giac THUONG");
            }

        } else {
            System.out.println("\n=> Khong phai tam giac!");
        }

        System.out.println("XONG!!!");
    }
}
