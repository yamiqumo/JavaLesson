/**
 * Lesson10 練習問題の解答例
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
