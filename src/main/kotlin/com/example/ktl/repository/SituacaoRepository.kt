package com.example.ktl.repository


import com.example.ktl.entity.Situacao
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

@RepositoryRestResource(collectionResourceRel = "situacao", path = "situacao2")
interface SituacaoRepository : JpaRepository<Situacao, Long>
