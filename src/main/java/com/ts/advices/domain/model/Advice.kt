package com.ts.advices.domain.model

data class Advice(val id: String?, val sentence: String, val author: Author){
    constructor(sentence: String, author: Author): this(null, sentence, author)
}