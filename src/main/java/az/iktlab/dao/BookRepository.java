package az.iktlab.dao;

import az.iktlab.model.User;

public interface BookRepository {

    int addBook(Integer usrId,Integer flightId);
    int cancelBook();
}
