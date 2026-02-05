package src_10.txt_before;

/**
 * カップ麺用の自販機。
 * 在庫とお湯（水量）の両方をチェックする。
 */
public class VendingHotNoodle extends VendMachine {

    // フィールド（お湯の量と、1杯あたりに必要なお湯の量）
    private int waterVolume;    // 現在のお湯量（mlなど任意の単位）
    private int requiredWater;  // 1杯あたりに必要なお湯量

    // コンストラクタ（商品名・在庫・お湯量・必要なお湯量を受け取る）
    public VendingHotNoodle(String name, int stock, int waterVolume, int requiredWater) {
        super(name, stock);
        this.waterVolume = waterVolume;
        this.requiredWater = requiredWater;
    }

    // 購入前のチェック（在庫とお湯が足りているか確認し、在庫とお湯を減らす）
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

    // カップ麺にお湯を注ぐ処理
    @Override
    protected void hotWaterServe() {
        System.out.println("お湯を注ぎます");
    }

    // カップ麺を提供する処理
    @Override
    protected void dispense() {
        System.out.println(name + "を提供します");
    }
}
