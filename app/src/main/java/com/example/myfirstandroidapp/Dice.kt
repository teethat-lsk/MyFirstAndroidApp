package com.example.myfirstandroidapp

class Dice(val sides:Int) {
    fun roll() : Int {
        return (1..sides).random()
    }
}