//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {


    var pasada: Int = 0

    var rtaJugador1: Int
    var rtaJugador2: Int

    var puntoJ1: Int = 0
    var puntoJ2: Int = 0



    do{

        rtaJugador1 = Random.nextInt(1,4)
        rtaJugador2 = Random.nextInt(1,4)

        //println("Jugador 1: $rtaJugador1 vs Jugador 2: $rtaJugador2")

        when(rtaJugador1){
            1 -> println("Jugador 1: piedra")
            2 -> println("Jugador 1: papel")
            3 -> println("Jugador 1: tijera")
        }

        when(rtaJugador2){
            1 -> println("Jugador 2: piedra")
            2 -> println("Jugador 2: papel")
            3 -> println("Jugador 2: tijera")
        }

        if(rtaJugador1 ==  rtaJugador2){
            println("Empate\n")
        } else if(rtaJugador1 == 2 &&  rtaJugador2 == 1){
            puntoJ1++
            println("Puntos J1: $puntoJ1 vs Puntos J2: $puntoJ2\n")
        } else if(rtaJugador1 == 3 &&  rtaJugador2 == 1){
            puntoJ2++

            println("Puntos J1: $puntoJ1 vs Puntos J2: $puntoJ2\n")
        } else if(rtaJugador1 == 3 &&  rtaJugador2 == 2){
            puntoJ1++

            println("Puntos J1: $puntoJ1 vs Puntos J2: $puntoJ2\n")
        } else if(rtaJugador2 == 2 && rtaJugador1 == 1){
            puntoJ2++

            println("Puntos J1: $puntoJ1 vs Puntos J2: $puntoJ2\n")
        }else if(rtaJugador2 == 3 && rtaJugador1 == 1){
            puntoJ1++

            println("Puntos J1: $puntoJ1 vs Puntos J2: $puntoJ2\n")
        }else if(rtaJugador2 == 3 && rtaJugador1 == 2){
            puntoJ2++
            println("Puntos J1: $puntoJ1 vs Puntos J2: $puntoJ2\n")
        }
        pasada++
    }while (puntoJ1<=2 && puntoJ2<=2)


    if(puntoJ1 > puntoJ2){
        println("Ganador: Jugador 1")
    } else if (puntoJ1 < puntoJ2){
        println("Ganador: Jugador 2")
    }

}