package designpattern.观察者模式;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Library library = new Library();
        Observer readerAObserver = new ReaderA();
        Observer readerBObserver = new ReaderB();
        //添加读者A
        library.addObserver(readerAObserver);
        //添加读者B
        library.addObserver(readerBObserver);
        //添加一本新书
        Book book = new Book("朝花夕拾", "鲁迅");
        library.addBook(book);
    }
}
