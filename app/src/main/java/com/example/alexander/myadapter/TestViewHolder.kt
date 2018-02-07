package com.example.alexander.myadapter

import android.view.View
import com.example.alexander.myadapter.base.BaseViewHolder
import kotlinx.android.synthetic.main.list_item_test.view.*

class TestViewHolder(itemView: View) : BaseViewHolder<TestModel>(itemView) {

    override fun bind(item: TestModel) {
        itemView.text.text = item.toString()
    }

}