package day_37Inheritance.animalTask.CryptoToken;

public class CryptoToken {

    public double price;
    public int quantity;
    public double marketCap;
    public String volume;
    public String circulatingSupply;
    public boolean isMineable;

    public CryptoToken(double price, int quantity, double marketCap, String volume, String circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double totalPrice( ){
       double totalPrice= price*quantity;
       return totalPrice;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume='" + volume + '\'' +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

 */