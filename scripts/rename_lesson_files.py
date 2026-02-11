# -*- coding: utf-8 -*-
"""Lesson8-12, Lesson7to8_obata のHTML/PDFを .cursorrules の命名規則でリネーム"""
import os
import shutil

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))

def rename(base, old, new):
    src = os.path.join(base, old)
    dst = os.path.join(base, new)
    if os.path.exists(src):
        if os.path.exists(dst):
            os.remove(dst)
        shutil.move(src, dst)
        print("OK:", old, "->", new)
    else:
        print("SKIP (not found):", src)

def main():
    # Lesson12
    base12 = os.path.join(ROOT, "Lesson12")
    rename(base12, "オブジェクト指向④ 抽象クラスとインタフェース.html", "Html-オブジェクト指向④ 抽象クラスとインタフェース.html")
    rename(base12, "オブジェクト指向④_抽象クラスとインタフェース_講義用PDF.html", "Base-オブジェクト指向④ 抽象クラスとインタフェース.html")
    rename(base12, "Exe-Excercise12_1.html", "Exe-練習問題12.html")

    # Lesson11
    base11 = os.path.join(ROOT, "Lesson11")
    rename(base11, "メンバの可視性_アクセス修飾子.html", "Html-メンバの可視性 アクセス修飾子.html")
    rename(base11, "メンバの可視性_講義用PDF.html", "Base-メンバの可視性 アクセス修飾子.html")
    rename(base11, "Exe-Excercise11_1.html", "Exe-練習問題11.html")

    # Lesson10
    base10 = os.path.join(ROOT, "Lesson10")
    rename(base10, "オブジェクト指向③ 継承とオーバーライド.html", "Html-オブジェクト指向③ 継承とオーバーライド.html")
    rename(base10, "オブジェクト指向③_継承とオーバーライド_講義用PDF.html", "Base-オブジェクト指向③ 継承とオーバーライド.html")
    rename(base10, "Exe-Excercise10_3.html", "Exe-練習問題10.html")
    rename(base10, "Pdf-kougi.pdf", "pdf-オブジェクト指向③ 継承とオーバーライド.pdf")

    # Lesson9
    base9 = os.path.join(ROOT, "Lesson9")
    rename(base9, "オブジェクト指向② コンストラクタとカプセル化.html", "Html-オブジェクト指向② コンストラクタとカプセル化.html")
    rename(base9, "Pdf-text-obj2.html", "Base-オブジェクト指向② コンストラクタとカプセル化.html")
    rename(base9, "Exe-Excercise9_2.html", "Exe-練習問題09.html")
    rename(base9, "text-obj2.pdf", "pdf-オブジェクト指向② コンストラクタとカプセル化.pdf")
    rename(base9, "text-obj2 Edited.pdf", "pdf-オブジェクト指向② コンストラクタとカプセル化①.pdf")

    # Lesson8
    base8 = os.path.join(ROOT, "Lesson8")
    rename(base8, "オブジェクト指向_ユニット1_自販機.html", "Html-オブジェクト指向 ユニット1 自販機.html")
    rename(base8, "Exe-lesson1_Object.html", "Exe-練習問題08.html")

    # Lesson7to8_obata
    base78 = os.path.join(ROOT, "Lesson7to8_obata")
    rename(base78, "概要.html", "Desc-概要07.html")
    rename(base78, "01_booleanの理解を確認.html", "Test-確認テスト07.html")
    rename(base78, "02_制御構文_テキストと練習.html", "Html-制御構文 テキストと練習.html")
    rename(base78, "03_クラスの基礎とコンストラクタと継承_テキストと練習.html", "Html-クラスの基礎とコンストラクタと継承 テキストと練習.html")

    print("Done.")

if __name__ == "__main__":
    main()
