package com.example.pchart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class BarChart : AppCompatActivity() {

    lateinit var barChart:BarChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_chart)

        barChart=findViewById(R.id.bar_chart)

        val list:ArrayList<BarEntry> = ArrayList()

        list.add(BarEntry(100f,100f))
        list.add(BarEntry(200f,200f))
        list.add(BarEntry(300f,300f))
        list.add(BarEntry(400f,400f))
        list.add(BarEntry(500f,500f))

        val barDataSet = BarDataSet(list,"List")

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS,255)

        barDataSet.valueTextColor =Color.BLACK

        val barData = BarData(barDataSet)

        barChart.setFitBars(true)
        barChart.data=barData
        barChart.description.text="Bar Chart"

        barChart.animateY(2000)


    }
}