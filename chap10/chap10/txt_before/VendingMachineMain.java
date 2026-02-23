/**
 * Lesson9 最終プログラム（修正前）
 * 自販機の動作確認用 main
 */
public class VendingMachineMain {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine("コーラ", 2);
        vm.buy();
        vm.buy();
        vm.buy();
    }
}
