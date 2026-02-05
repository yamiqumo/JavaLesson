package src_10.txt_before;

/**
 * 自販機の共通基底クラス。
 * - buy() の流れは固定
 * - 事前チェック / お湯提供 / 最終出力をサブクラス側のメソッドで差し替える
 */
public abstract class VendMachine {

    // フィールド
    private int select = 1; // デフォルト商品は1番

    protected String name; // 単一商品の名称（カップ麺などで利用）
    protected int stock;    // 単一商品の在庫（カップ麺などで利用）

    // 引数なしコンストラクタ
    public VendMachine() {
    }

    // name と stock を受け取るコンストラクタ
    public VendMachine(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    // 選択中の商品番号の setter（1 または 2）
    public void setSelect(int n) {
        if (n == 2) {
            select = 2;
        } else {
            select = 1;
        }
    }

    // 商品を切り替えるメソッド（1 ⇔ 2）
    public void changeItem() {
        if (select == 1) {
            select = 2;
        } else {
            select = 1;
        }
    }

    // 選択中の商品番号の getter
    public int getSelect() {
        return select;
    }

    /**
     * 購入の共通フロー
     */
    public void buy() {
        if (beforeBuy() == true) {
            System.out.println("1分ほどお待ちください");
            hotWaterServe();
            dispense();
        }
    }

    /**
     * 事前チェック（在庫・水量など）。true なら続行。
     */
    protected boolean beforeBuy() {
        return true;
    }

    /**
     * お湯提供などの前処理。不要なら何もしない。
     */
    protected void hotWaterServe() {
        // 何もしない（必要なクラスで上書き）
    }

    /**
     * 実際の提供処理。サブクラスで上書きする。
     */
    protected void dispense() {
        // 何もしない（必要なクラスで上書き）
    }
}
