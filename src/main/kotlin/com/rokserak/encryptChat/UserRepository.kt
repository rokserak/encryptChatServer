package com.rokserak.encryptChat

import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String> {
    fun findByName(name: String): User
}