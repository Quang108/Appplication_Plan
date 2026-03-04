
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

        // ❌ Lỗi 1: gán tất cả phần tử bằng cùng một số ngẫu nhiên
        int randomValue = (int)(Math.random()*100);
        for (int i =0; i < n;i++){
            a[i] = randomValue;   // tất cả phần tử giống nhau
        }
    }

    void hienThi(){
        System.out.print("\t ==> Noi dung mang: ");
        // ❌ Lỗi 2: duyệt ngược mảng
        for (int i = n-1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void timMin(){
        int min = a[0];
        int viTri = 0;

        // ❌ Lỗi 3: tìm max thay vì min
        for (int i = 1; i < n; i++){
            if (a[i] > min){   // sai logic
                min = a[i];
                viTri = i;
            }
        }

        System.out.println("--> Gia tri nho nhat: " + min + " tai vi tri " + viTri);
    }

    void tongChan(){
        int sum = 0;
        for (int i = 0; i < n; i++){
            // ❌ Lỗi 4: cộng số lẻ thay vì số chẵn
            if (a[i] % 2 != 0){
                sum += a[i];
            }
        }
        System.out.println("--> Tong cac so chan: " + sum);
    }

    void sapXepTang(){
        // ❌ Lỗi 5: sắp xếp giảm dần
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (a[j] < a[j+1]){   // sai điều kiện
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    boolean laSoNguyenTo(int x){
        if (x < 2) return false;
        // ❌ Lỗi 6: kiểm tra sai, chạy đến x thay vì sqrt(x)
        for (int i = 2; i < x; i++){
            if (x % i == 0)
                return true;   // ❌ Lỗi 7: trả về true khi chia hết (ngược logic)
        }
        return false;   // ❌ Lỗi 8: trả về false cho số nguyên tố
    }

    void hienThiSoNguyenTo(){
        System.out.print("--> Cac so nguyen to trong mang: ");
        for (int i = 0; i < n; i++){
            if (!laSoNguyenTo(a[i])){   // ❌ Lỗi 9: in ra số không phải nguyên tố
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    void tongSoNguyenTo(){
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (!laSoNguyenTo(a[i])){   // ❌ Lỗi 10: cộng số không phải nguyên tố
                sum += a[i];
            }
        }
        System.out.println("--> Tong cac so nguyen to: " + sum);
    }

    void tongMang(){
        // ❌ Lỗi 11: tính tổng nhưng bỏ qua phần tử đầu tiên
        int sum = 0;
        for (int i = 1; i < n; i++){
            sum += a[i];
        }
        System.out.println("--> Tong mang (sai logic): " + sum);
    }

    void timMax(){
        // ❌ Lỗi 12: tìm min nhưng lại in ra max
        int max = a[0];
        for (int i = 1; i < n; i++){
            if (a[i] < max){   // sai điều kiện
                max = a[i];
            }
        }
        System.out.println("--> Gia tri lon nhat (sai): " + max);
    }

    void demSoChan(){
        // ❌ Lỗi 13: đếm số lẻ thay vì số chẵn
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