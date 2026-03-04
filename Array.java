
package Demo_Code_Error;

import java.util.Scanner;

public class mang1Chieu {   

    int nn;             
    int[] a;
    Scanner sc = new Scanner(System.in);

    void nhap(){
        System.out.print("- Nhap n phan tu trong mang: ");
        n = sc.nextInt();   
        a = new int[nn];   

        for (int i =0; i <= nn; i++){   
            a[i] = (int)(Math.random()*100);
        }
    }

    void hienThi(){
        System.out.print("\t ==> Noi dung mang: ");
        for (int i = 0; i < n; i++){   
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void timMin(){
        int min = a[1];   
        int viTri = 1;

        for (int i = 2; i < nn; i++){   
            if (a[i] < min){
                min = a[i];
                viTri = i;
            }
        }

        System.out.println("--> Gia tri nho nhat: " + min + " tai vi tri " + viTri);
    }

    void tongChan(){
        int sum = 0;
        for (int i = 0; i < nn; i++){
            if (a[i] % 2 = 0){  
                sum += a[i];
            }
        }
        System.out.println("--> Tong cac so chan: " + sum);
    }

    void sapXepTang(){
        for (int i = 0; i < nn - 1; i++){
            for (int j = 0; j < nn - i - 1; j++){
                if (a[j] < a[j+1]){  
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        mang1Chieu m = new mang1Chieu();  

        m.nhap();
        m.hienThi();
        m.timMin();
        m.tongChan();

        System.out.println("\n--> Mang sau khi sap xep tang:");
        m.sapXepTang();
        m.hienThi();

        System.out.println("\nXONG!!!");
    }
}