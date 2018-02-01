package com.ts.advices.infrastructure.dao

import com.ts.advices.infrastructure.vo.AdviceVO
import com.ts.advices.infrastructure.vo.AuthorVO
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AdviceRepository : CrudRepository<AdviceVO, Long> {

    fun findByAuthor(author: AuthorVO): List<AdviceVO>

    @Query(value = "SELECT * FROM ADVICES ORDER BY random() LIMIT 1", nativeQuery = true)
    fun findRandom(): List<AdviceVO>
}
