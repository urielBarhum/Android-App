package com.example.urielbarhum

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.urielbarhum.ui.theme.UrielBarhumTheme
import java.util.logging.Level
import java.util.logging.Logger

class MainActivity : ComponentActivity() {
    var logger = Logger.getLogger("MainActivity")
    lateinit var textHeader: TextView
    lateinit var mailInput: EditText
    lateinit var textpasword: TextView
    lateinit var textInput: EditText
    lateinit var btn: Button
    lateinit var printt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        textHeader = findViewById(R.id.textheader)
        mailInput = findViewById(R.id.mailinput)
        textpasword = findViewById(R.id.textView4)
        textInput = findViewById(R.id.textpassword)
        btn = findViewById(R.id.button)
        printt = findViewById(R.id.textView5)


        btn.setOnClickListener {
            logger.log(Level.INFO, textInput.text.toString())
            logger.log(Level.INFO, mailInput.text.toString())

            textInput.text = mailInput.text

            if (mailInput.text.toString().length < 5 && mailInput.text.contains('@')
                && textpasword.text.length < 8
            ){

            }
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        logger.log(Level.INFO, "i am from destroy")
    }
}