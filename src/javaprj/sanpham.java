package javaprj;

public class sanpham {
    private int id;
    private String ten;
    private String mota;
    private double gia;
    private String danhmuc;
    private int soluong;

    public sanpham(int id, String ten, String mota, double gia, String danhmuc, int soluong) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.gia = gia;
        this.danhmuc = danhmuc;
        this.soluong = soluong;
    }
    
    public int getId() {
        return id;
    }
    public String getTen() {
        return ten;
    }
    public String getMota() {
        return mota;
    }
    public double getGia() {
        return gia;
    }
    public String getDanhmuc() {
        return danhmuc;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setGia(double newGia) {
        this.gia = newGia;
    }
    public void setMota(String newMota) {
        this.mota = newMota;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return id + " - " + ten + " | Danh mục: " + danhmuc + " | Giá: " + gia + " | SL: " + soluong + " | Mô tả:" + mota;
    }
}
