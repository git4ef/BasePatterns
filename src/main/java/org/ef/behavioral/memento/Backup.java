package org.ef.behavioral.memento;

import java.util.Date;

public class Backup {
    private final String nameVM;
    private final Date date;

    public Backup(String nameVM) {
        this.nameVM = nameVM;
        this.date = new Date();
    }

    public String getNameVM() {
        return nameVM;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Backup{" +
                "nameVM='" + nameVM + '\'' +
                ", date=" + date +
                '}';
    }
}
