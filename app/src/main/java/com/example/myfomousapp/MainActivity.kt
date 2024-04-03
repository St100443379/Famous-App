package com.example.myfomousapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    // initialize

    private lateinit var search_button: Button
    private lateinit var clear_button: Button
    private lateinit var resulttextView: TextView
    private lateinit var ageInput: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        search_button = findViewById(R.id.search_button)
        clear_button  = findViewById(R.id.clear_button)
        ageInput  = findViewById(R.id.ageInput)
        resulttextView = findViewById(R.id.resulttextView)



        search_button.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {

                val famousPerson = when (age) {
                    20 -> "Cameron Boyce,He is an actor that worked for disney movies and shows."
                    39 -> "Martin Luther King,He was an activist who led many nonviolent protests with his famous i had a dream speech."
                    41 -> "Kobe Bryant, He was a famous basketball player and holds the record of the most points in a game which is 81."
                    50 -> "Michael Jackson, He was a famous artist and had the name of King of Pop."
                    60 -> "Diego Mara dona, A Football player that was one of the best in his generation and had the famous goal called the Hand of God."
                    63 -> "Robin Williams, He was an actor and comedian with famous movies like Aladdin."
                    70 -> "Marco Polo,he was an italian sailor that travelled with Christopher Columbus."
                    82 -> "Pele, He was a football player and is a player with the most World cups."
                    96 -> "Queen Elizabeth,She was long serving queen and was in monarch of 15 realms since her lifetime."
                    100 -> "Gly dis Jones, She was a british actor which she appeared in 60 films and 30 plays."
                    else -> null

                }

                val message = if (famousPerson != null) "You are of $famousPerson"
                else "No Famous Figure found within the entered age"
                resulttextView.text = message

            } else {
                resulttextView.text = "Invalid input. Please enter a valid age between 20 and 100"
            }



            search_button.setOnClickListener {
                ageInput.text.clear()
                resulttextView.text = ""

            }
        }
    }
}