package classwork.classwork19.book;

import java.util.Objects;

public class Book {

    private String tittle;
    private double price;

    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(String tittle, double price, String author) {
        this.tittle = tittle;
        this.price = price;
        this.author = author;
    }


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (obj instanceof Book) {
//            Book b = (Book) obj;//b n obyektn e
//
//            return tittle.equals(b.tittle) && price == b.price && author.equals(b.author);
//        }
//        return true;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Book book = (Book) o;
//
//        if (Double.compare(book.price, price) != 0) return false;
//        if (!Objects.equals(tittle, book.tittle)) return false;
//        return Objects.equals(author, book.author);
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = tittle != null ? tittle.hashCode() : 0;
//        temp = Double.doubleToLongBits(price);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        result = 31 * result + (author != null ? author.hashCode() : 0);
//        return result;
//    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
























