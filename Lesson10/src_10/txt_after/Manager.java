package src_10.txt_after;

/**
 * 【基本問題②-2】Lesson10 修正後（完成版）
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
