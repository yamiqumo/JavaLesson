package src_10.txt_after;

/**
 * 【基本問題①-1】Lesson10 修正後（完成版）
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
