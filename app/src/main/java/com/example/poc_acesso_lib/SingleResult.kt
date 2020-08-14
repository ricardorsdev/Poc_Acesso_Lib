package com.example.poc_acesso_lib

object SingleResult {

    private var dto: Dto? = null

    fun getDto() = this.dto

    fun setDto(dto: Dto) {
        this.dto = dto
    }
}