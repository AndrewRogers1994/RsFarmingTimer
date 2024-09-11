package com.rogersco.rsfarmingtimer

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

var buttons : MutableList<RadioButton> = ArrayList();
class AllotmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_allotment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupRadioButtons();
    }

    private fun setupRadioButtons() {
        buttons.add(findViewById(R.id.potatoButton));
        buttons.add(findViewById(R.id.onionButton));
        buttons.add(findViewById(R.id.cabbageButton));
        buttons.add(findViewById(R.id.tomatoButton));
        buttons.add(findViewById(R.id.sweetcornButton));
        buttons.add(findViewById(R.id.strawberryButton));
        buttons.add(findViewById(R.id.watermelonButton));
        buttons.add(findViewById(R.id.snapeGrassButton));

        val onClick = { view: View ->
            for(btn in buttons)
            {
                if(btn.id != view?.id)
                {
                    btn.isChecked = false;
                }
            }
        }

        for (btn in buttons)
        {
            btn.setOnClickListener(onClick)
        }
    };
}