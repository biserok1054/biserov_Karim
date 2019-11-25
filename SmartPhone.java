package Inter;
public class SmartPhone extends Phone {
    private String model;
    public SmartPhone(String manufacturer, String model) {
        super(manufacturer);
        this.model = model;
    }

    public SmartPhone(String manufacturer){
        super(manufacturer);
        this.model = "Xiaomi";
    }

    @Override
    public void doPhoto() {
        System.out.println(this.manufacturer +" " + this.model);
    }
}