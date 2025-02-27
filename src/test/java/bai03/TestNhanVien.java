package bai03;

import com.example.ThiThu03_KiemThu.bai03.NhanVien;
import com.example.ThiThu03_KiemThu.bai03.NhanVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestNhanVien {
    private  NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {
        nhanVienService = new NhanVienService();
        nhanVienService.themNV(new NhanVien("NV01", "Nam", "nam@example.com", "Hanoi", "Nhân viên", 10000000));
        nhanVienService.themNV(new NhanVien("NV02", "Linh", "linh@example.com", "Saigon", "Quản lý", 20000000));
    }

    //  Xóa NV có mã hợp lệ
    @Test
    public void testXoaNVThanhCong() {
        String exp = "Xóa NV thành công";
        String act = nhanVienService.xoaNV("NV01");
        Assertions.assertEquals(exp, act);
    }

    //  Xóa NV không tồn tại
    @Test
    public void testXoaNVKhongTonTai() {
        String exp = "Mã NV không tồn tại";
        String act = nhanVienService.xoaNV("NV99");
        Assertions.assertEquals(exp, act);
    }

    //  Xóa khi danh sách trống
    @Test
    public void testXoaNVKhiDanhSachRong() {
        nhanVienService.xoaNV("NV01");
        nhanVienService.xoaNV("NV02");
        String exp = "Không có nhân viên để xóa";
        String act = nhanVienService.xoaNV("NV03");
        Assertions.assertEquals(exp, act);
    }

    // Xóa NV với mã rỗng ""
    @Test
    public void testXoaNVVoiMaRong() {
        String exp = "Mã không hợp lệ";
        String act = nhanVienService.xoaNV("");
        Assertions.assertEquals(exp, act);
    }

    //  Xóa NV với mã null
    @Test
    public void testXoaNVVoiMaNull() {
        String exp = "Mã không hợp lệ";
        String act = nhanVienService.xoaNV(null);
        Assertions.assertEquals(exp, act);
    }

    //  Xóa NV có mã dài
    @Test
    public void testXoaNVVoiMaRatDai() {
        String exp = "Mã không hợp lệ";
        String act = nhanVienService.xoaNV("NV01234567890123456789");
        Assertions.assertEquals(exp, act);
    }

    //  Xóa NV có ký tự đặc biệt trong mã
    @Test
    public void testXoaNVVoiKyTuDacBiet() {
        String exp = "Mã không hợp lệ";
        String act = nhanVienService.xoaNV("NV@#123");
        Assertions.assertEquals(exp, act);
    }

    //  Xóa NV có tên trùng nhưng khác mã
    @Test
    public void testXoaNVCoTenTrungNhungKhacMa() {
        nhanVienService.themNV(new NhanVien("NV03", "Nam", "nam2@example.com", "Danang", "Nhân viên", 15000000));
        String exp = "Xóa NV thành công";
        String act = nhanVienService.xoaNV("NV03");
        Assertions.assertEquals(exp, act);
    }

    //  Xóa NV có mã viết hoa/thường khác nhau
    @Test
    public void testXoaNVPhanBietHoaThuong() {
        String exp = "Mã không hợp lệ";
        String act = nhanVienService.xoaNV("nv01"); // Thử với chữ thường
        Assertions.assertEquals(exp, act);
    }

    //  Gây lỗi ngoại lệ khi truyền mã null
    @Test
    public void testXoaNVThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            nhanVienService.xoaNV(null);
        });
    }
}
