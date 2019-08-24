package com.rokserak.encryptChat

import org.springframework.data.annotation.Id

class Message(idFrom: String, idFor: String, message: String) {

    @Id
    var id: String? = null

    var idFrom = idFrom
    var idFor = idFor
    var message = message

    override fun toString(): String {
        return "Message(id=$id, From=$idFrom, For=$idFor, Message='$message')"
    }
}