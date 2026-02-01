/**
 * Lesson10 練習問題の解答例
 * 基本問題①・②・発展問題③の動作確認用 main
 */
public class Main {

    public static void main(String[] args) {
        // ----- 基本問題① 動物（Dog, Cat） -----
        Dog d = new Dog("ポチ");
        Cat c = new Cat("タマ");
        d.cry();  // ワンワン
        c.cry();  // ニャー

        System.out.println("---");

        // ----- 基本問題② 社員（Manager, PartTimer） -----
        Manager m = new Manager("佐藤", "開発");
        PartTimer p = new PartTimer("鈴木", "総務");
        m.introduce();
        p.introduce();

        System.out.println("---");

        // ----- 発展問題③ 配列と for -----
        Animal[] animals = {
            new Dog("ポチ"),
            new Cat("タマ"),
            new Dog("ハチ"),
            new Cat("ミケ")
        };
        for (Animal a : animals) {
            a.cry();
        }
    }
}
