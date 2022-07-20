package com.example.tinkerershackathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Items2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items2)
    }
}





/* package com.example.tinkerershackathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_items2.*
import kotlinx.android.synthetic.main.activity_items2.items2button1

abstract class Items2 : AppCompatActivity() {
//class Items2 : AppCompatActivity() {
 private val itemsList= mutableListOf(
       items2button1.text,
       items2button2.text,
       items2button3.text,
       items2button4.text
   )


   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_items2)
       val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)
       val apply: RecyclerView = recyclerView.apply {
           layoutManager = LinearLayoutManager(this@Items2)
           //adapter = ListAdapter(itemsList)

       }
       val swipeToDeleteCallback= object:SwipeToDeleteCallback(){
          override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
              val position= viewHolder.adapterPosition
              itemsList.removeAt(position)
              recycler_view.adapter?.notifyItemRemoved(position)
          }

      }




   }

}

       */