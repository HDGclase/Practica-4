package reviews.data;

public class Garage extends Business{
    protected float price;

    public Garage(String name, String location, float price) {
        super(name, location);
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Restaurant "+super.toString()+" - "+price+" eur/h";
    }
}
