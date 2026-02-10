# -*- coding: utf-8 -*-
"""教材ファイルにプレフィックスを付けてリネームする"""
import os

BASE = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))

RENAMES = [
    ("Lesson1/概要.html", "Lesson1/Ovv-概要.html"),
    ("Lesson1/Eclipseの操作.html", "Lesson1/Text-Eclipseの操作.html"),
    ("Lesson1/Excercise1_1.html", "Lesson1/Exe-Excercise1_1.html"),
    ("Lesson2/概要.html", "Lesson2/Ovv-概要.html"),
    ("Lesson2/基本文法1_変数と型.html", "Lesson2/Text-基本文法1_変数と型.html"),
    ("Lesson2/Excercise2_1.html", "Lesson2/Exe-Excercise2_1.html"),
    ("Lesson7to8_obata/概要.html", "Lesson7to8_obata/Ovv-概要.html"),
    ("Lesson7to8_obata/01_booleanの理解を確認.html", "Lesson7to8_obata/Exam-01_booleanの理解を確認.html"),
    ("Lesson7to8_obata/02_制御構文_テキストと練習.html", "Lesson7to8_obata/Text-02_制御構文_テキストと練習.html"),
    ("Lesson7to8_obata/03_クラスの基礎とコンストラクタと継承_テキストと練習.html", "Lesson7to8_obata/Text-03_クラスの基礎とコンストラクタと継承_テキストと練習.html"),
    ("Lesson8/オブジェクト指向_ユニット1_自販機.html", "Lesson8/Text-オブジェクト指向_ユニット1_自販機.html"),
    ("Lesson8/lesson1_Object.html", "Lesson8/Exe-lesson1_Object.html"),
    ("Lesson9/オブジェクト指向② コンストラクタとカプセル化.html", "Lesson9/Text-オブジェクト指向② コンストラクタとカプセル化.html"),
    ("Lesson9/Excercise9_2.html", "Lesson9/Exe-Excercise9_2.html"),
    ("Lesson9/text-obj2.html", "Lesson9/Pdf-text-obj2.html"),
    ("Lesson10/概要.html", "Lesson10/Ovv-概要.html"),
    ("Lesson10/オブジェクト指向③ 継承とオーバーライド.html", "Lesson10/Text-オブジェクト指向③ 継承とオーバーライド.html"),
    ("Lesson10/オブジェクト指向③_継承とオーバーライド_講義用PDF.html", "Lesson10/Pdf-オブジェクト指向③_継承とオーバーライド_講義用PDF.html"),
    ("Lesson10/Excercise10_3.html", "Lesson10/Exe-Excercise10_3.html"),
    ("Lesson10/kougi.pdf", "Lesson10/Pdf-kougi.pdf"),
    ("Lesson11/オブジェクト指向④ 抽象クラスとインタフェース.html", "Lesson11/Text-オブジェクト指向④ 抽象クラスとインタフェース.html"),
    ("Lesson11/オブジェクト指向④_抽象クラスとインタフェース_講義用PDF.html", "Lesson11/Pdf-オブジェクト指向④_抽象クラスとインタフェース_講義用PDF.html"),
    ("Lesson11/概要.html", "Lesson11/Ovv-概要.html"),
    ("Lesson11/Excercise11_1.html", "Lesson11/Exe-Excercise11_1.html"),
]

def main():
    for old, new in RENAMES:
        old_path = os.path.join(BASE, old)
        new_path = os.path.join(BASE, new)
        if os.path.exists(old_path):
            os.rename(old_path, new_path)
            print("OK:", old, "->", new)
        else:
            print("SKIP (not found):", old)

if __name__ == "__main__":
    main()
