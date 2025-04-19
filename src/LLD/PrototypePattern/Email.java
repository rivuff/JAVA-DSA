package LLD.PrototypePattern;

public class Email implements Copyable<Email>{
    private String sender;
    private String reciever;
    private String body;

    Email(String sender, String receiver, String body){
        this.sender = sender;
        this.reciever = receiver;
        this.body = body;
    }

    Email(Email email){
        this.sender = email.sender;
        this.reciever = email.reciever;
        this.body = email.body;
    }

    @Override
    public Email copy() {
        return new Email(this);
    }
}
