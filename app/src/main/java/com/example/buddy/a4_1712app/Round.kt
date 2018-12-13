package com.example.buddy.a4_1712app

class Round(var r: Double =0.0) {
    val PI = Math.PI
    var S : Double = 0.0
    var P : Double = 0.0
    fun Round(r: Double)
    {
        P = perim()
        S = square()
    }
    fun square(): Double =PI*Math.pow(r,2.0)
    fun perim(): Double =PI*2*r
}