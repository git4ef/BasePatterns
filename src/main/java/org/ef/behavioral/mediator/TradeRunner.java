package org.ef.behavioral.mediator;

public class TradeRunner {
    public static void main(String[] args) {
        SomeGroupOTC someGroupOTC = new SomeGroupOTC();
        Member member1 = new Member(someGroupOTC,"group member1");
        Member member2 = new Member(someGroupOTC,"group member2");
        Member member3 = new Member(someGroupOTC,"group member3");
        Member member4 = new Member(someGroupOTC,"group member4");

        someGroupOTC.addMemberToGroup(member1);
        someGroupOTC.addMemberToGroup(member2);
        someGroupOTC.addMemberToGroup(member3);
        someGroupOTC.addMemberToGroup(member4);

        member1.sendDeal("WTS #meme, 4$ per token.");
        System.out.println("\n=========================================\n");
        member2.sendDeal("WTB #lfg, 5$ per token.");
    }
}
