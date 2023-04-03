package com.example.pchart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate

class PieChartActivity : AppCompatActivity() {

    lateinit var pieChart:PieChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        pieChart=findViewById(R.id.pie_chart)

        val list:ArrayList<PieEntry> = ArrayList()

        list.add(PieEntry(100f,"Stationary"))
        list.add(PieEntry(200f,"Canteen"))
        list.add(PieEntry(300f,"College"))
        list.add(PieEntry(400f,"Online Courses"))
        list.add(PieEntry(500f,"Entertainment"))

        val pieDataSet = PieDataSet(list,"List")

        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS,255)

        pieDataSet.valueTextSize=15f

        pieDataSet.valueTextColor=Color.BLACK

        val pieData = PieData(pieDataSet)

        pieChart.data=pieData

        pieChart.description.text = "Pie Chart"

        pieChart.centerText="Expenses"

        pieChart.animateY(2000)




    }
}