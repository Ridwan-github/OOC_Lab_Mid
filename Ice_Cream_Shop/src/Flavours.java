public class Flavours {
    public String name;
    public double price_per_scoop;

    public void Flavour(String name, double price_per_scoop){
        this.name=name;
        this.price_per_scoop=price_per_scoop;
    }

    public String getName() {
        return name;
    }

    public double getPrice_per_scoop() {
        return price_per_scoop;
    }
}
