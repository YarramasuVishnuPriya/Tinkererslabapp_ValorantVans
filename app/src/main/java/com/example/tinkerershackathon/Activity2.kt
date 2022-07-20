package com.example.tinkerershackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        button1.setOnClickListener(View.OnClickListener{startActivity(Intent(this, Items1::class.java))})
        button2.setOnClickListener(View.OnClickListener{startActivity(Intent(this, Items2::class.java))})
        button3.setOnClickListener(View.OnClickListener{startActivity(Intent(this, Items3::class.java))})
        button4.setOnClickListener(View.OnClickListener{startActivity(Intent(this, Items4::class.java))})
        button5.setOnClickListener(View.OnClickListener{startActivity(Intent(this, Items5::class.java))})
        button6.setOnClickListener(View.OnClickListener{startActivity(Intent(this, Items6::class.java))})
        button7.setOnClickListener(View.OnClickListener{startActivity(Intent(this, Addnewcat::class.java))})

       /* recycler_view.adapter=ExampleAdapter(exampleList)
        recycler_view.LayoutManager =LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)

    }
    fun insertItem(View){

    }
    fun removeItem(View){

    }

        */
}
}