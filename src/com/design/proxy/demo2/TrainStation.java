package com.design.proxy.demo2;

public class TrainStation implements Ticket {
    @Override
    public void ticket() {
        System.out.println("TrainStation:  buy ticket");
    }

    @Override
    public void returnTicket() {
        System.out.println("TrainStation: return ticket");
    }

    @Override
    public void ticketChanges() {
        System.out.println("TrainStation: ticket changes");
    }
}
