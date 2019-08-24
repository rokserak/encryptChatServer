package com.rokserak.encryptChat

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
interface UserRepository: MongoRepository<User, String> {
    fun findByName(@Param("name") name: String): User
}