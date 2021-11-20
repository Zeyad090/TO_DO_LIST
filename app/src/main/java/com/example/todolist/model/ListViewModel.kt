package com.example.todolist.model

import android.content.ClipData
import android.icu.text.IDNA
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todolist.R


import com.example.todolist.data.toDoList


class ListViewModel : ViewModel () {
  // for Edit function
  val _mainTitl = MutableLiveData<String>()
  var mainTitl :LiveData<String> = _mainTitl
var task = MutableLiveData<String>()

  // make Add function to add text to thw list
fun Addlist (m2:String) {

  toDoList.add(ListToDo(m2))

}
fun moreDeatl(k1:String){
  task.value?.rangeTo(k1)

}
// make function to edit text
fun EditText(index :Int){
  toDoList.set(index, ListToDo(mainTitl.value.toString()))
// we make function to upteat becaus it will not give you Null
}
fun upteat(upTax : String){
  _mainTitl.value = upTax

}


}

