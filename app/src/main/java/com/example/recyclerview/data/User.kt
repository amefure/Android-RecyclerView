package com.example.recyclerview.data
import java.util.concurrent.TimeUnit

data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val hobby: String
){
    companion object {
        fun getDemoData(): List<User> {
            return listOf(
                User(1, "ame", 25, "ボルタリング"),
                User(2, "ito", 30, "お菓子作り"),
                User(3, "izumi", 22, "小説"),
                User(4, "maiko", 27, "カフェ巡り"),
                User(5, "riku", 42, "ランニング"),
                User(6, "yoru", 67, "アプリ開発"),
                User(7, "ryo", 25, "麻雀"),
                User(8, "risa", 31, "映画"),
                User(9, "sonoko", 25, "ダイエット"),
                User(10, "genki", 25, "ヒッチハイク")
                )
        }
    }
}



