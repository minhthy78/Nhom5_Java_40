/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuongTrinhHocBong;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HocBong {
    
    private String mahocbong;
    private String tenhocbong;
    private double tienthuong;
    Scanner sc = new Scanner(System.in);
    public HocBong() {
    }

    public HocBong(String mahocbong, String tenhocbong, double tienthuong) {
        this.mahocbong = mahocbong;
        this.tenhocbong = tenhocbong;
        this.tienthuong = tienthuong;
    }

    public String getMahocbong() {
        return mahocbong;
    }

    public String getTenhocbong() {
        return tenhocbong;
    }

    public double getTienthuong() {
        return tienthuong;
    }


    public void setMahocbong(String mahocbong) {
        this.mahocbong = mahocbong;
    }

    public void setTenhocbong(String tenhocbong) {
        this.tenhocbong = tenhocbong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }


    @Override
    public String toString() {
        return "ChuongTrinhHocBong: {" + "mahocbong=" + mahocbong + ", tenhocbong=" + tenhocbong + ", tienthuong=" + tienthuong + '}';
    }
    
    

}
