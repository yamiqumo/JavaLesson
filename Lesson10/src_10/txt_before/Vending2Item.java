package src_10.txt_before;

/**
 * 2つの商品を扱う自販機。
 * select の状態で 1/2 を切り替える。三項演算子は使用しない。
 */
public class Vending2Item extends VendingMachine {

    // フィールド（商品1と商品2の名前と在庫）
    private String name1;
    private int stock1;
    private String name2;
    private int stock2;

    // コンストラクタ（商品1・商品2の情報を受け取る）
    public Vending2Item(String name1, int stock1, String name2, int stock2) {
        this.name1 = name1;
        this.stock1 = stock1;
        this.name2 = name2;
        this.stock2 = stock2;
        setSelect(1);
    }

    // 購入前のチェック（在庫があるか確認し、在庫を1つ減らす）
    @Override
    protected boolean beforeBuy() {
        if (getSelect() == 1) {
            if (stock1 <= 0) {
                System.out.println(name1 + "は売り切れです");
                return false;
            } else {
                stock1--;
            }
        } else {
            if (stock2 <= 0) {
                System.out.println(name2 + "は売り切れです");
                return false;
            } else {
                stock2--;
            }
        }
        return true;
    }

    // 実際に商品を出す処理
    @Override
    protected void dispense() {
        if (getSelect() == 1) {
            System.out.println(name1 + "を販売します");
        } else {
            System.out.println(name2 + "を販売します");
        }
    }
}
