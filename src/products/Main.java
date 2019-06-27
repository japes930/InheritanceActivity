package products;

import java.util.Scanner;

public class Main {
    public static void main(String[]args ){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Print the book code: ");
        String code = keyboard.nextLine();
        //Q:Is the whole point of this scanner just to set one book code?
        //If thats the case, why even use input and not code it in when instantiating


        Book b = new Book();
        b.setCode(code);
        b.setAuthor("J.R.R. Tolien");
        b.setPrice(10.89);
        b.setDescription("The second book of the Lord of the Rings series");
        b.setPages(352);
        System.out.println(b.toString());

        Book c = new Book();
        c.setCode("Book 8910");
        c.setAuthor("Louis Sachar");
        c.setPrice(7.99);
        c.setDescription("Centers around unlucky teenage boy Stanley Yelnats, who is sent to juvenile corrections facility in desert to dig holes");
        c.setPages(272);
        System.out.println(c.toString());

        Software s = new Software();
        s.setCode("Program1234");
        s.setDescription("Spreadsheet");
        s.setPrice(999.99);
        s.setOs("Windows");
        s.setProgrammer("Fi");
        System.out.println(s.toString());


    }
}
