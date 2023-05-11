/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChonGiaoDien;
import SinhVien.QuanLySinhVien;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLyHoSoHocBong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n\n0. Thoat");
            System.out.println("1. Quan ly sinh vien");
            System.out.println("2. Chuong trinh hoc bong");
            System.out.println("3. Xuat quan ly ho so");
            choice=sc.nextInt();sc.nextLine();
            
            switch (choice) {
                case 1:
                    QuanLySinhVien.main(args);
                    break;
                case 2:
                    ChuongTrinhHocBong.ChuongTrinhHocBong.main(args);
                    break; 
                case 3:
                    
                    break;
                default:
                    System.out.println("Ban nhap sai yeu cau");
            }
        }
        while(choice!=0);
    }
}
