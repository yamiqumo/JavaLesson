// 自動販売機のスーパークラス（抽象クラス）
// サブクラスは必ず buy() を実装する
public abstract class VendMachine {

	// 購入処理はサブクラスごとに違うので、ここでは「やること」だけ約束する
	public abstract void buy();
}
