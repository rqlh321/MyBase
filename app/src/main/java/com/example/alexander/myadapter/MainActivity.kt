package com.example.alexander.myadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = RecyclerView(this)
        view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        view.setHasFixedSize(true)
        val adapter = TestAdapter()
        (0..1000).map { adapter.add(TestModel(it)) }
        view.adapter = adapter
        setContentView(view)
    }

}
