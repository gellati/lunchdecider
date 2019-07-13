package org.gellati.lunchdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.gellati.lunchdecider.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val restaurants = arrayListOf("Sirkku", "Viherlatva", "Antell", "Blancco")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRestaurantInput.text.clear()
        selectedRestaurantText.text

        // difference between setOnClickListner() and setOnClickListener{}
        decideButton.setOnClickListener {
            val random = Random()
            val randomRestaurant = random.nextInt(restaurants.count())
            selectedRestaurantText.text = restaurants[randomRestaurant]
        }

        addRestaurantButton.setOnClickListener {
            val newRestaurant = addRestaurantInput.text.toString()
            restaurants.add(newRestaurant)
            addRestaurantInput.text.clear()
        }


    }
}
