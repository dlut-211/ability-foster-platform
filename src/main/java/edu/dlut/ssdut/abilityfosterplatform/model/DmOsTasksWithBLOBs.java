package edu.dlut.ssdut.abilityfosterplatform.model;

public class DmOsTasksWithBLOBs extends DmOsTasks {
    private byte[] taskAddress;

    private byte[] workerAddress;

    private byte[] hostAddress;

    private byte[] parentTaskAddress;

    public byte[] getTaskAddress() {
        return taskAddress;
    }

    public void setTaskAddress(byte[] taskAddress) {
        this.taskAddress = taskAddress;
    }

    public byte[] getWorkerAddress() {
        return workerAddress;
    }

    public void setWorkerAddress(byte[] workerAddress) {
        this.workerAddress = workerAddress;
    }

    public byte[] getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(byte[] hostAddress) {
        this.hostAddress = hostAddress;
    }

    public byte[] getParentTaskAddress() {
        return parentTaskAddress;
    }

    public void setParentTaskAddress(byte[] parentTaskAddress) {
        this.parentTaskAddress = parentTaskAddress;
    }
}