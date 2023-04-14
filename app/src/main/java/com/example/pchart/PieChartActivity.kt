package com.example.pchart

import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Typeface
import android.graphics.fonts.FontFamily
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import androidx.core.view.size
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
        list.add(PieEntry(10000f,"Entertainment"))

        val pieDataSet = PieDataSet(list,"List")

        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS,255)
        pieDataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        pieDataSet.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE)
        pieDataSet.setValueLineColor(Color.CYAN)
        pieDataSet.setValueLineWidth(1.5f)

        pieDataSet.valueTextSize=23f
        pieDataSet.valueTypeface = Typeface.create(resources.getFont(R.font.bebas_nue_400),Typeface.BOLD)

        pieDataSet.valueTextColor=Color.WHITE

        pieChart.setEntryLabelColor(Color.WHITE)



        pieChart.setEntryLabelTypeface(Typeface.create(resources.getFont(R.font.bebas_nue_400),Typeface.BOLD_ITALIC))
        val pieData = PieData(pieDataSet)

        pieChart.setMinAngleForSlices(30f)

        pieChart.data=pieData

        pieChart.setHoleColor(Color.BLACK)

        pieChart.description.text = "Pie Chart"

        pieChart.centerText="EXPENSES"

        pieChart.setCenterTextTypeface(Typeface.create(resources.getFont(R.font.bebas_nue_400),Typeface.ITALIC))


        pieChart.setCenterTextColor(Color.CYAN)

        pieChart.setCenterTextSize(24f)


        pieChart.animateY(2000)





    }
}