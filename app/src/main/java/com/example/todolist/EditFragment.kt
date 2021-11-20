package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.todolist.databinding.FragmentInformationBinding
import com.example.todolist.model.ListViewModel
import kotlinx.android.synthetic.main.fragment_edit.*


class EditFragment : Fragment() {

    private val viewModel : ListViewModel by viewModels ()

private var place = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        return inflater.inflate(R.layout.fragment_edit, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments.let {
            edits9.setText(it?.getString("title"))
            place = it!!.getInt("position")

            buttonback.setOnClickListener {

                viewModel.upteat(edits9.text.toString())

                viewModel.EditText(place)
                findNavController().navigate(R.id.action_editFragment_to_startFragment)
            }
        }
    }
    }
