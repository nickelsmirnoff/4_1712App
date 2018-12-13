package com.example.buddy.a4_1712app

class Rectalnyj ()
{
    var x1: Double=0.0
    var x2: Double=0.0
    var y1: Double=0.0
    var y2: Double=0.0

    fun Rectalnyj(A : Double, B : Double )
    {
        x1 = 0.0
        x2 = A
        y1 = 0.0
        y2 = B
    }

    fun Rectalnyj(x1: Double,x2: Double,y1: Double,y2: Double)
    {
        this.x1 = x1
        this.x2 = x2
        this.y1 = y1
        this.y2 = y2
    }

    fun square(): Double = Math.abs((x1 - x2)) * Math.abs((y1 - y2))
    fun perim(): Double = Math.abs((x1 - x2)) * 2 + Math.abs((y1 - y2)) * 2
}