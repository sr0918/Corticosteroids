package com.sr.scrolldata

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode


val drugs = arrayOf("SELECT DRUG","Prednisolone","Methylprednisolone","Dexamethasone","Betamethasone","Cortisone","Hydrocortisone","Triamcinolone")
var drugFromSelect:String = ""
var dose: Double = 0.0


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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

        button.setOnClickListener {

            if (getMg.text.toString() == "") {
                Toast.makeText(this, "Please, provide valid amount!", Toast.LENGTH_LONG)
                    .show()
            } else {
                dose = getMg.text.toString().toDouble()
            }

            if (dose > 10000.0) {
                Toast.makeText(this, "Please, provide valid amount!", Toast.LENGTH_LONG)
                    .show()
            } else {
                if (drugFromSelect !== "SELECT DRUG") {
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
                } else {

                    Toast.makeText(this, "Please, SELECT DRUG !!!", Toast.LENGTH_LONG)
                        .show()

                }
                if (drugFromSelect == "Hydrocotisone") {
                    var PrednisoloneDose =
                        (dose * 1).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    PrednisoloneDoseTV.text = PrednisoloneDose.toString()
                    var CortisoneDose =
                        (dose * 5).toInt()
                    cortisoneDoseTV.text = CortisoneDose.toString()
                    var betamethasoneDose =
                        (dose * 0.12).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    betamethasoneDoseTV.text = betamethasoneDose.toString()
                    var dexamethasoneDose =
                        (dose * 0.15).toBigDecimal().setScale(2, RoundingMode.UP)
                            .toDouble()
                    dexamethasoneDoseTV.text = dexamethasoneDose.toString()
                    var hydrocortisoneDose =
                        (dose * 4).toInt()
                    hydrocortisoneDoseTV.text = hydrocortisoneDose.toString()
                    var triamcinoloneDose =
                        (dose * 0.8).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    triamcinoloneDoseTV.text = triamcinoloneDose.toString()
                    var methylprednisoloneDose =
                        (dose * 0.8).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    methylprednisoloneDoseTV.text = methylprednisoloneDose.toString()
                }
                if (drugFromSelect == "Prednisolone") {
                    var PrednisoloneDose =
                        (dose * 1).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    PrednisoloneDoseTV.text = PrednisoloneDose.toString()
                    var CortisoneDose =
                        (dose * 5).toInt()
                    cortisoneDoseTV.text = CortisoneDose.toString()
                    var betamethasoneDose =
                        (dose * 0.12).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    betamethasoneDoseTV.text = betamethasoneDose.toString()
                    var dexamethasoneDose =
                        (dose * 0.15).toBigDecimal().setScale(2, RoundingMode.UP)
                            .toDouble()
                    dexamethasoneDoseTV.text = dexamethasoneDose.toString()
                    var hydrocortisoneDose =
                        (dose * 4).toInt()
                    hydrocortisoneDoseTV.text = hydrocortisoneDose.toString()
                    var triamcinoloneDose =
                        (dose * 0.8).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    triamcinoloneDoseTV.text = triamcinoloneDose.toString()
                    var methylprednisoloneDose =
                        (dose * 0.8).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    methylprednisoloneDoseTV.text = methylprednisoloneDose.toString()
                }
                if (drugFromSelect == "Methylprednisolone") {
                    var PrednisoloneDose =
                        (dose * 1.25).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    PrednisoloneDoseTV.text = PrednisoloneDose.toString()
                    var CortisoneDose =
                        (dose * 6.25).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    cortisoneDoseTV.text = CortisoneDose.toString()
                    var betamethasoneDose =
                        (dose * 0.15).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    betamethasoneDoseTV.text = betamethasoneDose.toString()
                    var dexamethasoneDose =
                        (dose * 0.1875).toBigDecimal().setScale(2, RoundingMode.UP)
                            .toDouble()
                    dexamethasoneDoseTV.text = dexamethasoneDose.toString()
                    var hydrocortisoneDose =
                        (dose * 5).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    hydrocortisoneDoseTV.text = hydrocortisoneDose.toString()
                    var triamcinoloneDose =
                        (dose * 1).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    triamcinoloneDoseTV.text = triamcinoloneDose.toString()
                    var methylprednisoloneDose =
                        (dose * 1).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    methylprednisoloneDoseTV.text = methylprednisoloneDose.toString()
                }
                if (drugFromSelect == "Dexamethasone") {
                    var PrednisoloneDose =
                        (dose * 6.66).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    PrednisoloneDoseTV.text = PrednisoloneDose.toString()
                    var CortisoneDose =
                        (dose * 33.34).toInt()
                    cortisoneDoseTV.text = CortisoneDose.toString()
                    var betamethasoneDose =
                        (dose * 0.8).toBigDecimal().setScale(1, RoundingMode.HALF_EVEN)
                            .toDouble()
                    betamethasoneDoseTV.text = betamethasoneDose.toString()
                    var dexamethasoneDose =
                        (dose * 1).toBigDecimal().setScale(2, RoundingMode.UP)
                            .toDouble()
                    dexamethasoneDoseTV.text = dexamethasoneDose.toString()
                    var hydrocortisoneDose =
                        (dose * 26.67).toInt()
                    hydrocortisoneDoseTV.text = hydrocortisoneDose.toString()
                    var triamcinoloneDose =
                        (dose * 5.33).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    triamcinoloneDoseTV.text = triamcinoloneDose.toString()
                    var methylprednisoloneDose =
                        (dose * 5.33).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    methylprednisoloneDoseTV.text = methylprednisoloneDose.toString()
                }
                if (drugFromSelect == "Betamethasone") {
                    var PrednisoloneDose =
                        (dose * 8.33).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    PrednisoloneDoseTV.text = PrednisoloneDose.toString()
                    var CortisoneDose =
                        (dose * 41.67).toInt()
                    cortisoneDoseTV.text = CortisoneDose.toString()
                    var betamethasoneDose =
                        (dose * 1).toBigDecimal().setScale(1, RoundingMode.HALF_EVEN)
                            .toDouble()
                    betamethasoneDoseTV.text = betamethasoneDose.toString()
                    var dexamethasoneDose =
                        (dose * 1.25).toBigDecimal().setScale(2, RoundingMode.UP)
                            .toDouble()
                    dexamethasoneDoseTV.text = dexamethasoneDose.toString()
                    var hydrocortisoneDose =
                        (dose * 33.34).toInt()
                    hydrocortisoneDoseTV.text = hydrocortisoneDose.toString()
                    var triamcinoloneDose =
                        (dose * 6.66).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    triamcinoloneDoseTV.text = triamcinoloneDose.toString()
                    var methylprednisoloneDose =
                        (dose * 6.66).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    methylprednisoloneDoseTV.text = methylprednisoloneDose.toString()
                }
                if (drugFromSelect == "Cortisone") {
                    var PrednisoloneDose =
                        (dose * 0.2).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    PrednisoloneDoseTV.text = PrednisoloneDose.toString()
                    var CortisoneDose =
                        (dose * 1).toInt()
                    cortisoneDoseTV.text = CortisoneDose.toString()
                    var betamethasoneDose =
                        (dose * 0.024).toBigDecimal().setScale(1, RoundingMode.HALF_EVEN)
                            .toDouble()
                    betamethasoneDoseTV.text = betamethasoneDose.toString()
                    var dexamethasoneDose =
                        (dose * 0.03).toBigDecimal().setScale(2, RoundingMode.UP)
                            .toDouble()
                    dexamethasoneDoseTV.text = dexamethasoneDose.toString()
                    var hydrocortisoneDose =
                        (dose * 0.8).toInt()
                    hydrocortisoneDoseTV.text = hydrocortisoneDose.toString()
                    var triamcinoloneDose =
                        (dose * 0.16).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    triamcinoloneDoseTV.text = triamcinoloneDose.toString()
                    var methylprednisoloneDose =
                        (dose * 0.16).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    methylprednisoloneDoseTV.text = methylprednisoloneDose.toString()
                }
                if (drugFromSelect == "Triamcinolone") {
                    var PrednisoloneDose =
                        (dose * 1.25).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    PrednisoloneDoseTV.text = PrednisoloneDose.toString()
                    var CortisoneDose =
                        (dose * 6.25).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    cortisoneDoseTV.text = CortisoneDose.toString()
                    var betamethasoneDose =
                        (dose * 0.15).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    betamethasoneDoseTV.text = betamethasoneDose.toString()
                    var dexamethasoneDose =
                        (dose * 0.1875).toBigDecimal().setScale(2, RoundingMode.UP)
                            .toDouble()
                    dexamethasoneDoseTV.text = dexamethasoneDose.toString()
                    var hydrocortisoneDose =
                        (dose * 5).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    hydrocortisoneDoseTV.text = hydrocortisoneDose.toString()
                    var triamcinoloneDose =
                        (dose * 1).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    triamcinoloneDoseTV.text = triamcinoloneDose.toString()
                    var methylprednisoloneDose =
                        (dose * 1).toBigDecimal().setScale(1, RoundingMode.UP)
                            .toDouble()
                    methylprednisoloneDoseTV.text = methylprednisoloneDose.toString()
                }

            }
        }
    }
}



