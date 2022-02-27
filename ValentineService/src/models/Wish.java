package models;

public class Wish {

    private double id;
    private String text;
    private models.Subscriber sender;
    private models.Subscriber receipt;

    public Wish() { }

    public Wish(String text, models.Subscriber sender, models.Subscriber receipt) {
        this.id = Math.random();
        this.sender = sender;
        this.receipt = receipt;
        this.text = text;
    }

    public double getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public models.Subscriber getSender() {
        return sender;
    }

    public void setSender(models.Subscriber sender) {
        this.sender = sender;
    }

    public models.Subscriber getReceipt() {
        return receipt;
    }

    public void setReceipt(models.Subscriber receipt) {
        this.receipt = receipt;
    }
}
