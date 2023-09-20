package Classes;

import java.util.Date;


public class NhanVien {
	private String maNV;
	private String hoTen;
	private String loaiNhanVien;
	private String cmnd;
	private String sdt;
	private Date ngayDiLam;
	private double heSoLuong;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String maNV,String hoTen, String loaiNhanVien, String cmnd, String sdt, Date ngayDiLam, double heSoLuong) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.loaiNhanVien = loaiNhanVien;
		this.cmnd = cmnd;
		this.sdt = sdt;
		this.ngayDiLam = ngayDiLam;
		this.heSoLuong = heSoLuong;

	}
	
	public String getMaNV() {
		return maNV;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public String getLoaiNhanVien() {
		return loaiNhanVien;
	}
	
	public String getCmnd() {
		return cmnd;
	}
	
	public String getSdt() {
		return sdt;
	}
	
	public Date getNgayDiLam() {
		return ngayDiLam;
	}
	
	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setLoaiNhanVien(String loaiNhanVien) {
		this.loaiNhanVien = loaiNhanVien;
	}
	
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	public void setNgayDiLam(Date ngayDiLam) {
		this.ngayDiLam = ngayDiLam;
	}
	
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	


	 
	
}

