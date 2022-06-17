package com.example.lemonade

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image :ImageView=findViewById(R.id.imageView)
        val text:TextView=findViewById(R.id.textView)
        var count =1
        image.setOnClickListener(){
            if(count==0){
                text.text="Click to select lemon"
                image.setImageResource(R.drawable.lemon_tree)
                 count=count+1
            }
            else if(count==1){
                text.text="Click to juice the lemon"
                image.setImageResource(R.drawable.lemon_squeeze)
                count=count+1
            }
            else if(count==2){
                text.text="Click to drink your lemonade"
                image.setImageResource(R.drawable.lemon_drink)
                count=count+1
            }
            else if(count==3){
                text.text="Click to start again  !"
                image.setImageResource(R.drawable.lemon_restart)
                count=0
            }
        }
    }
//    @SuppressLint("SetTextI18n")
//    private fun check(no:Int){
//        val image :ImageView=findViewById(R.id.imageView)
//        val text:TextView=findViewById(R.id.textView)
//        when (no){
//            0->{
//                text.text="Click to select lemon"
//                image.setImageResource(R.drawable.lemon_tree)
//            }
//            2->{
//                text.text="Click to juice the lemon"
//                image.setImageResource(R.drawable.lemon_squeeze)
//            }
//            3->{
//                text.text="Click to drink your lemonade"
//                image.setImageResource(R.drawable.lemon_drink)
//            }
//            4->{
//                text.text="Click to start again  !"
//                image.setImageResource(R.drawable.lemon_restart)
//            }
////            else->{
////
////            }
//
//        }
//    }
}