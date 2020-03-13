package com.gcbrandao.springrestmongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "pessoas", path = "pessoas")
public interface PessoaFisicaRepository extends MongoRepository<PessoaFisica, String> {

    List<PessoaFisica> findByNome(@Param("nome") String nome);

}
