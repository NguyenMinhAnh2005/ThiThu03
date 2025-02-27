package bai01;

import com.example.ThiThu03_KiemThu.bai01.TongHaiSo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTongHaiSo {
    @Test
    void testTongChan() {
        assertTrue(TongHaiSo.tongChan(2, 4));  //Cả hai số là chẵn → tổng luôn chẵn
        assertTrue(TongHaiSo.tongChan(0, 8));  //0 là số chẵn → tổng vẫn chẵn
        assertTrue(TongHaiSo.tongChan(-2, -4));  //Số âm nhưng vẫn là số chẵn → tổng chẵn
        assertFalse(TongHaiSo.tongChan(3, 4));  //Một số lẻ + một số chẵn → tổng lẻ
        assertTrue(TongHaiSo.tongChan(1, 3)); //Cả hai số là lẻ → tổng chẵn
    }
}
