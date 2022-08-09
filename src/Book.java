public class Book {
    private final String name;
    private Author author;
    private int publisherDate;

    public Book(String name, Author author, int publisherDate) {
        this.name = name;
        this.author = author;
        this.publisherDate = publisherDate;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublisherDate(){
        return this.publisherDate;
    }
    public void setPublisherDate(int publisherDate){
        this.publisherDate = publisherDate;
    }
}
