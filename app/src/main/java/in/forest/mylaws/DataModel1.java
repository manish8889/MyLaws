package in.forest.mylaws;

public class DataModel1 {
    private String Head;
    private String CrPC;
    private String BNSS;
    private String Provisions;

    public DataModel1(String Head, String CrPC, String BNSS, String Provisions) {
        this.Head = Head;
        this.CrPC = CrPC;
        this.BNSS = BNSS;
        this.Provisions = Provisions;
    }

    public String getHead() {
        return Head;
    }

    public String getCrPC() {
        return CrPC;
    }

    public String getBNSS() {
        return BNSS;
    }

    public String getProvisions() {
        return Provisions;
    }
}
