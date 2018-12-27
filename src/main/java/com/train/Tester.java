package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int totalnumbers = 0;
        while(totalnumbers!=-1){
            System.out.println("Please enter number of tickets :");
            Scanner scanner = new Scanner(System.in);
            totalnumbers = scanner.nextInt();
            if(totalnumbers==-1) break;
            System.out.println("How many round-trip tickets :");
            int roundtripnumbers = scanner.nextInt();
            Ticket ticket = new Ticket(totalnumbers,roundtripnumbers);
            System.out.println("Total tickets: "+totalnumbers+"\n"+
                    "Round-trip:"+ roundtripnumbers+"\n"+
                    "Total:"+ ticket.TotalAmount());
        }
    }
}
