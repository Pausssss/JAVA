package javaprj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Quanlisp {
    private List<sanpham> sanphams = new ArrayList<>();

    public void themsp(sanpham sp) {
        sanphams.add(sp);
    }

    public void capnhatsp(int id, double newGia, String newMota) {
        for (sanpham sp : sanphams) {
            if (sp.getId() == id) {
            	sp.setMota(newMota);
                sp.setGia(newGia);
                System.out.println("Cập nhật thành công cho sản phẩm ID: " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
    }

    public void hienthidanhmuc(String danhmuc) {
        sanphams.stream()
                .filter(sp -> sp.getDanhmuc().equalsIgnoreCase(danhmuc))
                .forEach(System.out::println);
    }

    public void hienthitheogia() {
        sanphams.stream()
                .sorted(Comparator.comparingDouble(sanpham::getGia))
                .forEach(System.out::println);
    }

    public void tinhtong(String danhmuc) {
        double total = sanphams.stream()
                .filter(sp -> sp.getDanhmuc().equalsIgnoreCase(danhmuc))
                .mapToDouble(sp -> sp.getGia() * sp.getSoluong())
                .sum();
        System.out.println("Tổng giá trị tồn kho danh mục " + danhmuc + " = " + total);
    }

    public void giamgia(int id, double percent) {
        for (sanpham sp : sanphams) {
            if (sp.getId() == id) {
                double newGia = sp.getGia() * (1 - percent / 100);
                sp.setGia(newGia);
                System.out.println("Đã giảm " + percent + "% giá sản phẩm ID " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
    }

    public void dathang(int id, int soluong) {
        for (sanpham sp : sanphams) {
            if (sp.getId() == id) {
                if (soluong <= sp.getSoluong()) {
                    double tongTien = soluong * sp.getGia();
                    sp.setSoluong(sp.getSoluong() - soluong);
                    System.out.println("Đặt hàng thành công! Tổng tiền: " + tongTien);
                } else {
                    System.out.println("Không đủ số lượng tồn kho!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
    }
}
