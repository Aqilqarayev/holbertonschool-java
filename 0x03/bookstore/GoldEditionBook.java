import exceptions.InvalidBookException;
import exceptions.InvalidAuthorException;
public class GoldEditionBook extends Book{
    public GoldEditionBook(String title, String author, double price) throws Exception {
        super(title, author, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.3; // 30% daha baha
    }
}
