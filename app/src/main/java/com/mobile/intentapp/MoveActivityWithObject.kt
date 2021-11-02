package com.mobile.intentapp

import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MoveActivityWithObject : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)


        val tvObject:TextView = findViewById(R.id.tv_object_received)
        val imgProfile:ImageView = findViewById(R.id.img_profile)

        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text = "Nama : ${person.name.toString()}, \nNIM : ${person.nim}, \nJurusan : ${person.jurusan}, \nIPK : ${person.ipk}, \nNo. HP : ${person.noHp}"
        imgProfile.setImageResource(R.drawable.round_img)
        tvObject.text = text
    }
}
