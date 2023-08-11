# PROJECT-QLSV-JAVASWING-MSSQL
sử dụng javaswing và mssql để tạo ra 1 giao diện quản lý sinh viên
cách chạy 
VỀ PHÍA SQL
- bước 1 sử dụng "SQL Server Management Studio Management Studio 19" và cài đặt cấu hình (login sa và password 12345)
  ![image](https://github.com/hiepnx03/PROJECT-QLSV-JAVASWING-MSSQL/assets/71397941/8db72424-9d4c-42db-bd01-71ca82ce48a0)
  và chạy file QUANLYSINHVIEN.sql để tạo database
- bước 2 sử dụng "SQL Server 2022 Configuration Manager" đổi cổng TCP/IP thành tất cả Port 1433 
  ![image](https://github.com/hiepnx03/PROJECT-QLSV-JAVASWING-MSSQL/assets/71397941/df521cf9-af74-4210-8c56-cc7df830bdef)
VỀ PHÍA JAVA 
- Bước 1 ở INTELLJ IDEA vào mục database bên phải màn hình ![image](https://github.com/hiepnx03/PROJECT-QLSV-JAVASWING-MSSQL/assets/71397941/fc16a6eb-b1cb-41c0-996d-a66f5fa11171)

thêm các nguồn của MSSQL như 
name DANGKI@DESKTOP-4EQTCIB 
Host DESKTOP-4EQTCIB 
Port 1433
User sa 
Password 12345
Nó trả về 1 đường link Url ta sẽ tận dụng đường link đó để kết nối code với mssql
- Bước 2 chạy file Login và nhập Tài Khoản "admin" Mật Khẩu "12345"
  Kết Quả ![image](https://github.com/hiepnx03/PROJECT-QLSV-JAVASWING-MSSQL/assets/71397941/93b1a54a-9e4d-45cd-9f1a-6613fc3bb573)
lúc đăng nhập thành công
![image](https://github.com/hiepnx03/PROJECT-QLSV-JAVASWING-MSSQL/assets/71397941/6a303a24-ed9e-4d4b-af35-7116c98772d6)
Các chức năng Thêm Sửa Xóa Tìm sinh viên và thao tác thoát , làm trống 
