/**
 * Lesson10 修正後（完成版）
 * 動物クラス（スーパークラス）
 */
public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println(name + "が鳴きます。");
    }
}
