package com.example.todolist2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.todolist2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList= binding.listView

        val countryList= listOf("Rwanda","Zambia","Rwanda","Kenya","Tanzania","Congo Zaire")

         val arrayAdapter= ArrayAdapter(this, R.layout.list_item_layout,R.id.country_List,countryList)
        myList.adapter = arrayAdapter
    }
}