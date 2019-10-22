import java.sql.Date;

public class Mail {
    private String ordernumber;
    private String owner;
    private double weight;
    public Date sending;
    public Date issue;

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Mail(String ordernumber, String owner,
                   double weight, Date sending, Date issue) {
        this.ordernumber = ordernumber;
        this.owner = owner;
        this.weight = weight;
        this.sending = sending;
        this.issue = issue;
    }
}
