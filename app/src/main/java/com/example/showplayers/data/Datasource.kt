package com.example.showplayers.data

import com.example.showplayers.R
import com.example.showplayers.entity.Player

class Datasource {
    fun loadPlayers(): List<Player> {
        return listOf(
            Player(R.string.player01),
            Player(R.string.player02),
            Player(R.string.player03),
            Player(R.string.player04),
            Player(R.string.player05),
            Player(R.string.player06),
            Player(R.string.player07),
            Player(R.string.player08),
            Player(R.string.player09),
            Player(R.string.player10))
    }
}