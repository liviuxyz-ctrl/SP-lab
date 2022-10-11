package Lab_1;

import java.util.ArrayList;

public class Book {
    public String title;
    public String paragraphs="", images="", tables="";

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        paragraphs += paragraph + " ";
    }

    public void createNewImage(String image) {
        images += image + " ";
    }

    public void createNewTable(String table) {
        tables += table + "";
    }

    public void print() {
        System.out.print( "Title: " + title + "\n" + paragraphs + '\n' + images + '\n' + tables);
    }

    @Override
    public String toString(){
        return "Title: " + title + "\n" + paragraphs + '\n' + images + '\n' + tables;
    }


}
