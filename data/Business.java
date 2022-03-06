package reviews.data;

public abstract class Business {
    protected String name;
    protected String location;
    public Review[] opiniones;
    protected float average;

    public Business(String name, String location) {
        this.name = name;
        this.location = location;
        this.opiniones=opiniones;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Review[] getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(Review[] opiniones) {
        this.opiniones = opiniones;
    }

    public void reviewAverage(){
        for(int i=0;i<opiniones.length;i++)
        {
            average+=opiniones[i].rating;
        }
        average=average/opiniones.length;
    }
    @Override
    public String toString() {
        return name+" ("+location+")"+"\n"+"Review average: "+average;
    }
}
