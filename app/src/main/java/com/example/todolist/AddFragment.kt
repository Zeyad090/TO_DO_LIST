package com.example.todolist

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.todolist.model.ListViewModel
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.fragment_information.*
import java.time.DayOfWeek
import java.time.Month
import java.time.MonthDay
import java.time.Year
import java.util.*


class AddFragment : Fragment() {

    private val viewModel: ListViewModel by viewModels()


    lateinit var binding: AddFragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        AddButton.setOnClickListener {

            viewModel.Addlist(inputadd.text.toString())



            AddButton.findNavController().navigate(R.id.action_addFragment_to_startFragment)

        }

    }
}






