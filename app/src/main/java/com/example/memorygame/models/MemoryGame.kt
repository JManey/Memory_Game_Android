package com.example.memorygame.models

import com.example.memorygame.utils.DEFAULT_ICONS

class MemoryGame(private val boardSize: BoardSize) {


    val cards: List<MemoryCard>
    val numPairsFound = 0

    init {
        val chosenImages :List<Int> = DEFAULT_ICONS.shuffled().take(boardSize.getNumPairs())
        val randomizedImages : List<Int> = (chosenImages + chosenImages).shuffled()
        cards = randomizedImages.map { MemoryCard(it) }
    }

    fun flipCard(position: Int) {
        val card : MemoryCard = cards[position]
        card.isFaceUp = !card.isFaceUp
    }
}