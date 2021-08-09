package com.myweb.lab5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.myweb.lab5intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickShowDetail(v: View) {
        var  hobby_str :String = ""
        if (binding.readingCB.isChecked){
            hobby_str += "  " + binding.readingCB.text;
        }
        if (binding.watchingCB.isChecked){
            hobby_str +="  " + binding.watchingCB.text;
        }
        if (binding.cookingCB.isChecked){
            hobby_str +="  " + binding.cookingCB.text;
        }
        var hobby_new = if (hobby_str.isNotEmpty()) hobby_str else "No hobby."

        val intent = Intent(this,SecondActivity::class.java)
         intent.putExtra("stdData",Student(binding.idEDT.text.toString(),binding.nameEDT.text.toString(),
                binding.ageEDT.text.toString().toInt(),hobby_new))
         startActivity(intent)
    }
}