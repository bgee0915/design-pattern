package com.design.proxy.demo2;

public class ProxyStation implements Ticket{
    TrainStation t = new TrainStation();

    @Override
    public void ticket() {
        System.out.println("ProxyStation: buy ticket ");
    }

    @Override
    public void returnTicket() {
        t.returnTicket();
    }

    @Override
    public void ticketChanges() {
        t.ticketChanges();
    }
}
