package com.example.openapigeneratorsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenapiGeneratorSampleApplication

fun main(args: Array<String>) {
	@Suppress("SpreadOperator")
	runApplication<OpenapiGeneratorSampleApplication>(*args)
}
