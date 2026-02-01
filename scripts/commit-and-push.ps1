# ステージ → コミット → push を一括実行するスクリプト
# 使い方: プロジェクトのルートで .\scripts\commit-and-push.ps1
# または: コミットメッセージを引数で渡す .\scripts\commit-and-push.ps1 "Lesson2 を修正"

$msg = $args[0]
if (-not $msg) {
    $msg = Read-Host "コミットメッセージを入力"
}
if (-not $msg) { $msg = "更新" }

Set-Location $PSScriptRoot\..

git add .
git status
git commit -m $msg
git push

Write-Host "完了: ステージ → コミット → push"
