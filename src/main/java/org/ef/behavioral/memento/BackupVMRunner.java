package org.ef.behavioral.memento;

public class BackupVMRunner {
    public static void main(String[] args) throws InterruptedException {
        VM vm = new VM();
        BackupStorage backupStorage = new BackupStorage();

        System.out.println("Create VM-101");
        vm.setTimeBackup("VM-101");
        System.out.println(vm);

        System.out.println("Backup current state to backup storage. v1");
        backupStorage.setBackup(vm.backup());

        System.out.println("Some changes in VM");
        Thread.sleep(5000);
        vm.setTimeBackup("VM-101");
        System.out.println(vm);
        System.out.println("VM crashes");

        System.out.println("Backup to v1");
        vm.restore(backupStorage.getBackup());

        System.out.println("VM after backup: ");
        System.out.println(vm);
    }
}
