/**
 * Lesson10 修正後（完成版）
 * パートタイマークラス（Employee のサブクラス）
 */
public class PartTimer extends Employee {

    public PartTimer(String name, String department) {
        super(name, department);
    }

    @Override
    public void introduce() {
        System.out.println(getName() + "です。パートで勤務しています。");
    }
}
