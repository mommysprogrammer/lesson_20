package com.example.lesson_20

import android.os.Bundle
import android.text.InputType
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), TextView.OnEditorActionListener {

    private var editSearch: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editSearch = findViewById(R.id.editTextTextPersonName2)
        editSearch?.inputType = InputType.TYPE_CLASS_TEXT
        editSearch?.setOnEditorActionListener(this)

    }

    override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            if (editSearch?.text.toString() != "cat") {
                Toast.makeText(this, "Не буду ничего искать!", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        return false
    }
}
