
package Demo_Code;

import java.util.Scanner;
public class mang1Chieu_Fixed {
    int n;
    int[] a;
    Scanner sc = new Scanner(System.in);
    void nhap(){
        System.out.print("- Nhap n phan tu trong mang: ");
        n = sc.nextInt();
        a = new int[n];
        
        for (int i =0; i < n;i++){
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
        int min = a[0];
        int viTri = 0;

        for (int i = 1; i < n; i++){
            if (a[i] < min){
                min = a[i];
                viTri = i;
            }
        }

        System.out.println("--> Gia tri nho nhat: " + min + " tai vi tri " + viTri);
    }

   
    void tongChan(){
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (a[i] % 2 == 0){
                sum += a[i];
            }
        }
        System.out.println("--> Tong cac so chan: " + sum);
    }

    
    void sapXepTang(){
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    boolean laSoNguyenTo(int x){
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0)
                return false;
        }
        return true;
    }

   
    void hienThiSoNguyenTo(){
        System.out.print("--> Cac so nguyen to trong mang: ");
        for (int i = 0; i < n; i++){
            if (laSoNguyenTo(a[i])){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

   
    void tongSoNguyenTo(){
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (laSoNguyenTo(a[i])){
                sum += a[i];
            }
        }
        System.out.println("--> Tong cac so nguyen to: " + sum);
    }
    public static void main(String[] args) {
        mang1Chieu_Fixed m = new mang1Chieu_Fixed();
        m.nhap();
        m.hienThi();

        m.timMin();
        m.tongChan();

        System.out.println("\n--> Mang sau khi sap xep tang:");
        m.sapXepTang();
        m.hienThi();

        m.hienThiSoNguyenTo();
        m.tongSoNguyenTo();

        System.out.println("\nXONG!!!");
    }
}

