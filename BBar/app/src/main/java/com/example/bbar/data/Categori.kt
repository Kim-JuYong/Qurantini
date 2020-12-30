package com.example.bbar.data

class Categori(val scheduletype: Int, val withtype: Int, val readytype: Int, val tastetype: Int) {
    //일정(light, normal, hard)
   val schedule = scheduletype
//    init{
//        when(scheduletype){
//            1 -> schedule = "light"
//            2 -> schedule = "normal"
//            3 -> schedule = "hard"
//            else -> schedule = ""
//        }
//    }

    //누구와(love, friend)
    val with = withtype
//    init{
//        when(withtype){
//            1 -> with = "love"
//            2 -> with = "friend"
//            else -> with = ""
//        }
//    }

    //준비된 술(jin, wisky, liquer, wine, etc)
    val ready = readytype
//    init{
//        when(readytype){
//            1 -> ready = "jin"
//            2 -> ready = "wisky"
//            3 -> ready = "liquer"
//            4 -> ready = "wine"
//            5 -> ready = "etc"
//            else -> ready = ""
//        }
//    }
    //어떤 맛(sweet, dry, smell)
    val taste = tastetype
//    init{
//        when(tastetype){
//            1 -> taste = "sweet"
//            2 -> taste = "dry"
//            3 -> taste = "smell"
//            else -> taste = ""
//        }
//    }
}