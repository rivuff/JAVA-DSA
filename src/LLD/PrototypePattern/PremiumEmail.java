package LLD.PrototypePattern;

public class PremiumEmail extends Email {

    private String cc;
    private String bcc;

    public PremiumEmail(String sender, String receiver, String body, String cc, String bcc){
        super(sender, receiver, body);
        this.cc = cc;
        this.bcc = bcc;
    }

    private PremiumEmail (PremiumEmail source){
        super(source);
        this.cc = source.cc;
        this.bcc = source.bcc;
    }

    @Override
    public PremiumEmail copy() {
        return new PremiumEmail(this);
    }

    public String getCc() {
        return cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }
}
