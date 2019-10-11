package com.example.ktl.endpoints

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

    @GetMapping(value = ["/hello"])
    fun hello() = "hello!".also {
        situacaoRepository!!.findAll().forEach {
            println("situacaoId:${it.id}")
            println()
        }
    }

    @GetMapping(value = ["/hello2"])
    fun hello2() = "hello!".also {
        situacaoRepository!!.findAll().forEach {
            println("situacaoId:${it.id}")
            println("tipoSituacaoDescricao:${it.tipoSituacao?.descricao}")
            println()
        }
    }
}
