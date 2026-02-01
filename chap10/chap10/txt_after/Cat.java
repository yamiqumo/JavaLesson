/**
 * Lesson10 修正後（完成版）
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
