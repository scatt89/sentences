package com.ts.advices.infrastructure.DAO;

import com.ts.advices.infrastructure.VO.AdviceVO;
import com.ts.advices.infrastructure.VO.AuthorVO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdviceRepository extends CrudRepository<AdviceVO, Long> {

    List<AdviceVO> findByAuthor(AuthorVO author);

    @Query(value="SELECT * FROM ADVICES ORDER BY RAND() LIMIT 1", nativeQuery = true)
    List<AdviceVO> findRandom();
}
