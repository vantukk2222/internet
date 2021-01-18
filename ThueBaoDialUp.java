package baitapquanlythuebao;
 
public class ThueBaoDialUp extends ThueBao {
    private static int THUE_BAO_HANG_THANG = 30000;
    private static int DON_GIA_PHUT = 30;
    private int soPhutTruyCap;
     
    public ThueBaoDialUp() {
        super();
    }
 
    public ThueBaoDialUp(int soPhutTruyCap) {
        super();
        this.soPhutTruyCap = soPhutTruyCap;
    }
 
    @Override
    public long tinhTien() {
        return THUE_BAO_HANG_THANG + DON_GIA_PHUT * soPhutTruyCap;
    }
     
    @Override
    public String toString() {
        return "Thuê bao Dial Up có thuê bao hằng tháng = " + this.THUE_BAO_HANG_THANG + 
            ", đơn giá phút = " + this.DON_GIA_PHUT + "/phút" + 
            ", số phút truy cập = " + this.soPhutTruyCap + ", tổng tiền = " + tinhTien();
    }
 
}
