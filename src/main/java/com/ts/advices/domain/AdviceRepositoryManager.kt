package com.ts.advices.domain

import com.ts.advices.domain.model.Advice
import com.ts.advices.domain.model.Author
import com.ts.advices.infrastructure.DAO.AdviceRepository
import com.ts.advices.infrastructure.DAO.AuthorRepository
import com.ts.advices.infrastructure.VO.AdviceVO
import com.ts.advices.infrastructure.VO.AuthorVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class AdviceRepositoryManager @Autowired constructor(val adviceRepository: AdviceRepository, val authorRepository: AuthorRepository){

    fun getAdvicesByUserName(userName: String): List<Advice>? {
        val authorVO = authorRepository.findByUserName(userName)
        return getAdvicesBy(authorVO)
    }

    fun getAdviceBy(id: String): Advice? = mapFromVO(adviceRepository.findOne(java.lang.Long.parseLong(id)))

    fun getAdvicesBy(authorVO: AuthorVO): List<Advice>? = mapFromVO(adviceRepository.findByAuthor(authorVO))

    fun getAuthorByUserName(userName: String): Author? {
        val authorVO = authorRepository.findByUserName(userName)
        return mapFromVO(authorVO)
    }

    fun getRandomAdvice(): Advice? = mapFromVO(adviceRepository.findRandom()[0])

    fun save(advice: Advice): Long? = adviceRepository.save(mapToVO(advice)).id

    private fun mapFromVO(adviceVOList: List<AdviceVO>?): List<Advice>? {
        if (adviceVOList == null) return null

        return if (adviceVOList.isEmpty()) ArrayList()
        else adviceVOList
                .map { Advice(it.id!!.toString(), it.sentence, mapFromVO(it.author)!!) }
    }

    fun deleteAdviceBy(id: String) = adviceRepository.delete(java.lang.Long.parseLong(id))

    private fun mapFromVO(adviceVO: AdviceVO?): Advice? =
            if (adviceVO == null) null
            else Advice(adviceVO.id!!.toString(), adviceVO.sentence, mapFromVO(adviceVO.author)!!)

    private fun mapFromVO(authorVO: AuthorVO?): Author? =
            if (authorVO == null) null
            else Author(authorVO.name, authorVO.userName)

    private fun mapToVO(author: Author?): AuthorVO? =
            if (author == null) null
            else authorRepository.findByUserName(author.userName)

    private fun mapToVO(advice: Advice): AdviceVO = AdviceVO(mapToVO(advice.author), advice.sentence)

}