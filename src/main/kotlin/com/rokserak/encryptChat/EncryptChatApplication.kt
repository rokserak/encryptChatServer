package com.rokserak.encryptChat

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EncryptChatApplication: CommandLineRunner {

	@Autowired
	var repository: MessageRepository? = null

	override fun run(vararg args: String?) {
		repository?.save(Message(
				"1",
				"3",
				"hello"
		))

		for (message in repository?.findByIdFromAndIdFor("1", "2")!!) {
			println(message)
		}
	}
}

fun main(args: Array<String>) {
	runApplication<EncryptChatApplication>(*args)
}
