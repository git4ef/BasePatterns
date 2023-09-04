package org.ef.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SomeGroupOTC implements OTC {
    Member member;
    List<User> userList = new ArrayList<>();

    public void addMemberToGroup(Member member) {
        this.userList.add(member);
    }

    @Override
    public void sendDeal(String deal, User user) {
        for (User u : userList) {
            if (u != user) {
                u.getDeal(deal);
            }
        }
    }
}
