package com.example.wordle

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private val word= FourLetterWordList().getRandomFourLetterWord()
    //private var result=""

    private fun checkGuess(guess: String) : String {
         var result=""
        for (i in 0..3) {
            if (guess[i] == word[i]) {
                result += "O"
            }
            else if (guess[i] in word) {
                result += "+"
            }
            else {
                result += "X"
            }
        }
        return result

        //val textView = findViewById<TextView>(R.id.textView4)
        //textView.setText(result).toString()
        //val textViewValue = textView.text

    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val wordList =  FourLetterWordList()
        val word = wordList.getRandomFourLetterWord()
        val editText = findViewById<EditText>(R.id.editTextTextPersonName2)
        var count =0 ;

        button.setOnClickListener {
             count++


            if(count == 1){

                val userguess1: String = editText.text.toString()
                val guess1 = findViewById<TextView>(R.id.textView3)
                guess1.setText("guess#1 $userguess1").toString()
                val textViewValue1 = guess1.text

                val result1 = checkGuess(userguess1)
                val checkguess1 = findViewById<TextView>(R.id.textView4)
                checkguess1.setText("Check guess#1  $result1").toString()
                val textViewValue2 = checkguess1.text
            }
            if(count==2){

                val userguess2: String = editText.text.toString()
                val guess2 = findViewById<TextView>(R.id.textView5)
                guess2.setText("guess#2 $userguess2").toString()
                val textViewValue1 = guess2.text

                val result2 = checkGuess(userguess2)
                val checkguess2 = findViewById<TextView>(R.id.textView8)
                checkguess2.setText("Check guess#2  $result2").toString()
                val textViewValue = checkguess2.text

            }
            if(count==3){
                val userguess3: String = editText.text.toString()
                val guess3 = findViewById<TextView>(R.id.textView7)
                guess3.setText("guess#3 "+ userguess3).toString()
                val textViewValue1 = guess3.text

                val result1 = checkGuess(userguess3)
                val checkguess3 = findViewById<TextView>(R.id.textView6)
                checkguess3.setText("Check guess#3  "+result1).toString()
                val textViewValue = checkguess3.text

            }
            if(count==4){
                button.isEnabled=false
                val words = findViewById<EditText>(R.id.editTextTextPersonName)
                words.setVisibility(View.VISIBLE);
                words.setText("WORD  $word").toString()

            }





           // }
            //Toast.makeText(it.context, "You have 3 attempts only!", Toast.LENGTH_SHORT).show()

                // Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()

                    }

     }
                }























