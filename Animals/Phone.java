package Animals;

public abstract class Phone
{
    String name;
    String Manufacter;
    String nameOfClass = getClass().getSimpleName();
    public void call(){
        System.out.println(nameOfClass + ": ...Ring");
    }
}