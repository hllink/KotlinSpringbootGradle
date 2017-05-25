package br.com.testkotlinboot.pocKotlinBoot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class PocKotlinBootApplication

fun main(args: Array<String>) {
    SpringApplication.run(PocKotlinBootApplication::class.java, *args)
}
