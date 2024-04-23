package cuoi_ky;

import java.io.Serializable;
import java.util.Date;

public class BenhNhan implements Serializable {
    protected String ten;
    protected Date ngaySinh;
    protected String gioiTinh;
    protected String diaChi;
    protected String soDienThoai;
    protected String maSoBHYT;

    public BenhNhan(String ten, Date ngaySinh, String gioiTinh, String diaChi, String soDienThoai, String maSoBHYT) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.maSoBHYT = maSoBHYT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMaSoBHYT() {
        return maSoBHYT;
    }

    public void setMaSoBHYT(String maSoBHYT) {
        this.maSoBHYT = maSoBHYT;
    }
    
    private static final long serialVersionUID = 1L;
}