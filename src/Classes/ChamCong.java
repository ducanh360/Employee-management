package Classes;

public class ChamCong {
		private String maNV;
		private String hoTen;
		private String loaiNhanVien;
		private int soNgayNghi;
		private double heSoLuong;
		private String ghiChu;
		
		public ChamCong() {	
		}
		
		public ChamCong(String maNV,String hoTen, String loaiNhanVien, double heSoLuong ,int soNgayNghi, String ghiChu) {
			this.maNV = maNV;
			this.hoTen = hoTen;
			this.loaiNhanVien = loaiNhanVien;
			this.heSoLuong = heSoLuong;
			this.soNgayNghi = soNgayNghi;	
			this.ghiChu = ghiChu;
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
		
		public int getSoNgayNghi() {
			return soNgayNghi;
		}
		
		public double getHeSoLuong() {
			return heSoLuong;
		}
		
		public String getGhiChu() {
			return ghiChu;
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
		
		public void setSoNgayNghi(int soNgayNghi) {
			this.soNgayNghi = soNgayNghi;
		}
		
		public void setHeSoLuong(double heSoLuong) {
			this.heSoLuong = heSoLuong;
		}
		
		public void setGhiChu(String ghiChu) {
			this.ghiChu = ghiChu;
		}
		
	}


