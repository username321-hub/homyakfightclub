class CLUB {
    var m = 0
    var coins = 0
    private var a = 0
    fun choosing() {

        println(
            "choose your fighter!"
                    + "1.small homa(FREE)"
                    + "2.homa(50 COINS)"
                    + "3.mega homa(75 COINS)"
        )
        a = readLine().toString().toInt()
        if (a == 1) {
            println("you chose the small homa!")
            var smallhoma: homyaki = homyaki(15, 15, 15)
        }
        if (a == 2) {
            if (coins < 50) {
                println("ПIШОВ ОТСЮДА, РОЗБИЙНИК!")

            } else {
                coins -= 50
                println("you chose the homa!")
                var homa: homyaki = homyaki(25, 25, 25)
            }
            if (a == 3) {
                if (coins < 75) {
                    println("ПIШОВ ОТСЮДА, РОЗБИЙНИК!")
                } else {
                    coins -= 75
                    println("you chose the mega homa!!!")
                    var megahoma: homyaki = homyaki(50, 50, 50)
                }
                if (a == 4) {
                    println("you chose the SECRET ULTRA HOMA!!!")
                    var ULTRAHOMA: homyaki = homyaki(100, 100, 100)
                }

            }


        }
    }

    fun fight() {
        println(
            "choose your enemy!"
                    + "1.small homa(10 coins)"
                    + "2.homa( 50 coins )"
                    + "3.mega homa (100 coins )"
        )
        var b = readLine().toString().toInt()
        if (b == 1) {
            println("you will fight with the small homa!")
            println("YOU WIN!")
            coins += 10
            println("+ 10 COINS")
        }
        if (b == 2) {
            println("you will fight with the homa!")
            if (a < 2) {
                println("YOU DIED!")
            } else {
                println("YOU WIN!")
                coins += 50
                println("+ 50 COINS")
            }
        }
        if (b == 3) {
            println("you will fight with the mega homa!!!")
            if (a < 3) {

                println("YOU DIED!")
            } else {
                println("YOU WIN!")
                coins += 100
                println("+ 100 COINS")
            }
        }
        if (b == 4) {
            println("you will fight with the ULTRA HOMA!!!")

            if (a < 4) {
                println("YOU DIED!")
            } else {
                println("YOU WIN!")
                coins += 1000
                println("+ 1000 COINS")
            }
        }
        println("YOU HAVE"+coins+"COINS")
    }


}
