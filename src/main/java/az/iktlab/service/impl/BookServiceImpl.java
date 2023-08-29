package az.iktlab.service.impl;

import az.iktlab.dao.BookRepository;
import az.iktlab.dao.impl.BookDaoImpl;
import az.iktlab.service.BookService;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository = new BookDaoImpl();
    @Override
    public int addBook(Integer usrId, Integer flightId) {
        return bookRepository.addBook(usrId,flightId);
    }

    @Override
    public int cancelBook() {
        return bookRepository.cancelBook();
    }
}
