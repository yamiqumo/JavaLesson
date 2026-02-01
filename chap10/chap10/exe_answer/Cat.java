/**
 * Lesson10 練習問題の解答例
 * 猫クラス（Animal のサブクラス）
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("ニャー");
    }
}
