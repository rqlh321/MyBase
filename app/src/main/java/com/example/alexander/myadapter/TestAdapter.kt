package com.example.alexander.myadapter

import android.view.View
import com.example.alexander.myadapter.base.BaseAdapter

class TestAdapter : BaseAdapter<TestModel, TestViewHolder>() {

    override fun getViewType(position: Int): Int = R.layout.list_item_test

    override fun vhProvider(view: View, viewType: Int): TestViewHolder = TestViewHolder(view)

}