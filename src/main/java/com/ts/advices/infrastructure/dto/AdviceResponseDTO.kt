package com.ts.advices.infrastructure.dto

data class AdviceResponseDTO(val id: String, val sentence: String, val userName: String, val name: String?) {
    data class Author(val userName: String, val name: String?)

    private var author: Author

    init {
        this.author = Author(userName, name)
    }
}
