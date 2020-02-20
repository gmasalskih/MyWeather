package ru.gmasalskih.myweather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ru.gmasalskih.myweather.data.Weather
import ru.gmasalskih.myweather.databinding.FragmentWeatherBinding

class WeatherFragment : Fragment() {

    private val data = Weather()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var args = WeatherFragmentArgs.fromBundle(arguments!!)
        val binding = FragmentWeatherBinding.inflate(inflater, container, false).apply {
            wearher = data
        }
        binding.city.setOnClickListener {
            it.findNavController().navigate(WeatherFragmentDirections.actionWeatherFragmentToCitySelectionFragment())
        }
        binding.wearher?.city = args.city.toString()
        binding.invalidateAll()

        return binding.root
    }
}