// 温かい麺用自販機（VendMachine のサブクラス）
// buy では「購入 → 2分待つ → お湯を注ぐ」の流れを行う
public class VendingHotNoodle extends VendMachine {

	@Override
	public void buy() {
		// 1. 購入
		System.out.println("温かい麺を購入しました。");

		// 2. 2分待つ（説明用：実際には待機メッセージのみ。本格的に待つ場合は Thread.sleep(120000) など）
		System.out.println("2分待っています...");

		// 3. お湯を注ぐ
		System.out.println("お湯を注ぎました。どうぞ。");
	}
}
