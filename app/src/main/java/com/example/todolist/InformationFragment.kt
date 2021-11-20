package com.example.todolist

import android.content.ClipData
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.navigation.findNavController
import com.example.todolist.databinding.FragmentInformationBinding
import com.example.todolist.model.ListToDo
import com.example.todolist.model.ListViewModel
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_information.*
import kotlinx.android.synthetic.main.list_item.*
import kotlinx.android.synthetic.main.list_item.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [InformationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InformationFragment : Fragment() {
    private val viewModel: ListViewModel by viewModels()
    private lateinit var binding: FragmentInformationBinding
// we add now var to
lateinit var info : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      arguments.let {
         info = it?.getString("infomation").toString()
      }
    }


    override fun onCreateView (

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

binding = FragmentInformationBinding.inflate(inflater,container,false)
        return binding.root

        // Inflate the layout for this fragment

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.text


        var moveButton :Button = view.findViewById(R.id.button2)
        moveButton.setOnClickListener {

            binding.textdeatels.text.toString()
            viewModel.moreDeatl(textdeatels.text.toString())
            var move = InformationFragmentDirections.actionInformationFragmentToDeatelsFragment(info.toString())
            moveButton.findNavController().navigate(move)

        }
         }
    }

