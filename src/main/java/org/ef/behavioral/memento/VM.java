package org.ef.behavioral.memento;

import java.util.Date;

public class VM {
    private String name;
    private Date timeBackup;

    public void setTimeBackup(String name) {
        this.name = name;
        this.timeBackup = new Date();
    }

    public Backup backup() {
        return new Backup(name);
    }

    public void restore(Backup backup) {
        name = backup.getNameVM();
        timeBackup = backup.getDate();
    }

    @Override
    public String toString() {
        return "VM{" +
                "name='" + name + '\'' +
                ", timeBackup=" + timeBackup +
                '}';
    }
}
