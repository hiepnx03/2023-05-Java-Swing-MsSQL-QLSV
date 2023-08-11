public class SinhVien {
    private int id;
    private String masinhvien,hovaten,ngaysinh,gioitinh,sodienthoai,diachi;

    public SinhVien() {
    }

    public SinhVien(String masinhvien, String hovaten, String ngaysinh, String gioitinh, String sodienthoai, String diachi) {
        this.masinhvien = masinhvien;
        this.hovaten = hovaten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
    }

    public SinhVien(int id, String masinhvien, String hovaten, String ngaysinh, String gioitinh, String sodienthoai, String diachi) {
        this.id = id;
        this.masinhvien = masinhvien;
        this.hovaten = hovaten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void getGioitinh(String gt) {
    }
}
