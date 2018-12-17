package com.example.buddy.a4_1712app

class Round(R: Double =0.0) {
    val PI = Math.PI
    var R : Double = 0.0
    var S : Double = 0.0
    var P : Double = 0.0
    fun Round(R: Double)
    {
        this.R = R
        P = perim()
        S = square()
    }
    fun square(): Double =PI*Math.pow(R,2.0)
    fun perim(): Double =PI*2*R
}