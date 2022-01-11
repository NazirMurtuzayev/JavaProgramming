package day_37Inheritance.animalTask.CryptoToken;

public class Doge extends CryptoToken {


    public Doge(double price, int quantity, double marketCap, String volume, String circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, volume, circulatingSupply, isMineable);
    }

    public double totalPrice( ){
        double totalPrice= price*quantity;
        return totalPrice;
    }

    public String toString() {
        return "Doge{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume='" + volume + '\'' +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineable=" + isMineable +
                '}';
    }
}
