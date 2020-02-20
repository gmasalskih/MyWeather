package ru.gmasalskih.myweather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.gmasalskih.myweather.databinding.FragmentCitySelectionBinding

class CitySelectionFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCitySelectionBinding.inflate(inflater, container, false)
        binding.cityConfirm.setOnClickListener {
            it.findNavController().navigate(
                CitySelectionFragmentDirections.actionCitySelectionFragmentToWeatherFragment().setCity(binding.cityInput.text.toString())
            )
        }
        return binding.root
    }
}