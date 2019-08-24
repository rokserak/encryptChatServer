package com.rokserak.encryptChat

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "message", path = "message")
interface MessageRepository: MongoRepository<Message, String> {
    fun findByIdFromAndIdFor(@Param("idFrom") idFrom: String,
                             @Param("idFor") idFor: String
                            ): List<Message?>
}