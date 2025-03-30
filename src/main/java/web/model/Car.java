package web.model;

public class Car {
    private String brand;
    private String model;
    private int age;

    public Car() {
    }

    public Car(String brand, String model, int age) {
        this.brand = brand;
        this.model = model;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}
