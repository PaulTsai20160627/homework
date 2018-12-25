package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tickets :");
        Scanner scanner = new Scanner(System.in);
        int totalnumbers = scanner.nextInt();
        System.out.println("How many round-trip tickets :");
        int roundtripnumbers = scanner.nextInt();
        Ticket ticket = new Ticket(totalnumbers,roundtripnumbers);
        System.out.println("Total tickets: "+totalnumbers+"\n"+
        "Round-trip:"+ roundtripnumbers+"\n"+
        "Total:"+ ticket.TotalAmount());
    }
}
