/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DanhSachSinhVien {

    private ArrayList<SinhVien> danhSachHocSinh;
    private Scanner sc = new Scanner(System.in);

    public DanhSachSinhVien() {
        this.danhSachHocSinh = new ArrayList<SinhVien>();
    }

    // Thêm học sinh
    public void addSinhVien(SinhVien sinhvien) {
        danhSachHocSinh.add(sinhvien);
        System.out.println("Them sinh vien thanh cong!");
    }

    // Sửa thông tin học sinh
    public void suaSinhVien(String ma, SinhVien sinhvien) {
        for (SinhVien sv : danhSachHocSinh) {
            if (sv.getMa().equals(ma)) {
                sv.setHoten(sinhvien.getHoten());
                sv.setGioitinh(sinhvien.getGioitinh());
                sv.setLop(sinhvien.getLop());
                sv.setDiem(sinhvien.getDiem());
                System.out.println("Sua thong tin sinh vien thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien can sua");
    }

    // Xóa học sinh
    public void xoaSinhVien(String ma) {
        for (SinhVien sv : danhSachHocSinh) {
            if (sv.getMa().equals(ma)) {
                danhSachHocSinh.remove(sv);
                System.out.println("Xoa thong tin sinh vien thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien can xoa");
    }

    // Tìm kiếm học sinh
    public ArrayList<SinhVien> timKiemSinhVienTheoTen(String hoten) {
        ArrayList<SinhVien> trave = new ArrayList<SinhVien>();
        for(SinhVien sv : danhSachHocSinh){
            if (sv.getHoten().equals(hoten)) { 
                trave.add(sv);  
            }
            else{
                System.out.println("Khong co ten trong danh sach sinh vien");
            }
        }
        return trave;
    }

    // Hiển thị danh sách học sinh
    public void hienThiDanhSachSinhVien() {
        System.out.println("Danh sach sinh vien:");
        int i = 0;
        
        for (SinhVien sv : danhSachHocSinh) {
            System.out.println("STT: "+i);
            System.out.println(sv.toString());i++;
        }
    }

    
}
