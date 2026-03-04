
package Demo_Code;
import java.util.Scanner;
class Node{
    int data;
    Node next = null;
    Node(int x){
        data = x;
        next = null;
    }
    Node(int x, Node t){
        data = x;
        next = t;
    }
    public String toString(){
        String t = "" + data + "";
        return t;
    }
}
public class DSLK_Don {
    Scanner sc = new Scanner(System.in);
    Node head = null;
     void nhap(){
        int x; 
        Node last = null;
        head = null;
        while (true){
            System.out.print("\t <+> Nhap x (>0): ");
            x = sc.nextInt();
            if (x == 0) break;
            Node t = new Node(x);
            if (head == null){
                head = last = t;
            } else {
                last.next = t;
                last = t;
            }
            
        }
    }
    void display(){
        Node p = head;
        System.out.print("\t >>> Noi dung danh sach la: \n ===> " );
        while (p!= null){
            System.out.print(p + " -> ");
            p = p.next;
        }
        System.out.println("NULL \n");
    }
    
    
    void tongSoLe(){
        int sum =0;
        Node p = head;
        while(p != null){
            if (p.data % 2 != 0){
                sum+= p.data;
            }
            p = p.next;
        }
        System.out.println("<##> Tong so le trong danh sach: " + sum);
    }
    
    void daoDanhSach(){
        // p = “Node hiện tại” (Node đang xử lý)
        //q = “Node tiếp theo”
        // t = “Danh sách đã đảo xong” (Node trước đó)
        // (t = prev, p = curr, q = next)
        Node t = null;
        Node p = head;
        while(p!= null){
            Node q = p.next;
            p.next = t;
            t = p;
            p = q;
        }
        head = t;
    }
    
    void xoaSoChan(){
        while (head != null && head.data % 2 == 0){
            head = head.next;
        }
        Node p = head;
        while(p!= null && p.next != null){
            if (p.next.data % 2 == 0){
                p.next = p.next.next;
                
            } else {
                p = p.next;
            }
        }
    }
    
    void demDoanTang(){
        int count = 1;
        Node p = head;
        while(p.next!= null){
            if(p.next.data <= p.data){
                count++;
            }
            p = p.next;
        }
        System.out.println("<##> So doan tang dan trong danh sach: " + count);
    }
  
    void sapXepTaNg(){
        Node p = head;
        while(p!= null){
            Node q = p.next;
            while(q!= null){
                if (p.data > q.data){
                    int t = p.data;
                    p.data = q.data;
                    q.data = t;
                }
                q = q.next;
            }
            p = p.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSLK_Don L = new DSLK_Don();
        L.nhap();
        L.display();
        L.demDoanTang();
        L.tongSoLe();
        
        System.out.println("--> Danh sach sau khi dao nguoc: ");
        L.daoDanhSach();
        L.display();
     
        System.out.println("--> Danh sach sau khi Sap xep tang: ");
        L.sapXepTaNg();
        L.display();
        
    }
}
