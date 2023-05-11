/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuongTrinhHocBong;

import SinhVien.SinhVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinhHocBong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachHocBong dshb = new DanhSachHocBong();
        int choice;
        do{
            System.out.println("\n\n0. Thoat");
            System.out.println("1. Them thong tin hoc bong");
            System.out.println("2. Sua thong tin hoc bong");
            System.out.println("3. Xoa thong tin hoc bong");
            System.out.println("4. Tim kiem thong tin bong");
            System.out.println("5. Xuat thong tin hoc bong");
            System.out.println("Moi ban chon: ");
            choice=sc.nextInt();sc.nextLine();
            
            switch (choice) {
                case 0:
                    
                    break;
                case 1:
                    System.out.print("Nhap ma so hoc bong: ");
                    String maHBThem = sc.next();
                    System.out.print("Nhap ten hoc bong: ");
                    String tenHBThem = sc.next();
                    System.out.print("Nhap tien thuong: ");
                    double tienHBThem = sc.nextDouble();
                    HocBong hbThem = new HocBong(maHBThem, tenHBThem, tienHBThem);
                    dshb.themHocBong(hbThem);                    
                    break;
                case 2:
                    System.out.print("Nhap ma so hoc bong: ");
                    String maHBSua = sc.next();
                    System.out.print("Nhap ten hoc bong: ");
                    String tenHBSua = sc.next();
                    System.out.print("Nhap tien thuong: ");
                    double tienHBSua = sc.nextDouble();
                    HocBong hbSua = new HocBong(maHBSua, tenHBSua, tienHBSua);                   
                    dshb.suaHocBong(maHBSua, hbSua);
                    break;
                case 3:
                    System.out.print("Nhap ma so hoc bong: ");
                    String maHBXoa = sc.next();
                    dshb.xoaHocBong(maHBXoa);
                    break;
                case 4:
                    System.out.print("Nhap ten hoc bong: ");
                    String tenHBTimKiem = sc.next();
                    ArrayList<HocBong> trave = new ArrayList<HocBong>();
                    dshb.timKiemHocBongTheoTen(tenHBTimKiem);
                case 5:
                    dshb.hienThiDanhSachHocBong();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        while(choice!=0);
        
       
    }
}
