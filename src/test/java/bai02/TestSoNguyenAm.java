package bai02;
import static org.junit.jupiter.api.Assertions.*;
import com.example.ThiThu03_KiemThu.bai02.SoNguyenAm;
import org.junit.jupiter.api.Test;

public class TestSoNguyenAm {
   @Test
    void testSoNguyen(){
       assertTrue(SoNguyenAm.SoNguyen(new int[]{-5, 6, -7, -9, 0, -1}));//Có số âm trong mảng
       assertFalse(SoNguyenAm.SoNguyen(new int[]{1, 2, 3, 4}));//Không có số âm
       assertTrue(SoNguyenAm.SoNguyen(new int[]{-1}));//Mảng chỉ có một số âm
       assertFalse(SoNguyenAm.SoNguyen(new int[]{}));//Không có số nào nên không có số âm
       assertTrue(SoNguyenAm.SoNguyen(new int[]{-5, -6, -7}));//Toàn bộ mảng là số âm
   }
}
