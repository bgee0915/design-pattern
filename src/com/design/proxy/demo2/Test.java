package com.design.proxy.demo2;

public class Test {
    public static void main(String[] args){
        Ticket t = new ProxyStation();
        t.ticket();
        t.ticketChanges();
        t.returnTicket();
    }
}
