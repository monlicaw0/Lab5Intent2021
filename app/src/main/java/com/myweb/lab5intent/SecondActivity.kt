package com.myweb.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.myweb.lab5intent.databinding.ActivityMainBinding
import com.myweb.lab5intent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var bindingSecond : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingSecond = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingSecond.root)

        var data = intent.extras
        var newStudent:Student? = data?.getParcelable("stdData")

        bindingSecond.idText.text = "Student ID : ${newStudent?.id} "
        bindingSecond.nameText.text = "Student Name : ${newStudent?.name}"
        bindingSecond.ageText.text = "Student Age : ${newStudent?.age}"
        bindingSecond.hobbyText.text = "Student Hobby : ${newStudent?.hobby}"

    }

    fun onClickClose(view: View){
        finish()
    }
}

