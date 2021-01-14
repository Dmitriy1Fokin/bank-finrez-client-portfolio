package ru.fdo.bank.finrez.clientportfolio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ClientPortfolioApplication

fun main(args: Array<String>) {
	runApplication<ClientPortfolioApplication>(*args)
}
