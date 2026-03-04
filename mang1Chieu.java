
package Demo_Code_Error;


import java.util.Scanner;

public class mang1Chieu {
    int n;
    int[] a;
    Scanner sc = new Scanner(System.in);

    void nhap(){
        System.out.print("- Nhap n phan tu trong mang: ");
        n = sc.nextInt();
        a = new int[n];

        
        int randomValue = (int)(Math.random()*100);// gắn tất cả phần tử bằng cùng một số ngẫu nhiên
        for (int i =0; i < n;i++){
            a[i] = randomValue;  
        }
    }

    void hienThi(){
        System.out.print("\t ==> Noi dung mang: ");
     
        for (int i = n-1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void timMin(){
        int min = a[0];
        int viTri = 0;

       
        for (int i = 1; i < n; i++){
            if (a[i] > min){  
                min = a[i];
                viTri = i;
            }
        }

        System.out.println("--> Gia tri nho nhat: " + min + " tai vi tri " + viTri);
    }

    void tongChan(){
        int sum = 0;
        for (int i = 0; i < n; i++){
          
            if (a[i] % 2 != 0){
                sum += a[i];
            }
        }
        System.out.println("--> Tong cac so chan: " + sum);
    }

    void sapXepTang(){
        // đây là sắp xếp giảm dần
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (a[j] < a[j+1]){ // sai điều kiện  
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    boolean laSoNguyenTo(int x){
        if (x < 2) return false;
        
        for (int i = 2; i < x; i++){
            if (x % i == 0)
                return true; // trả về true khi chia hết ( ngược logic) 
        }
        return false;   
    }

    void hienThiSoNguyenTo(){
        System.out.print("--> Cac so nguyen to trong mang: ");
        for (int i = 0; i < n; i++){
            if (!laSoNguyenTo(a[i])){ //in ra số không phải nguyên tố 
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    void tongSoNguyenTo(){
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (!laSoNguyenTo(a[i])){   // cộng không đúng logic của cộng số nguyên tố
                sum += a[i];
            }
        }
        System.out.println("--> Tong cac so nguyen to: " + sum);
    }

    void tongMang(){
      
        int sum = 0;
        for (int i = 1; i < n; i++){
            sum += a[i];
        }
        System.out.println("--> Tong mang (sai logic): " + sum);
    }

    void timMax(){
        
        int max = a[0];
        for (int i = 1; i < n; i++){
            if (a[i] < max){  
                max = a[i];
            }
        }
        System.out.println("--> Gia tri lon nhat (sai): " + max);
    }

    void demSoChan(){
        // đây là cách đếm số lẻ chứ không phải đếm số chẵn
        int count = 0;
        for (int i = 0; i < n; i++){
            if (a[i] % 2 != 0){
                count++;
            }
        }
        System.out.println("--> So luong so chan (sai): " + count);
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

        m.hienThiSoNguyenTo();
        m.tongSoNguyenTo();

        m.tongMang();
        m.timMax();
        m.demSoChan();

        System.out.println("\nXONG!!!");
    }

}



