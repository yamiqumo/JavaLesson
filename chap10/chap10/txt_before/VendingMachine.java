/**
 * Lesson9 最終プログラム（修正前）
 * 自販機クラス：コンストラクタ・カプセル化・getter/setter・buy()
 */
public class VendingMachine {

    private String name;
    private int stock;

    public VendingMachine(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int n) {
        if (n >= 0) {
            this.stock = n;
        }
    }

    public void buy() {
        if (stock > 0) {
            System.out.println(getName() + "を購入しました");
            stock--;
            System.out.println("残りの在庫は" + getStock() + "個です");
        } else {
            System.out.println("売り切れです");
        }
    }
}
