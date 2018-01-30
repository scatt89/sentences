package com.ts.advices.infrastructure.dao;

import com.ts.advices.infrastructure.vo.AdviceVO;
import com.ts.advices.infrastructure.vo.AuthorVO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdviceRepository extends CrudRepository<AdviceVO, Long> {

    List<AdviceVO> findByAuthor(AuthorVO author);

    @Query(value="SELECT * FROM ADVICES ORDER BY random() LIMIT 1", nativeQuery = true)
    List<AdviceVO> findRandom();
}
