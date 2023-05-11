/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuongTrinhHocBong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DanhSachHocBong {

    private ArrayList<HocBong> danhSachHocBong;
    private Scanner sc = new Scanner(System.in);

    public DanhSachHocBong() {
        this.danhSachHocBong = new ArrayList<HocBong>();
    }

    // Thêm học bổng
    public void themHocBong(HocBong hocbong) {
        danhSachHocBong.add(hocbong);
        System.out.println("Them hoc bong thanh cong!");
    }

    // Sửa thông tin học bổng
    public void suaHocBong(String mahocbong, HocBong hocbong) {
        for (HocBong hb : danhSachHocBong) {
            if (hb.getMahocbong().equals(mahocbong)) {
                hb.setTenhocbong(hocbong.getTenhocbong());
                hb.setTienthuong(hocbong.getTienthuong());
                System.out.println("Sua thong tin hoc bong thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay hoc bong can sua");
    }

    // Xóa học sinh
    public void xoaHocBong(String mahocbong) {
        for (HocBong hb : danhSachHocBong) {
            if (hb.getMahocbong().equals(mahocbong)) {
                danhSachHocBong.remove(hb);
                System.out.println("Xoa thong tin hoc bong thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay hoc bong can xoa");
    }

    // Tìm kiếm học sinh
    public ArrayList<HocBong> timKiemHocBongTheoTen(String tenhocbong) {
        ArrayList<HocBong> trave = new ArrayList<HocBong>();
        for (HocBong hb : danhSachHocBong) {
            if (hb.getTenhocbong().equals(tenhocbong)) {
                trave.add(hb);
            } else {
                System.out.println("Khong co loai hoc bong nao trong danh sach hoc bong");
            }
        }
        return trave;
    }

    // Hiển thị danh sách học sinh
    public void hienThiDanhSachHocBong() {
        System.out.println("Danh sach hoc bong:");
        int i = 0;

        for (HocBong hb : danhSachHocBong) {
            System.out.println("STT: " + i);
            System.out.println(hb.toString());
            i++;
        }
    }

    //Kiem tra dieu kien duy tri
    public String dieukienduytri(float diem) {
        if (diem >= 8.0) {
            return "Hoc sinh gioi";
        } else if (diem >= 6.5 && diem < 8.0) {
            return "Hoc sinh kha";
        } else {
            return "Khong duoc cap hoc bong";
        }
    }

}
