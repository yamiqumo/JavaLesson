// 2つの商品を購入できる自販機（VendMachine のサブクラス）
// selected が 0 なら1つ目、1 なら2つ目を出す
public class Vending2Items extends VendMachine {

	// 1つ目の商品名
	private String item1 = "コーラ";
	// 2つ目の商品名
	private String item2 = "お茶";

	// どちらを買うか（0 → item1、1 → item2）
	private int selected;

	// コンストラクタ：どちらを選ぶかを引数で受け取る
	public Vending2Items(int selected) {
		this.selected = selected;
	}

	@Override
	public void buy() {
		// selected の値で、出し分ける
		if (selected == 0) {
			System.out.println(item1 + "を購入しました。");
		} else {
			System.out.println(item2 + "を購入しました。");
		}
	}
}
