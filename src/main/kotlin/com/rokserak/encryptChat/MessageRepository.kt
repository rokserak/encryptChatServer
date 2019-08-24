package com.rokserak.encryptChat

import org.springframework.data.mongodb.repository.MongoRepository

interface MessageRepository: MongoRepository<Message, String> {
    fun findByIdFromAndIdFor(idFrom: String, idFor: String): List<Message?>
}