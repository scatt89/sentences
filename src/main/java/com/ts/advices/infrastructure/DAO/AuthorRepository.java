package com.ts.advices.infrastructure.DAO;

import com.ts.advices.infrastructure.VO.AuthorVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorVO, Long> {

    AuthorVO findByName(String authorName);
}
