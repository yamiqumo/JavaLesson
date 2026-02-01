package src_10.txt_after;

/**
 * 【基本問題①-2】Lesson10 修正後（完成版）
 * 犬クラス（Animal のサブクラス）
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("ワンワン");
    }
}
