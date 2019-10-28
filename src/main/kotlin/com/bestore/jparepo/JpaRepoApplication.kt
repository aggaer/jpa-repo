package com.bestore.jparepo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaRepoApplication

fun main(args: Array<String>) {
    runApplication<JpaRepoApplication>(*args)
}
