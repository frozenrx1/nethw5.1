public class Book {
    String title;
    int releaseYear;
    String author;
    int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;

    }

    public static int estimatePrice(int pages) {
        return Math.max(pages * 3, 250);
    }

    public boolean isBig(int pages) {
        return pages > 500;
    }

    public boolean matches(String word) {
        boolean isMatch = title.contains(word) || author.contains(word);
        System.out.println(isMatch ? "Это подходит под описание." : "Это не подходит под описание.");
        return isMatch;
    }


}
