public class Book {
    private int bookId;
    private String tittle;
    private String outhor;
    private double price;

    public Book(int bookId, String tittle, String outhor, double price) {
        this.bookId = bookId;
        this.tittle = tittle;
        this.outhor = outhor;
        this.price = price;
    }

    public Book(String tittle, String outhor, double price) {
        this.tittle = tittle;
        this.outhor = outhor;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getOuthor() {
        return outhor;
    }

    public void setOuthor(String outhor) {
        this.outhor = outhor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", tittle='" + tittle + '\'' +
                ", outhor='" + outhor + '\'' +
                ", price=" + price +
                '}';
    }
}
