package com.example.ktl.endpoints

import com.example.ktl.entity.Situacao
import com.example.ktl.repository.SituacaoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/api")
@RestController
class EndPoints {
    @Autowired
    private val situacaoRepository: SituacaoRepository? = null

   val situacao: List<Situacao>
        @GetMapping(value = ["/situacao"])
        get() = situacaoRepository!!.findAll()
}
