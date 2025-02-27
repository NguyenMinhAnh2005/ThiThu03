package com.example.ThiThu03_KiemThu.bai02;
//kiểm tra số nguyên âm trong dãy số - 5, 6, -7, -9, 0, -1
public class SoNguyenAm {
    public static boolean SoNguyen(int[] so) {
//        Duyệt qua từng số trong mảng.
//        Nếu có số nào < 0, trả về true.
//        Nếu không có số nào âm, trả về false.
        for (int num : so) {
            if (num < 0) return true;
        }
        return false;
    }
}
