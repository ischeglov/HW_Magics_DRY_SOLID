public class Laptop extends Catalog implements MusicPlayer, SMSer {
    /*Interface segregation principle - в классе Laptop, который имплиментирует 2 разных интерфейса, которые "применимы" к ноутам.
    а класс Phone имплиментирует только те интерфейсы, которые "якобы" относятся к телефонам.*/

    String name;
    int price;
    double rating;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return getName() + '\'' +
                ", цена " + getPrice();
    }

    @Override
    public void playMusic(String query) {

    }

    @Override
    public void sendSMS(String msg, String number) {

    }
}
