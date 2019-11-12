package Tyuuoo;

public class Phone implements DoSomething {
    public String manufacturer;

    public Phone(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void doSomething() {
        System.out.println(this.manufacturer);
    }
}