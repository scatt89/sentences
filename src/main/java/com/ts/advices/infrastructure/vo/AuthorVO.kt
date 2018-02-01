package com.ts.advices.infrastructure.vo

import javax.persistence.*
import java.io.Serializable

@Entity
@Table(name = "authors")
data class AuthorVO(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
        @SequenceGenerator(name = "author_id_seq", sequenceName = "author_id_seq")
        @Column(name = "ID")
        val id: Long? = null,
        @Column(name = "NAME")
        val name: String? = null,
        @Column(name = "USERNAME", nullable = false)
        val userName: String): Serializable
