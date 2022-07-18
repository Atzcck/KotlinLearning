package com.alptazecicek.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables && Constants

        var x = 5
        var y = 4
        println(x * y)
        var age = 35
        println(age/7*5)

        val name = "JAMES"
        val a = 5

        //Defining
        var myInteger : Int
        //Inıtialize
        myInteger = 23
        val b : Int = 5

        //Double && Float

        val pi = 3.14
        println(pi * 2.0)
        val myFloat = 3.14f
        println(myFloat * 2)
        //camelCase
        //snake_case

        //String
        val myString = "alp Tazeçiçek"
        println(myString.capitalize())

        //Boolean

        println(3<5)
        println(5<3)

        //Conversion
        var myNumber = 5
        var myLongNumber = myNumber.toLong()

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)

        //Collections

        //Arrays
        val myArray = arrayOf("james","kirk","Rob","Lars")
        val myDoubleArray = doubleArrayOf(1.0,2.3,3.4)
        val myMixedArray = arrayOf("Atil", 5)
        println(myMixedArray[0])
        println(myMixedArray[1])


        //Lists -arrayList

        val myMusician = arrayListOf<String>("James", "Lars")
        myMusician.add("Kirk")
        println(myMusician[2])
        myMusician.add(0, "Rob")
        println(myMusician[0])

        val myList  = ArrayList<Int>()
        myList.add(1)
        myList.add(2)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("james")
        myMixedArrayList.add(2)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])


        //SET

        val myExampleArray = arrayOf(1,2,3,4)
        println("First element of the array : ${myExampleArray[0]}")

        val mySet = setOf<Int>(1,2,2,3)
        println(mySet.size)         // Set is evaluate same array elements as one element.
                                    // Same thing happens in string variables too.

        //For each
        mySet.forEach { println(it * 3) } // 3 6 9

        val myStringSet = HashSet<String>()
        myStringSet.add("Atil")
        myStringSet.add("Atil")
        println(myStringSet.size)

        //Map - HashMap

        //Key - Value

        val fruitCalorieMap = hashMapOf<String, Int>()
        fruitCalorieMap.put("Apple", 100)
        fruitCalorieMap.put("Banana", 150)
        println(fruitCalorieMap["Apple"])

        val myHashMap = HashMap<String, String>()
        myHashMap.put("..", "...")

        val myNewMap = hashMapOf<String,Int>("A" to 1, "B" to 2)
        println(myNewMap["A"])

        //IF Control
        //same as java

        //Switch - When

        val day = 3
        var dayString = ""

        when(day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }

        println(dayString)

        //Loops

        //for Loop

        val myArrayofNumbers = arrayOf(12, 15, 18, 21, 24, 27, 30, 33)
        var newVariable = myArrayofNumbers[0]/3*5
        println(newVariable)

        for (number in myArrayofNumbers) {
            val z = number / 3 * 5
            println(z)
        }

        for ( i in  myArrayofNumbers.indices) {
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Alp")
        myStringArrayList.add("Gamze")
        myStringArrayList.add("Tuna")
        myStringArrayList.add("Seren")

        for (names in myStringArrayList) {
            println(names)
        }

        myStringArrayList.forEach { println(it) }

        //While Loop

        var j = 0
        while (j<10) {
            j++
            println(j)
        }

    }
}