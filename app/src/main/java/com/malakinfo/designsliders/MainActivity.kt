package com.malakinfo.designsliders

import android.icu.text.NumberFormat
import android.icu.util.Currency
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import com.google.android.material.slider.LabelFormatter

import android.view.View
import androidx.annotation.RequiresApi
import com.google.android.material.slider.RangeSlider





class MainActivity : AppCompatActivity() {

    private lateinit var rangeSlider: RangeSlider

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**get Id*/
        rangeSlider = findViewById(R.id.sliderRange)

        rangeSlider.setLabelFormatter { value: Float ->
                   val format = NumberFormat.getCurrencyInstance()
            format.maximumFractionDigits = 0
            format.currency = Currency.getInstance("USD")
            format.format(value.toDouble())
        }

    }
}