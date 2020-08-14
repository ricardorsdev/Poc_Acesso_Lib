package com.example.poc_acesso_lib

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        btnGo.setOnClickListener {
            startActivity(
                Intent(this, UltimoNivel::class.java).apply {
                    putExtras(Bundle().apply {
                        putParcelable("test", Dto("José", "123"))
                    })
                }
            )
        }
    }

    override fun onRestart() {
        super.onRestart()
        SingleResult.getDto()?.let {
            showDataSingleResult(it)
        }
    }

    private fun showDataSingleResult(dto: Dto) {
        Toast.makeText(
            this, "Name: ${dto.name}\nPassword: ${dto.password}", Toast.LENGTH_LONG
        ).show()
    }
}
