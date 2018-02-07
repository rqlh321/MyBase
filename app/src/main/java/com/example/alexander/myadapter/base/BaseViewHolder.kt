package com.example.alexander.myadapter.base

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder<in Model : BaseModel>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(item: Model)

}
