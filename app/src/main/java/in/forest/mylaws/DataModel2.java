package in.forest.mylaws;

public class DataModel2 {
    private String crimeHead;
    private String ipc;
    private String bns;
    private String punishment;

    public DataModel2(String crimeHead, String ipc, String bns, String punishment) {
        this.crimeHead = crimeHead;
        this.ipc = ipc;
        this.bns = bns;
        this.punishment = punishment;
    }

    public String getCrimeHead() {
        return crimeHead;
    }

    public String getIPC() {
        return ipc;
    }

    public String getBNS() {
        return bns;
    }

    public String getPunishment() {
        return punishment;
    }
}
