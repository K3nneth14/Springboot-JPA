package com.K3nneth14.Library.repository;

/**
 *
 * @author Kenneth
 */
import org.springframework.data.jpa.repository.JpaRepository;
import com.K3nneth14.Library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}