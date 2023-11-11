package pro.sky.java.course1.leson1;

public class LessonOneHomework {
    public static void main(String[] args) {
        Author oneBook = new Author("Михаил ", "Булгаков ");
        Author twoBook = new Author("Михаил ", "Шолохов ");
        Book two = new Book("Судьба человека ", twoBook, 1959);
         Book one = new Book("Мастер и Маргарита ",oneBook, 1928);
         one.setYear(2028);
        System.out.println(one.getTitle() + ", " + oneBook.getName() + ", " + oneBook.getSurName()+ ", " + one.getYear() + " год");
        System.out.println(two.getTitle() +  ", " + twoBook.getName() + ", " + twoBook.getSurName() + ", " +  two.getYear() + " год");
        System.out.println(one);
        System.out.println(two);
        System.out.println(oneBook.hashCode());
        System.out.println(twoBook.hashCode());
        System.out.println(oneBook.equals(twoBook));
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(one.equals(two));
}
}
