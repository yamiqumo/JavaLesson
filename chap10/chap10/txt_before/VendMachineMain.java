/**
 * Lesson9 最終プログラム（修正前）
 * 自販機の動作確認用 main
 */
public class VendMachineMain {

    public static void main(String[] args) {
        VendMachine vm = new VendMachine("コーラ", 2);
        vm.buy();
        vm.buy();
        vm.buy();
    }
}
