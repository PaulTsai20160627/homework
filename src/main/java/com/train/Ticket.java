package com.train;

public class Ticket {

    int PriceOfOneWayTicket = 1000;
    float Discount = 0.9f;
    float PriceOfReturnTicket = 2000*Discount;
    int NumbersOfTotalTickets;
    int NumbersOfReturnTickets;
    int NumbersOfOneWayTickets;

    public Ticket(int NumbersOfTotalTickets, int NumbersOfReturnTickets){
        this.NumbersOfTotalTickets = NumbersOfTotalTickets;
        this.NumbersOfReturnTickets = NumbersOfReturnTickets;
    }
    public float TotalAmount(){
        NumbersOfOneWayTickets = NumbersOfTotalTickets - NumbersOfReturnTickets;
        float total = (NumbersOfTotalTickets * PriceOfOneWayTicket) + (NumbersOfReturnTickets * PriceOfReturnTicket);
        return total;
    }
}
