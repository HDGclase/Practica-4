package reviews.data;

public class Restaurant extends Business{
    protected String food;

    public Restaurant(String name, String location, String food) {
        super(name, location);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    @Override
    public String toString() {
        return "Restaurant "+super.toString()+" - "+food;
    }
}
