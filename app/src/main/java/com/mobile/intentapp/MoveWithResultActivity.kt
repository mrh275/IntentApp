package com.mobile.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup

class MoveWithResultActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnChoose: Button
    private  lateinit var  rgNumber: RadioGroup

    companion object {
        const val EXTRA_SELECTED_VALUE = "extra_selected_value"
        const val RESULT_CODE =110
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_result)

        btnChoose = findViewById(R.id.btn_choose)
        rgNumber = findViewById(R.id.rg_number)

        btnChoose.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id == R.id.btn_choose) {
            if(rgNumber.checkedRadioButtonId > 0) {
                var value = 0
                when (rgNumber.checkedRadioButtonId) {
                    R.id.rb_21 -> value = 21
                    R.id.rb_22 -> value = 22
                    R.id.rb_23 -> value = 23
                    R.id.rb_24 -> value = 24
                    R.id.rb_25 -> value = 25
                }

                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, value)
                setResult(RESULT_CODE, resultIntent)
                finish()
            }
        }
    }
}