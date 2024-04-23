package cuoi_ky;

import java.io.Serializable;
import java.util.Date;

public class KhamBenh extends Benh implements Serializable {
    protected Date ngayKham;
    protected String bacSi;

    public KhamBenh(String ten, Date ngaySinh, String gioiTinh, String diaChi, String soDienThoai, String maSoBHYT, String tenBenh, String trieuChung, String thuocDieuTri,double vienPhi, Date ngayKham, String bacSi) {
        super(ten, ngaySinh, gioiTinh, diaChi, soDienThoai, maSoBHYT, tenBenh, trieuChung, thuocDieuTri, vienPhi);
        this.ngayKham = ngayKham;
        this.bacSi = bacSi;
    }

    public Date getNgayKham() {
        return ngayKham;
    }

    public void setNgayKham(Date ngayKham) {
        this.ngayKham = ngayKham;
    }

    public String getBacSi() {
        return bacSi;
    }

    public void setBacsi(String bacsi) {
        this.bacSi = bacsi;
    }
    
    private static final long serialVersionUID = 1L;
}