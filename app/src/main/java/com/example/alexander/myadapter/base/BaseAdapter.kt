package com.example.alexander.myadapter.base

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseAdapter<Model : BaseModel, ViewHolder : BaseViewHolder<Model>> : RecyclerView.Adapter<ViewHolder>() {

    private val items = ArrayList<Model>()

    abstract fun getViewType(position: Int): Int

    abstract fun vhProvider(view: View, viewType: Int): ViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            vhProvider(LayoutInflater.from(parent.context).inflate(viewType, parent, false), viewType)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int = getViewType(position)

    fun items(): ArrayList<Model> = items

    fun add(collection: Collection<Model>) {
        items.addAll(collection)
        notifyItemRangeInserted(items.size - collection.size, collection.size)
    }

    fun add(item: Model) {
        items.add(item)
        notifyItemInserted(items.lastIndex)
    }

    fun add(vararg args: Model) {
        this.items.addAll(args)
        notifyItemRangeInserted(items.size - args.size, args.size)

    }

    fun update(item: Model) {
        notifyItemChanged(items.indexOf(item))
    }

    fun clear() {
        notifyItemRangeRemoved(0, items.size)
        items.clear()
    }

    fun remove(item: Model) {
        notifyItemRemoved(items.indexOf(item))
        items.remove(item)
    }

}