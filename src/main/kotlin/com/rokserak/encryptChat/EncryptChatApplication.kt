package com.rokserak.encryptChat

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EncryptChatApplication: CommandLineRunner {

	@Autowired
	var repository: UserRepository? = null

	override fun run(vararg args: String?) {
		repository?.save(User(
				"rok",
				"some key"
		))

		for (user in repository?.findAll()!!) {
			println(user)
		}
	}
}

fun main(args: Array<String>) {
	runApplication<EncryptChatApplication>(*args)
}
