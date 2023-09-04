package org.ef.behavioral.mediator;

public class Member implements User {
    OTC otc;
    String name;

    public Member(OTC otc, String name) {
        this.otc = otc;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendDeal(String deal) {
        otc.sendDeal(deal, this);
    }

    @Override
    public void getDeal(String deal) {
        System.out.println(this.name + " receiving deal offer: " + deal + ".");
    }
}
