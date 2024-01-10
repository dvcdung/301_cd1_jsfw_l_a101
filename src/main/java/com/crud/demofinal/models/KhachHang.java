package com.crud.demofinal.models;

import jakarta.persistence.*;

@Entity
@Table(name="khach_hang")
public class KhachHang {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int maKH;
	@Column(name="hoTen")
	private String hoTen;
	@Column(name="ngaySinh")
	private String ngaySinh;
	@Column(name="cmnd")
	private String cmnd;
	@Column(name="soDienThoai")
	private String soDienThoai;
	@Column(name="diaChi")
	private String diaChi;
	@Column(name="email")
	private String email;
	
	public KhachHang() {}
		
	public KhachHang(int maKH, String hoTen, String ngaySinh, String cmnd, String soDienThoai, String diaChi, String email) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.cmnd = cmnd;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.email = email;
	}


	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", cmnd=" + cmnd
				+ ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", email=" + email + "]";
	}

	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
