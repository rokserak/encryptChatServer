package com.rokserak.encryptChat

import org.springframework.data.annotation.Id

class User(name: String, publicKey: String) {

    @Id
    var id: String? = null

    var name = name
    var publicKey = publicKey

    override fun toString(): String {
        return "User(id=$id, name='$name', publicKey='$publicKey')"
    }
}