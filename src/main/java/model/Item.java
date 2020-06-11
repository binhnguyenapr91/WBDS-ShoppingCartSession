package model;

public class Item {
    private Book book;
    private int quantity;

    public Item(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Item() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "book=" + book +
                ", quantity=" + quantity +
                '}';
    }

    public float totalPrice(){
        Float total;
        total = this.quantity * Float.parseFloat(this.book.getPrice());
        return total;
    }
}
