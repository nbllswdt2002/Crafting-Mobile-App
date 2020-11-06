package com.example.listviewcraft

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.annotation.ColorRes
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val listView = findViewById<ListView>(R.id.main_listview)
//        val bgcolor = Color.parseColor("#FFA07A")
//        listView.setBackgroundColor(bgcolor)

//        listView.adapter = MyAdapter(this)
    }

        private class MyAdapter (context: Context): BaseAdapter() {
            private val mContext: Context

            init {
                mContext = context
            }

            override fun getView(position: Int, convertView: View?, ViewGroup: ViewGroup?): View {
                val textView = TextView(mContext)
                textView.text = "NABILLA EKA SWADATI"
                return textView
            }

            override fun getCount(): Int {
                return 5
            }

            override fun getItemId(position: Int): Long {
                return position.toLong()
            }

            override fun getItem(position: Int): Any {
                return "TEST STRING"
            }


        }
}