package javaprj;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Quanlisp ql = new Quanlisp();
        Scanner sc = new Scanner(System.in);

        ql.themsp(new sanpham(1, "Laptop Dell", "Điện tử", 15000, "Laptop", 5));
        ql.themsp(new sanpham(2, "iPhone", "Điện tử", 20000, "Apple", 10));
        ql.themsp(new sanpham(3, "Áo thun", "Quần áo", 1000, "Áo cotton", 50));

        while (true) {
            System.out.println("\n=== MENU QUẢN LÝ SẢN PHẨM ===");
            System.out.println("1. Cập nhật sản phẩm");
            System.out.println("2. Hiển thị sản phẩm theo giá");
            System.out.println("3. Hiển thị sản phẩm theo danh mục");
            System.out.println("4. Tính tổng giá trị tồn kho theo danh mục");
            System.out.println("5. Giảm giá sản phẩm");
            System.out.println("6. Đặt hàng");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập ID sản phẩm: ");
                    int id1 = sc.nextInt();
                    System.out.print("Nhập giá mới: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhập mô tả mới: ");
                    String mota = sc.nextLine();
                    ql.capnhatsp(id1, gia, mota);
                    break;
                case 2:
                    ql.hienthitheogia();
                    break;
                case 3:
                    System.out.print("Nhập danh mục: ");
                    String dm = sc.nextLine();
                    ql.hienthidanhmuc(dm);
                    break;
                case 4:
                    System.out.print("Nhập danh mục: ");
                    String dm2 = sc.nextLine();
                    ql.tinhtong(dm2);
                    break;
                case 5:
                    System.out.print("Nhập ID sản phẩm: ");
                    int id2 = sc.nextInt();
                    System.out.print("Nhập % giảm giá: ");
                    double pt = sc.nextDouble();
                    ql.giamgia(id2, pt);
                    break;
                case 6:
                    System.out.print("Nhập ID sản phẩm: ");
                    int id3 = sc.nextInt();
                    System.out.print("Nhập số lượng đặt: ");
                    int sl = sc.nextInt();
                    ql.dathang(id3, sl);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

