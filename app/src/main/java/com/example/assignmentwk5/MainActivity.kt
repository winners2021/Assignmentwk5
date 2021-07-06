package com.example.assignmentwk5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var myListAdapter: MyAdapter
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


        val arrayList = ArrayList<Model>()
        val displayList = ArrayList<Model>()

        arrayList.add(Model("Faith", "Mark", R.drawable.ic_android_black_24dp))
        arrayList.add(Model("Helen", "Frank", R.drawable.ic_android_black_24dp))
        arrayList.add(Model("Mia", "George", R.drawable.ic_android_black_24dp))
        arrayList.add(Model("Marcel", "Frank", R.drawable.ic_android_black_24dp))
        arrayList.add(Model("Lori", "Jude", R.drawable.ic_android_black_24dp))
        arrayList.add(Model("Josh", "Rex", R.drawable.ic_android_black_24dp))
        arrayList.add(Model("Handel", "Kes", R.drawable.ic_android_black_24dp))
        displayList.addAll(arrayList)


        val myAdapter = MyAdapter(arrayList, this)


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter





    }
}