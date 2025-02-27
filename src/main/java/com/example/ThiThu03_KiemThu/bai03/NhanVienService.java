package com.example.ThiThu03_KiemThu.bai03;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> listNhanVien = new ArrayList<>();

    // ✅ Thêm nhân viên
    public String themNV(NhanVien nhanVien) {
        if (nhanVien.getMaNV().startsWith("NV")) {
            listNhanVien.add(nhanVien);
            return "Thêm NV thành công";
        } else {
            return "Thêm mã NV phải bắt đầu bằng NV";
        }
    }

    // ✅ Xóa nhân viên theo mã NV
    public String xoaNV(String maNV) {
        if (maNV == null || maNV.isEmpty() || maNV.length() > 10 || !maNV.matches("NV\\d+")) {
            return "Mã không hợp lệ";
        }
        if (listNhanVien.isEmpty()) {
            return "Không có nhân viên để xóa";
        }
        for (NhanVien nv : listNhanVien) {
            if (nv.getMaNV().equals(maNV)) {
                listNhanVien.remove(nv);
                return "Xóa NV thành công";
            }
        }
        return "Mã NV không tồn tại";
    }
}
