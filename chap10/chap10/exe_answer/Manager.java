/**
 * Lesson10 練習問題の解答例
 * 管理職クラス（Employee のサブクラス）
 */
public class Manager extends Employee {

    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public void introduce() {
        System.out.println(getName() + "です。" + getDepartment() + "部の管理職です。");
    }
}
