package com.example.paging;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class PaginateUtil {
    public static <T> ResponseEntity<Page<T>> paginate(JpaRepository<T, ?> repository, Pageable pageable) {
        Page<T> pageResult = repository.findAll(pageable);
        return new ResponseEntity<>(pageResult, HttpStatus.OK);
    }
}
