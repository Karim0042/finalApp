package az.iktlab.controller;

import az.iktlab.dao.BookRepository;
import az.iktlab.dao.impl.BookDaoImpl;
import az.iktlab.service.BookService;
import az.iktlab.service.impl.BookServiceImpl;

public class BookController {
    private final BookService bookService= new BookServiceImpl();
    public int addBook(Integer usrId, Integer flightId) {
        return bookService.addBook(usrId,flightId);
    }
    public int cancelBook() {
        return bookService.cancelBook();
    }
}
