/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SinhVien {

    private String ma;
    private String hoten;
    private String gioitinh;
    private String lop;
    float diem;
    static Scanner sc = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(String ma, String hoten, String gioitinh, String lop, float diem) {
        this.ma = ma;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.lop = lop;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getLop() {
        return lop;
    }

    public float getDiem() {
        return diem;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien: {" + "ma=" + ma + ", hoten=" + hoten + ", gioitinh=" + gioitinh + ", lop=" + lop + ", diem=" + diem + '}';
    }

}
