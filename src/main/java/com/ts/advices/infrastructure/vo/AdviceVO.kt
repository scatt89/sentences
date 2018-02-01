package com.ts.advices.infrastructure.vo

import javax.persistence.*
import java.io.Serializable

@Entity
@Table(name = "advices")
data class AdviceVO(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "advices_id_seq")
        @SequenceGenerator(name = "advices_id_seq", sequenceName = "advices_id_seq")
        @Column(name = "ID")
        val id: Long? = null,
        @ManyToOne
        @JoinColumn(name = "USERID")
        val author: AuthorVO,
        @Column(name = "SENTENCE", nullable = false)
        val sentence: String): Serializable{

    constructor(author: AuthorVO, sentence: String) : this(null, author, sentence)
}