package com.example.poc_acesso_lib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ultimo_nivel.*

class UltimoNivel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ultimo_nivel)

        intent.extras?.getParcelable<Dto>("test")?.let {
            setFields(it)
            setValueSingleResult(it)
        }
    }

    private fun setFields(dto: Dto) {
        txtName.text = dto.name
        txtPassWord.text = dto.password
    }

    private fun setValueSingleResult(dto: Dto) {
        SingleResult.setDto(dto)
    }
}