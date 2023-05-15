package org.export.survey

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val angle = findViewById<TextView>(R.id.angle)
        val distanse = findViewById<TextView>(R.id.distance)
        val cancel = findViewById<TextView>(R.id.cancel)
        val bracket = findViewById<TextView>(R.id.bracket)
        val equal = findViewById<TextView>(R.id.equal)
        val division = findViewById<TextView>(R.id.division)
        val multiple = findViewById<TextView>(R.id.multiple)
        val plus = findViewById<TextView>(R.id.plus)
        val minus = findViewById<TextView>(R.id.minus)
        val rest = findViewById<TextView>(R.id.rest)
        val point = findViewById<TextView>(R.id.point)
        val changsign = findViewById<TextView>(R.id.changsign)

        val one = findViewById<TextView>(R.id.one)
        val two = findViewById<TextView>(R.id.two)
        val three = findViewById<TextView>(R.id.three)
        val four = findViewById<TextView>(R.id.four)
        val five = findViewById<TextView>(R.id.five)
        val six = findViewById<TextView>(R.id.six)
        val seven = findViewById<TextView>(R.id.seven)
        val eight = findViewById<TextView>(R.id.eight)
        val nine = findViewById<TextView>(R.id.nine)
        val zero = findViewById<TextView>(R.id.zero)

        var calculate = findViewById<TextView>(R.id.calculate)
        var result = findViewById<TextView>(R.id.result)

        val AngleActivity = Intent(this, Angle::class.java)
        angle.setOnClickListener {
            startActivity(AngleActivity)
        }

        val DistanceActivity = Intent(this, Distance::class.java)
        distanse.setOnClickListener {
            startActivity(DistanceActivity)
        }

    }
}