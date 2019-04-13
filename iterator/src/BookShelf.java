public class BookShelf implements Aggregate{

    private Book[] books; //防止被修改
    private int last = 0;

    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    //委托具体实现了迭代器的实现，封装操作当前类的行为
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
