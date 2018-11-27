package com.example.ktl.repository

import com.example.ktl.entity.TipoSituacao
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "tipoSituacao", path = "tipoSituacao")
interface TipoSituacaoRepository : JpaRepository<TipoSituacao, Long>
