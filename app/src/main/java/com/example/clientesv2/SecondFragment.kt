package com.example.clientesv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.example.clientesv2.databinding.FragmentSecondBinding
import com.example.clientesv2.view.ListClientViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    private val listClientViewModel: ListClientViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                listClientViewModel.client.collect {
                    binding.inputDui.editText?.setText(it.DUI)
                    binding.nombreInput.editText?.setText(it.nombre)
                    //println("llega hasta aca: DUI ${it.DUI} y ${it.nombre}")
                }
            }
        }

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_clientFragment)
        }

        binding.addButton.setOnClickListener {
            listClientViewModel.add(listClientViewModel.client.value.DUI, listClientViewModel.client.value.nombre)
        }

        binding.inputDui.editText?.doAfterTextChanged {
            listClientViewModel.client.value.DUI = it.toString()
        }
        binding.nombreInput.editText?.doAfterTextChanged {
            listClientViewModel.client.value.nombre = it.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}