package Inter;

public class Phone implements DoPhoto {
    public String manufacturer;

    public Phone(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void doPhoto() {
        System.out.println(this.manufacturer);
    }
}