package com.grinaldyafi.phcokmap19_20


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPHCOAdapter(val listpHCO: ArrayList<PHCO>) : RecyclerView.Adapter<ListPHCOAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_phco, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listpHCO.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, est, photo, tentang) = listpHCO[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvEst.text = est

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailPHCO::class.java)
            moveDetail.putExtra(DetailPHCO.EXTRA_EST, est)
            moveDetail.putExtra(DetailPHCO.EXTRA_NAME, name)
            moveDetail.putExtra(DetailPHCO.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailPHCO.EXTRA_OVERVIEW, tentang)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvEst: TextView = itemView.findViewById(R.id.tv_item_est)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }


}