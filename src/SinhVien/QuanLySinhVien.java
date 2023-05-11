/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choice;
        do{
            System.out.println("\n\n0. Thoat");
            System.out.println("1. Them thong tin sinh vien");
            System.out.println("2. Sua thong tin sinh vien");
            System.out.println("3. Xoa thong tin sinh vien");
            System.out.println("4. Tim kiem thong tin sinh vien");
            System.out.println("5. Xuat thong tin sinh vien");
            System.out.println("Moi ban chon: ");
            choice=sc.nextInt();sc.nextLine();
            
            switch (choice) {
                case 0:
                    
                    break;
                case 1:
                    System.out.print("Nhap ma so sinh vien: ");
                    String maThem = sc.next();
                    System.out.print("Nhap ho ten sinh vien: ");
                    String hotenThem = sc.next();
                    System.out.print("Nhap gioi tinh sinh vien: ");
                    String gioitinhThem = sc.next();
                    System.out.print("Nhap lop sinh vien: ");
                    String lopThem = sc.next();
                    System.out.print("Nhap diem sinh vien: ");
                    float diemThem = sc.nextFloat();
                    SinhVien svThem = new SinhVien(maThem, hotenThem, gioitinhThem, lopThem, diemThem);
                    dssv.addSinhVien(svThem);                    
                    break;
                case 2:
                    System.out.print("Nhap ma so sinh vien: ");
                    String maSua = sc.next();
                    System.out.print("Nhap ho ten sinh vien: ");
                    String hotenSua = sc.next();
                    System.out.print("Nhap gioi tinh sinh vien: ");
                    String gioitinhSua = sc.next();
                    System.out.print("Nhap lop sinh vien: ");
                    String lopSua = sc.next();
                    System.out.print("Nhap diem sinh vien: ");
                    float diemSua = sc.nextFloat();
                    SinhVien svSua = new SinhVien(maSua, hotenSua, gioitinhSua, lopSua, diemSua);
                    dssv.suaSinhVien(maSua, svSua);
                    break;
                case 3:
                    System.out.print("Nhap ma so sinh vien: ");
                    String maXoa = sc.next();
                    dssv.xoaSinhVien(maXoa);
                    break;
                case 4:
                    System.out.print("Nhap ho ten sinh vien: ");
                    String hotenTimKiem = sc.next();
                    ArrayList<SinhVien> trave = new ArrayList<SinhVien>();
                    dssv.timKiemSinhVienTheoTen(hotenTimKiem);
                case 5:
                    dssv.hienThiDanhSachSinhVien();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        while(choice!=0);
        
       
    }
    
}
