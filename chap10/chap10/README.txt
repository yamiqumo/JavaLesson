========================================
  Lesson10 配布用プロジェクト chap10
========================================

【フォルダ構成】

chap10/
  txt_before/    … 修正前のソース（Lesson9 最終プログラム）
  txt_after/     … 修正後の最終ソース（Lesson10 完成版）
  exe_question/  … 練習問題（構造・コメント・穴埋め用空行のみ）
  exe_answer/    … 練習問題の解答例

【各フォルダの内容】

■ txt_before（修正前）
  Lesson9 の最終プログラム。自販機クラスのコンストラクタ・カプセル化・getter/setter・buy() まで実装済み。
  - VendingMachine.java
  - VendingMachineMain.java

■ txt_after（修正後・完成版）
  Lesson10 の完成版。継承・オーバーライド・配列のサンプル。
  - Animal.java, Dog.java, Cat.java（基本問題①）
  - Employee.java, Manager.java, PartTimer.java（基本問題②）
  - Main.java（基本①・②・発展③の動作確認）

■ exe_question（穴埋め問題）
  練習問題の構造とコメントと記述用の空行のみ。ここにコードを書いて完成させる。
  - Animal.java, Dog.java, Cat.java, Employee.java, Manager.java, PartTimer.java, Main.java

■ exe_answer（解答例）
  練習問題の完成版（exe_question の解答）。
  - 上記と同じ 7 ファイル（完成コード）

【プロジェクトへの取り込み方】

1. ZIP を解凍し、chap10 フォルダを任意の場所に置く。
2. Eclipse / IntelliJ などで「新規 Java プロジェクト」を作成。
3. ソースフォルダとして、使いたいフォルダ（txt_before / txt_after / exe_question / exe_answer のいずれか）を追加する。
   または、該当フォルダ内の .java をプロジェクトにコピーする。
4. main メソッドを持つクラス（VendingMachineMain または Main）を実行して動作確認。

【ZIP での配布】

chap10 フォルダ全体を ZIP 圧縮して配布してください。
 例： chap10.zip に chap10/chap10/txt_before/ … が含まれる形

========================================
