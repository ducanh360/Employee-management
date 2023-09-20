package Classes;

public class TienLuong {
		private String maNV;
		private String hoTen;
		private String loaiNhanVien;
		private int soNgayNghi;
		private int tien;
		
		public TienLuong() {	
		}
		
		public TienLuong(String maNV,String hoTen, String loaiNhanVien, int soNgayNghi, int tien) {
			this.maNV = maNV;
			this.hoTen = hoTen;
			this.loaiNhanVien = loaiNhanVien;
			this.soNgayNghi = soNgayNghi;
			this.tien = tien;
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
		
		public int getTien() {
			return tien;
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
		
		public void setTien(int tien) {
			this.tien = tien;
		}
		
	}


