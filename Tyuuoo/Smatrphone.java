package Tyuuoo;


public class Smatrphone extends Phone {
    private String model;
    public Smatrphone(String manufacturer, String model) {
        super(manufacturer);
        this.model = model;
    }

    public Smatrphone(String manufacturer){
        super(manufacturer);
        this.model = "Xiaomi";
    }

    @Override
    public void doSomething() {
        System.out.println(this.manufacturer +" " + this.model);
    }
}