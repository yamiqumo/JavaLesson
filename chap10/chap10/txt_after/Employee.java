/**
 * Lesson10 修正後（完成版）
 * 社員クラス（スーパークラス）
 */
public class Employee {

    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void introduce() {
        System.out.println(name + "です。" + department + "部です。");
    }
}
