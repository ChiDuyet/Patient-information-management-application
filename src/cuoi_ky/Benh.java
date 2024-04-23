package cuoi_ky;

import java.io.Serializable;
import java.util.Date;

public class Benh extends BenhNhan implements Serializable {
    protected String tenBenh;
    protected String trieuChung;
    protected String thuocDieuTri;
    protected double vienPhi;

    public Benh(String ten, Date ngaySinh, String gioiTinh, String diaChi, String soDienThoai, String maSoBHYT, String tenBenh, String trieuChung, String thuocDieuTri, double vienPhi) {
        super(ten, ngaySinh, gioiTinh, diaChi, soDienThoai, maSoBHYT);
        this.tenBenh = tenBenh;
        this.trieuChung = trieuChung;
        this.thuocDieuTri = thuocDieuTri;
        this.vienPhi = vienPhi;
    }

    public String getTenBenh() {
        return tenBenh;
    }

    public void setTenBenh(String tenBenh) {
        this.tenBenh = tenBenh;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getThuocDieuTri() {
        return thuocDieuTri;
    }

    public void setThuocDieuTri(String thuocDieuTri) {
        this.thuocDieuTri = thuocDieuTri;
    }

    public double getVienPhi() {
        return vienPhi;
    }

    public void setVienPhi(double vienPhi) {
        this.vienPhi = vienPhi;
    }
    
    private static final long serialVersionUID = 1L;
}