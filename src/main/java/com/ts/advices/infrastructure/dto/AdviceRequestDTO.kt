package com.ts.advices.infrastructure.dto

//defaul values sucks, there is no other way? Didn't is suppose that noarg plugin should be works?
data class AdviceRequestDTO(val userName: String = "", val sentence: String = "")