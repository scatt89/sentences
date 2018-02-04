package com.ts.advices.infrastructure.controller

import com.ts.advices.Constants
import com.ts.advices.domain.model.Advice
import com.ts.advices.domain.service.AdviceService
import com.ts.advices.infrastructure.dto.AdviceRequestDTO
import com.ts.advices.infrastructure.dto.AdviceResponseDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping(Constants.SENTENCE_BASE)
class AdviceController @Autowired constructor (private val adviceService: AdviceService){

    @RequestMapping(value = "/id={id}", method = [RequestMethod.GET])
    fun getAdviceById(@PathVariable id: String): ResponseEntity<*> =
            try{ ResponseEntity.ok(mapToDTO(adviceService.getAdviceBy(id)!!)) }
            catch (e: Exception ) { ResponseEntity.notFound().build<Any>() }

    @RequestMapping(value = "/userName={userName}", method = [RequestMethod.GET])
    fun getAdvicesByAuthor(@PathVariable userName: String): ResponseEntity<*> =
        try { ResponseEntity.ok<List<AdviceResponseDTO>>(mapToDTO(adviceService.getAdvicesByUserName(userName)!!)) }
        catch (e: Exception) { ResponseEntity.notFound().build<Any>() }

    @RequestMapping(value = "/random", method = [RequestMethod.GET])
    fun getRandomAdvice(): ResponseEntity<*> =
        try { ResponseEntity.ok(mapToDTO(adviceService.getRandomAdvice()!!)) }
        catch (e: Exception) { ResponseEntity.unprocessableEntity().build<Any>() }

    @RequestMapping(value = "/insert", method = [RequestMethod.POST])
    fun insertAdvice(@RequestBody adviceRequestDTO: AdviceRequestDTO): ResponseEntity<*> =
        try {
            val adviceId = adviceService.save(mapFromDTO(adviceRequestDTO))
            ResponseEntity.created(URI(Constants.SENTENCE_BASE + "id=" + adviceId)).body<Long>(adviceId)
        } catch (e: Exception) { ResponseEntity.unprocessableEntity().build<Any>() }

    @RequestMapping(value = "/delete/id={id}", method = [RequestMethod.GET])
    fun deleteAdviceById(@PathVariable id: String): ResponseEntity<*> =
        try {
            adviceService.deleteAdviceBy(id)
            ResponseEntity.ok().build<Any>()
        } catch (e: Exception) { ResponseEntity.notFound().build<Any>() }

    private fun mapFromDTO(adviceRequestDTO: AdviceRequestDTO): Advice {
        val author = adviceService.getAuthorByUserName(adviceRequestDTO.userName)

        return Advice(adviceRequestDTO.sentence, author!!)
    }

    private fun mapToDTO(advicesByUserName: List<Advice>): List<AdviceResponseDTO> =
            advicesByUserName
                    .map { mapToDTO(it) }

    private fun mapToDTO(advice: Advice): AdviceResponseDTO =
            AdviceResponseDTO(id = advice.id!!,
                    sentence = advice.sentence,
                    userName = advice.author.userName,
                    name = advice.author.name)
}