package com.example.tinkerershackathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_items1.*

class Items1 : AppCompatActivity() {

    var num =0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items1)

       plus1A.setOnClickListener {
           num++
           count1A.text =num.toString()

       }

        minus1A.setOnClickListener {
            if (num>0) {
                num--
            }
            else{
                num==0;
            }
            count1A.text = num.toString()
        }

    }

}