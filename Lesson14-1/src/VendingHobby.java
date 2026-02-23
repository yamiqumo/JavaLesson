// ガチャガチャ型自販機（VendingMachine のサブクラス）
// 購入時は Math.random() で 10% レア / 70% ノーマル / 20% 外れ のどれかが出る
public class VendingHobby extends VendingMachine {

	@Override
	public void buy() {
		// 0.0 以上 1.0 未満の乱数（double 型）。この値で割合を振り分ける
		double r = Math.random();

		// 10%：0.0 以上 0.1 未満 → レアフィギュア
		if (r < 0.10) {
			System.out.println("レアフィギュアが出ました！");
			return;
		}
		// 70%：0.1 以上 0.8 未満 → ノーマルフィギュア
		if (r < 0.80) {
			System.out.println("ノーマルフィギュアが出ました。");
			return;
		}
		// 20%：それ以外（0.8 以上 1.0 未満）→ 外れ
		System.out.println("外れフィギュアが出ました。");
	}
}
