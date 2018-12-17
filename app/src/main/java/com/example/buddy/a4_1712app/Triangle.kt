package com.example.buddy.a4_1712app

import android.widget.Toast

class Triangle ()
{
    var A: Double = 0.0
    var B: Double = 0.0
    var C: Double = 0.0
    var P: Double = 0.0
    var S: Double = 0.0

    fun Triangle(A: Double, B: Double, C: Double)
    {
        if (!( (A+C<B)&&(A+B<C)&&(B+C<A) ))
        {
            this.A =0.0
            this.B =0.0
            this.C =0.0
            this.P =0.0
            this.S =0.0
        }

        this.P = perim()
        this.S = square()

    }
    fun perim(): Double = A+B+C
    fun square(): Double = Math.sqrt(Math.abs(P/2*(P/2-A)*(P/2-B)*(P/2-C)))
}