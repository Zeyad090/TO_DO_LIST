package com.example.todolist.data

import android.icu.text.IDNA
import android.widget.TextView
import com.example.todolist.InformationFragment
import com.example.todolist.R
import com.example.todolist.model.ListToDo
import org.w3c.dom.Text
import java.util.Objects.toString

class dataSourece {
    // for lead our List
    fun laodListsToDo() : MutableList<ListToDo> {

        return toDoList
    }

}// we find now var for make the last mutable

var toDoList =  mutableListOf(ListToDo(String()))


