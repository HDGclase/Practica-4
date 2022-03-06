package reviews.data;
public class Hairdresser extends Business{
    boolean unisex;

    public Hairdresser(String name, String location, boolean unisex) {
        super(name, location);
        this.unisex = unisex;
    }

    public boolean isUnisex() {
        return unisex;
    }

    public void setUnisex(boolean unisex) {
        this.unisex = unisex;
    }
    @Override
    public String toString() {
        return "Hairdresser "+super.toString()+" - "+unisex;
    }
}
