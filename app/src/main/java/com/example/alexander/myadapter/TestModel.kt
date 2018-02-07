package com.example.alexander.myadapter

import com.example.alexander.myadapter.base.BaseModel

data class TestModel(private val name: String = "Default", private val age: Int = 0) : BaseModel {

    constructor(age: Int = 0) : this("Default", age)

}