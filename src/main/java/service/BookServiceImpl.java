package service;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import repository.BookRepository;


public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public <S extends Book> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Book> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public Book findOne(Long aLong) {
        return bookRepository.findOne(aLong);
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Book> findAll() {
        return null;
    }

    @Override
    public Iterable<Book> findAll(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Book entity) {

    }

    @Override
    public void delete(Iterable<? extends Book> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
