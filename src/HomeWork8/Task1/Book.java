package HomeWork8.Task1;

/*
Первая задача - на 75 баллов
Создать POJO класс Book
у класса Book - 4 параметра (поля класса),
double price
String title
String coverType (может быть только hard или soft)
int quantityOfPages
у них у всех есть геттеры и сеттеры и эти поля инициализируются при вызове конструктора
(т е в классе Book есть конструктор с 4 параметрами)
Создать класс BookTester - в нем psvm
В psvm проинициализировать ArrayList (назовем его bookCollection) который может
содержать только Book
Наполнить коллекцию 10 книгами по слабой ссылке (т е через new Book(...,...,...,...))
Перед циклом проинициализировать 2 коллекции (типа ArrayList)
booksWithSoftCover
booksWithHardCover
Сделать перебор по коллекции (цикл) bookCollection в котором с помощью оператора if
наполнить коллекции booksWithSoftCover и booksWithHardCover, т е вызвать getCoverType у
каждого элемента коллекции и если он .equals(“soft”) - то мы добавляем в
booksWithSoftCover в противном случае в booksWithHardCover
После цикла у нас 3 коллекции -
bookCollection - все книги
booksWithSoftCover - книги только в мягком переплете
booksWithHardCover - книги только в твердом переплете
Далее вывести в консоль с соответствующими логами - все названия книг каждого массива
Что то типа “В магазине есть след книги с мягким переплетом” и далее список title
Сообщение “В магазине есть след книги с мягким переплетом” вызвать перед циклом чтобы
оно не повторялось
Т е мы делаем перебор - и у каждого элемента вызываем getTitle и печатаем в консоль
 */
public class Book {

    double price;
    String title;
    String coverType;
    int quantityOfPages;

    public Book(double price, String title, String coverType, int quantityOfPages) {
        this.price = price;
        this.title = title;
        this.coverType = coverType;
        this.quantityOfPages = quantityOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }
}
