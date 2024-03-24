package com.example.bitbybeta
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bitbybeta.CardSetModel
import com.example.bitbybeta.R

class CardSetAdapter(private val cardSetList: List<CardSetModel>) :
    RecyclerView.Adapter<CardSetAdapter.CardSetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardSetViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.cardset_row,
            parent, false
        )
        return CardSetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardSetViewHolder, position: Int) {
        val currentItem = cardSetList[position]

        holder.titleTextView.text = currentItem.getCardSetTitle()
        holder.questionCountTextView.text = currentItem.getCardSetQuestionCount().toString()
        holder.startDateTextView.text = currentItem.getCardSetStartDate().toString()
        holder.endDateTextView.text = currentItem.getCardSetEndDate().toString()
    }

    override fun getItemCount() = cardSetList.size

    class CardSetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.text_title)
        val questionCountTextView: TextView = itemView.findViewById(R.id.text_question_count)
        val startDateTextView: TextView = itemView.findViewById(R.id.text_start_date)
        val endDateTextView: TextView = itemView.findViewById(R.id.text_end_date)
    }
}
