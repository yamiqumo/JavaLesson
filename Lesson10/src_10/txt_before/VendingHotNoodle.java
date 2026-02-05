package src_10.txt_before;

/**
 * カップ麺用の自販機。
 * 在庫とお湯（水量）の両方をチェックする。
 */
public class VendingHotNoodle extends VendMachine {

    private int waterVolume;    // 現在のお湯量（mlなど任意の単位）
    private int requiredWater;  // 1杯あたりに必要なお湯量

    public VendingHotNoodle(String name, int stock, int waterVolume, int requiredWater) {
        super(name, stock);
        this.waterVolume = waterVolume;
        this.requiredWater = requiredWater;
    }

    @Override
    protected boolean beforeBuy() {
        if (stock <= 0) {
            System.out.println(name + "は売り切れです");
            return false;
        }
        if (waterVolume < requiredWater) {
            System.out.println("お湯が足りません");
            return false;
        }
        stock--;
        waterVolume = waterVolume - requiredWater;
        return true;
    }

    @Override
    protected void hotWaterServe() {
        System.out.println("お湯を注ぎます");
    }

    @Override
    protected void dispense() {
        System.out.println(name + "を提供します");
    }
}
