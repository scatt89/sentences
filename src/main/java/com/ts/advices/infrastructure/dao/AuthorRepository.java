package com.ts.advices.infrastructure.dao;

import com.ts.advices.infrastructure.vo.AuthorVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorVO, Long> {

    AuthorVO findByUserName(String userName);
}
