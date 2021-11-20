package com.example.todolist.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.R
import com.example.todolist.R.id.*
import com.example.todolist.StartFragmentDirections
import com.example.todolist.model.ListToDo
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.list_item.view.*
import androidx.navigation.NavController as AndroidxNavigationNavController
import com.example.todolist.R.id.checked as checked
import android.widget.EditText
import androidx.fragment.app.viewModels
import com.example.todolist.data.toDoList
import com.example.todolist.model.ListViewModel

class ListAdapter (private val context: Context,private val datset:MutableList<ListToDo>)
    : RecyclerView.Adapter<ListAdapter.ItemViewHolder>() {

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView = view.findViewById(R.id.item_titel)
        var btn2: Button = view.findViewById(R.id.details)
        var rem :Button = view.findViewById(R.id.delet)
        var edt : Button = view.findViewById(R.id.Editbutton)
      //  var ckek :CheckBox = view.findViewById(R.id.checkbox)
var buttonDet :TextView = view.findViewById(R.id.ShowDeltels)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)

    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = datset[position]
        holder.textView.text = item.MyList

        holder.btn2.setOnClickListener {
// we create a var to (action) to navigate start fragment  to information fragment

            var action = StartFragmentDirections.actionStartFragmentToInformationFragment(item.toString())
     holder.itemView.findNavController().navigate(action)

            }
        holder.buttonDet.setOnClickListener {
            var actionDet = StartFragmentDirections.actionStartFragmentToDeatelsFragment(item.MyList)
            holder.itemView.findNavController().navigate(actionDet)
        }
        // for remove from the list
        holder.rem.setOnClickListener {
            datset.removeAt(position)
            notifyDataSetChanged()

        }

holder.edt.setOnClickListener {
  var action3 = StartFragmentDirections.actionStartFragmentToEditFragment(position, item.MyList,item.MyList )
 holder.itemView.findNavController().navigate(action3)
}

      }


    override fun getItemCount() = datset.size

}