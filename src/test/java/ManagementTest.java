import com.cc.bean.Book;
import com.cc.util.Management;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ManagementTest  {


    @Test
    public void getTotalTest() throws Exception {
        Book book11 = new Book("newBook","海贼王",10.0);
        Book book12 = new Book("regularBook","Time",20.0);
        Book book13 = new Book("unsalableBook","Thinking in Java",30.0);

        List<Book> books1 = new ArrayList<Book>();
        books1.add(book11);
        books1.add(book12);
        books1.add(book13);
        assertEquals(50,new Management().getTotalPrice(books1),0);
//        System.out.println(new Management().getTotalPrice(books1));
    }
}
