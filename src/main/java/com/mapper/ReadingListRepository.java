package com.mapper;

import com.domain.Book;
import com.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Haibo
 * @date 2020-03-28 00:20
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {

    List<Book> findByReader(Reader reader);
}
