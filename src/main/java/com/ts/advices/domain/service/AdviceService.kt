package com.ts.advices.domain.service

import com.ts.advices.domain.AdviceRepositoryManager
import com.ts.advices.domain.model.Advice
import com.ts.advices.domain.model.Author
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class AdviceService @Autowired constructor(val adviceRepositoryManager: AdviceRepositoryManager){

    fun getAdvicesByUserName(userName: String):List<Advice>? = adviceRepositoryManager.getAdvicesByUserName(userName)

    fun getAdviceBy(id: String): Advice? = adviceRepositoryManager.getAdviceBy(id)

    fun getAuthorByUserName(userName: String): Author? = adviceRepositoryManager.getAuthorByUserName(userName)

    fun getRandomAdvice(): Advice? = adviceRepositoryManager.getRandomAdvice()

    @Transactional
    fun deleteAdviceBy(id: String) = adviceRepositoryManager.deleteAdviceBy(id)

    @Transactional
    fun save(advice: Advice): Long? = adviceRepositoryManager.save(advice)

}