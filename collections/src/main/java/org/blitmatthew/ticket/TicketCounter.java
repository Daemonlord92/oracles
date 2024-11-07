package org.blitmatthew.ticket;

import java.util.LinkedList;
import java.util.Queue;

public class TicketCounter {
    private Queue<String> tickets = new LinkedList<>();

    public void joinLine(String person) {
        tickets.add(person);
        System.out.println(person.concat(" joined the ticket line."));
    }

    public void processTicket() {
        while (!tickets.isEmpty()) {
            String person = tickets.poll();
            System.out.println(person.concat(" got a ticket."));

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All tickets issued.");
    }

    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        ticketCounter.joinLine("Haqmal");
        ticketCounter.joinLine("Yohanes");
        ticketCounter.joinLine("Wilfred");
        ticketCounter.joinLine("Fawad");
        ticketCounter.processTicket();
    }
}
