package com.example.pchart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.RadarChart
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class RadarActivity2 : AppCompatActivity() {

    lateinit var radarChart:RadarChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radar2)

        radarChart = findViewById(R.id.radar_chart)

        val list:ArrayList<RadarEntry> = ArrayList()

        list.add(RadarEntry(100f))
        list.add(RadarEntry(200f))
        list.add(RadarEntry(300f))
        list.add(RadarEntry(400f))
        list.add(RadarEntry(500f))

        val radarDataSet = RadarDataSet(list,"List")

        radarDataSet.setColors(ColorTemplate.MATERIAL_COLORS,255)

        radarDataSet.lineWidth=2f

        radarDataSet.valueTextSize=15f

        radarDataSet.valueTextColor=Color.RED

        val radarData = RadarData(radarDataSet)

        radarChart.data=radarData

        radarChart.description.text="Radar Chart"

        radarChart.animateY(2000)







    }
}