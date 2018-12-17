package com.example.buddy.a4_1712app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var spinner_figure: Spinner

    var P: Double = 0.0
    var S: Double = 0.0
    val figures = arrayOf(" - - Choose Figure - - ","Krugliy", "Treugolniy", "Pryamougolniy")
    var Rect:Rectalnyj = Rectalnyj()
    var Tria:Triangle = Triangle()
    var Roun:Round = Round()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner_figure = findViewById<Spinner>(R.id.spinner_figure)
        if (spinner_figure != null) {

            val adapter = ArrayAdapter(
                this, // Context
                android.R.layout.simple_spinner_item, // Layout
                figures // Array
            )

            // Set the drop down view resource
            adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)

            // Finally, data bind the spinner object with dapter
            spinner_figure.adapter = adapter;

            // Set an on item selected listener for spinner object
            spinner_figure.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    // Display the selected item text on text view
                    //text_view.text = "Spinner selected : ${parent.getItemAtPosition(position).toString()}"
                    val figname:String = "${parent.getItemAtPosition(position).toString()}"
                    when (figname) {
                        "Krugliy" -> CreateRnd()
                        "Treugolniy" -> CreateTri()
                        "Pryamougolniy" -> CreateRec()
                        else -> MakeHimChoose()
                    }



                }
            }


        }


    }


    fun CreateRnd()
    {

    }

    fun CreateTri()
    {

    }

    fun CreateRec()
    {

    }


    fun MakeHimChoose()
    {
        editText1.visibility = View.INVISIBLE
        editText2.visibility = View.INVISIBLE
        editText3.visibility = View.INVISIBLE
        editText4.visibility = View.INVISIBLE
        buttonCount.visibility = View.INVISIBLE
        textViewP.visibility = View.INVISIBLE
        textViewS.visibility = View.INVISIBLE
        imageViewfigure.setImageBitmap(@drawable.)

        Toast.makeText(this, "Choose the figure, buddy!",Toast.LENGTH_SHORT).show()
    }


}