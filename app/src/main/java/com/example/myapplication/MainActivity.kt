package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerViewPersonAdapter
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerView)
        adapter = RecyclerViewPersonAdapter(getPersonList())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


    }

    private fun getPersonList(): List<Person> {
        val personList = ArrayList<Person>()

        personList.add(
            Person(
                1,
                "https://cdn.motor1.com/images/mgl/vEXXb/s1/4x3/bmw-m2-cs-2020.webp",
                "Luka",
                "Luka Baidoshvili"
            )
        )
        personList.add(
            Person(
                1,
                "https://cdn.motor1.com/images/mgl/vEXXb/s1/4x3/bmw-m2-cs-2020.webp",
                "Luka",
                "Luka Baidoshvili"
            )
        )
        personList.add(
            Person(
                1,
                "https://cdn.motor1.com/images/mgl/vEXXb/s1/4x3/bmw-m2-cs-2020.webp",
                "Luka",
                "Luka Baidoshvili"
            )
        )
        personList.add(
            Person(
                1,
                "https://cdn.motor1.com/images/mgl/vEXXb/s1/4x3/bmw-m2-cs-2020.webp",
                "Luka",
                "Luka Baidoshvili"
            )
        )
        personList.add(
            Person(
                1,
                "https://cdn.motor1.com/images/mgl/vEXXb/s1/4x3/bmw-m2-cs-2020.webp",
                "Luka",
                "Luka Baidoshvili"
            )
        )
return personList

    }
}