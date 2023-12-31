package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.data.User

class MainAdapter(userList: List<User>) :RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private val _userList: MutableList<User> = userList.toMutableList()

    override fun getItemCount(): Int = _userList.size

    // 新しいViewHolderオブジェクトを作成し、RecyclerViewに表示するアイテムのレイアウトを指定
    // parent：新しいViewHolderが配置される親ViewGroup受け取る
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            // XMLレイアウトファイルからViewオブジェクトを作成
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_list_item, parent, false)
        )
    }

    // データをViewHolderにバインドするメソッド
    // positionからバインドするビューの番号が受け取れる
    // その番号のデータをリストから取得しholderにセット
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val user = _userList[position]

        holder.name.text = user.name
        holder.age.text = user.age.toString()
        holder.hobby.text = user.hobby
    }

    // itemView：アイテムレイアウトファイルに対応するViewオブジェクト
    // 「fragment_item_list」の要素を取得しHolderを構築
    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.user_name)
        val age: TextView = itemView.findViewById(R.id.user_age)
        val hobby: TextView = itemView.findViewById(R.id.user_hobby)
    }
}