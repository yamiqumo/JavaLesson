package src_10.txt_before;

/**
 * 自販機の動作確認用 main。
 * - 2商品自販機の切替
 * - カップ麺自販機のお湯チェック
 */
public class VendMachineMain {

    public static void main(String[] args) {
        // 2商品自販機
        VendMachine twoItem = new Vending2Item("コーラ", 2, "お茶", 1);
        twoItem.buy();          // デフォルトは1番
        twoItem.changeItem();   // 2番に切替
        twoItem.buy();          // 2番を購入
        twoItem.buy();          // 2番在庫切れを確認

        System.out.println("-----");

        // カップ麺自販機（お湯量もチェック）
        VendMachine noodle = new VendingHotNoodle("カップ麺", 2, 500, 250);
        noodle.buy();
        noodle.buy();
        noodle.buy();           // 在庫またはお湯不足で販売不可になる
    }
}
