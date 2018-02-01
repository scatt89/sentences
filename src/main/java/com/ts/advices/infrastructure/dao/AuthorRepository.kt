package com.ts.advices.infrastructure.dao

import com.ts.advices.infrastructure.vo.AuthorVO
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : CrudRepository<AuthorVO, Long> {
    fun findByUserName(userName: String): AuthorVO
}
