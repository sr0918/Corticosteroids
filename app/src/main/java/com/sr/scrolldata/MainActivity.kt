package com.sr.scrolldata

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import kotlin.math.roundToInt


//val month = arrayListOf("January", "February", "March"
val drugs = arrayOf("SELECT DRUG","Prednisolone","Methylprednisolone","Dexamethasone","Betamethasone","Cortisone","Hydrocortisone","Triamcinolone")
var selection:String = ""
var drugFromSelect:String = ""
var drugToSelect:String = ""
var dose: Int = 0

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*  val tab = Array(3,{Array(3,{0})})
        tab[0] = arrayOf(1, 2, 3)
        tab[1] = arrayOf(4, 5, 6)
        tab[2] = arrayOf(7, 8, 9)*/

        /* var x = 15.0
        var fla = mutableListOf<Double>()
        for (i in 0..571){
            x += 0.1
            val y = x.toBigDecimal().setScale(1, RoundingMode.UP).toDouble()
            x=y
            fla.add(x)

            //println(fla[i])
        }

    val flAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, fla)

        spinnerFL.adapter= flAdapter
        spinnerFL.onItemSelectedListener = object:

        AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(parent: AdapterView<*>?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            selection = fla[position].toString()
        }
    }*/
        val drugAdapter = ArrayAdapter(this, R.layout.spinner_custom, drugs)
        drugAdapter.setDropDownViewResource(R.layout.custom_spinner_dropdown)
        spinnerDrugFrom.adapter = drugAdapter
        spinnerDrugFrom.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                drugFromSelect = drugs[position]
            }
        }

        /*spinnerDrugTo.adapter = drugAdapter
        spinnerDrugTo.onItemSelectedListener = object:
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                drugToSelect = drugs[position]
                TVDrugTo.text = drugToSelect
            }
        }*/

        button.setOnClickListener() {
            if (getMg.text.toString() == "") {
                Toast.makeText(this, "Please, provide valid amount!", Toast.LENGTH_LONG)
                .show()
            }
            else{dose = getMg.text.toString().toInt()}



                if (dose > 10000) {
                    Toast.makeText(this, "Please, provide valid amount!", Toast.LENGTH_LONG)
                        .show()

                } else {


                    if (drugFromSelect == "Hydrocortisone") {
                        PrednisoloneTV.visibility = View.VISIBLE
                        PrednisoloneDoseTV.visibility = View.VISIBLE
                        dexamethasoneTV.visibility = View.VISIBLE
                        dexamethasoneDoseTV.visibility = View.VISIBLE
                        cortisoneTV.visibility = View.VISIBLE
                        cortisoneDoseTV.visibility = View.VISIBLE
                        betamethasoneDoseTV.visibility = View.VISIBLE
                        betamethasoneTV.visibility = View.VISIBLE
                        methylprednisoloneDoseTV.visibility = View.VISIBLE
                        methylprednisoloneTV.visibility = View.VISIBLE
                        hydrocortisoneDoseTV.visibility = View.VISIBLE
                        hydrocortisoneTV.visibility = View.VISIBLE
                        triamcinoloneDoseTV.visibility = View.VISIBLE
                        triamcinoloneTV.visibility = View.VISIBLE
                        var PrednisoloneDose = (dose!! * 0.25).roundToInt()
                        PrednisoloneDoseTV.text = PrednisoloneDose.toString()
                        var CortisoneDose = (dose!! * 1.25).roundToInt()
                        cortisoneDoseTV.text = CortisoneDose.toString()
                    } else {

                        Toast.makeText(this, "Please, SELECT DRUG !!!", Toast.LENGTH_LONG)
                            .show()

                    }
                }


            }


                //println(selection)


        }
    }


