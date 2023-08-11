import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Databasecontroller {
    private Connection conn;
    public Databasecontroller() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-4EQTCIB\\SQLEXPRESS:1433;databaseName=QUANLYSINHVIEN;encrypt=true;trustServerCertificate=true;";
            String user = "sa";
            String pass = "12345";
            conn = DriverManager.getConnection(dbURL, user, pass);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /////// hiển thị bảng
    public ArrayList<SinhVien> getListSV(){
        ArrayList<SinhVien> list = new ArrayList<>();
        String sql="SELECT * FROM [QUANLYSINHVIEN].[dbo].[Student]";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                SinhVien n = new SinhVien();
                n.setId(rs.getInt("ID"));
                n.setMasinhvien(rs.getString("Mã Sinh Viên"));
                n.setHovaten(rs.getString("Họ Và Tên"));
                n.setNgaysinh(rs.getString("Ngày Sinh"));
                n.setGioitinh(rs.getString("Giới Tính"));
                n.setSodienthoai(rs.getString("Số Điện Thoại"));
                n.setDiachi(rs.getString("Địa Chỉ"));
                list.add(n);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    /////////// Thêm Sinh Viên
    public void ThemSV(SinhVien sv){
        String sql="INSERT INTO [QUANLYSINHVIEN].[dbo].[Student] ( [Mã Sinh Viên], [Họ Và Tên], [Ngày Sinh], [Giới Tính], [Số Điện Thoại], [Địa Chỉ]) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,sv.getMasinhvien());
            ps.setString(2,sv.getHovaten());
            ps.setString(3,sv.getNgaysinh());
            ps.setString(4,sv.getGioitinh());
            ps.setString(5,sv.getSodienthoai());
            ps.setString(6,sv.getDiachi());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    ////////// XÓA SINH VIEN
    public void XoaSV(int id){
        String sql="DELETE FROM [QUANLYSINHVIEN].[dbo].[Student] WHERE  [ID] = (?)";
        try{
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /////////////////////// TÌM THÔNG TIN SINH VIÊN
    public ArrayList<SinhVien> TimSV(String Name) {
        ArrayList<SinhVien> list = new ArrayList<>();
        String sql = "SELECT * FROM [QUANLYSINHVIEN].[dbo].[Student] WHERE [Họ Và Tên] LIKE ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + Name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien n = new SinhVien();
                n.setId(rs.getInt("ID"));
                n.setMasinhvien(rs.getString("Mã Sinh Viên"));
                n.setHovaten(rs.getString("Họ Và Tên"));
                n.setNgaysinh(rs.getString("Ngày Sinh"));
                n.setGioitinh(rs.getString("Giới Tính"));
                n.setSodienthoai(rs.getString("Số Điện Thoại"));
                n.setDiachi(rs.getString("Địa Chỉ"));
                list.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    /////////////////////
    public static void main(String[] args) {
        new Databasecontroller();
    }
}
