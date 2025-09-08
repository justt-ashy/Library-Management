package com.lms.repository;
import java.util.List;

import com.lms.model.Book;
import com.lms.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    public Book findByTag(String tag);
    public List<Book> findByCategory(Category category);
    public List<Book> findByCategoryAndStatus(Category category, Integer status);
    public long countByStatus(Integer status);
}
