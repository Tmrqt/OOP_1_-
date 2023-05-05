package Products;

public class HotDrink extends Product {

    private int volume;
    private double temp;

    public HotDrink(String name, double price, double temp, int volume)
    {
        super(name, price);
        this.temp = temp;
        this.volume = volume;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

        /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", temp=" + temp +
        ", volume=" + volume +
        '}';
    }
}