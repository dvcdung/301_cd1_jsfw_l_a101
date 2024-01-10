package com.crud.demofinal.models;

import jakarta.persistence.*;

@Entity
@Table(name="tiem_chung")
public class TiemChung {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int maTC;
	@Column(name="maKH")
	int maKH;
	@Column(name="maLieuVX")
	int maLieuVX;
	@Column(name="ngayTiem")
	String ngayTiem;
	@Column(name="ngayNhacHen")
	String ngayNhacHen;
	@Column(name="sucKhoeSauTiem")
	String sucKhoeSauTiem;
	@Column(name="danhGia")
	String danhGia;
	
	public TiemChung() {}
	
	public TiemChung(int maTC, int maKH, int maLieuVX, String ngayTiem, String ngayNhacHen, String sucKhoeSauTiem,
			String danhGia) {
		super();
		this.maTC = maTC;
		this.maKH = maKH;
		this.maLieuVX = maLieuVX;
		this.ngayTiem = ngayTiem;
		this.ngayNhacHen = ngayNhacHen;
		this.sucKhoeSauTiem = sucKhoeSauTiem;
		this.danhGia = danhGia;
	}

	@Override
	public String toString() {
		return "TiemChung [maTC=" + maTC + ", maKH=" + maKH + ", maLieuVX=" + maLieuVX + ", ngayTiem=" + ngayTiem
				+ ", ngayNhacHen=" + ngayNhacHen + ", sucKhoeSauTiem=" + sucKhoeSauTiem + ", danhGia=" + danhGia + "]";
	}

	public int getMaTC() {
		return maTC;
	}

	public void setMaTC(int maTC) {
		this.maTC = maTC;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public int getMaLieuVX() {
		return maLieuVX;
	}

	public void setMaLieuVX(int maLieuVX) {
		this.maLieuVX = maLieuVX;
	}

	public String getNgayTiem() {
		return ngayTiem;
	}

	public void setNgayTiem(String ngayTiem) {
		this.ngayTiem = ngayTiem;
	}

	public String getNgayNhacHen() {
		return ngayNhacHen;
	}

	public void setNgayNhacHen(String ngayNhacHen) {
		this.ngayNhacHen = ngayNhacHen;
	}

	public String getSucKhoeSauTiem() {
		return sucKhoeSauTiem;
	}

	public void setSucKhoeSauTiem(String sucKhoeSauTiem) {
		this.sucKhoeSauTiem = sucKhoeSauTiem;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}
	
	
}
