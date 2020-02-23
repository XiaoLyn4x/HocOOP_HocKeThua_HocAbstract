package buiphuongnga.com.test;

import buiphuongnga.com.module.NhanVienChinhThuc;
import buiphuongnga.com.module.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1, "Teo Theo");
		teo.tinhLuong();
		NhanVienThoiVu ty = new NhanVienThoiVu(2, "Ty Me");
		ty.tinhLuong();
	}

}
