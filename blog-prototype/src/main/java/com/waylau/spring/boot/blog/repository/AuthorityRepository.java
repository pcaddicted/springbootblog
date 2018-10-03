package com.waylau.spring.boot.blog.repository;

import com.waylau.spring.boot.blog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority,Long> {

}
