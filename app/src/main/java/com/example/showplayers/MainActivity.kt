package com.example.showplayers

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.showplayers.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView);
        textView.append("Load ${Datasource().loadPlayers().size} players")

    }

    fun loadPlayers(view: View){
        val data = Datasource().loadPlayers()

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = ""
        for(player in data) {
            textView.append(resources.getString(player.stringResourceId) + "\n");
        }
    }
}