package com.ts.advices.domain.model

data class Author(val name: String?, val userName: String){
    constructor (userName: String): this(null, userName)
}