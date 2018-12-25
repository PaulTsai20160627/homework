package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets :")
    var NumbersOfTotalTicket = scanner.nextInt()
    println("How many round-trip tickets :")
    var NumbersOfReturnTicket = scanner.nextInt()
    val Ticket  = Ticket1(NumbersOfTotalTicket,NumbersOfReturnTicket)
    println("Total tickets: $NumbersOfTotalTicket\n" +
            "Round-trip: $NumbersOfReturnTicket\n" +
            "Total: ${Ticket.TotalAmount()}")
}


class Ticket1(var TotalNumbersOfTickets : Int , var NumbersOfReturnTickets : Int ){
    var NumbersOfOneWayTickets : Int
    val PricesOfOneWayTicket : Int = 1000
    val Discount : Float = 0.9f
    val PricesOfReturnTicket : Float = 2000 * Discount

    init{
        NumbersOfOneWayTickets = TotalNumbersOfTickets - NumbersOfReturnTickets
    }
    fun TotalAmount() : Float{
        var TotalAmount : Float = (NumbersOfOneWayTickets * PricesOfOneWayTicket ) + (NumbersOfReturnTickets * PricesOfReturnTicket)
        return TotalAmount
    }
}