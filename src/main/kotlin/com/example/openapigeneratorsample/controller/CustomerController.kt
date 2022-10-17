package com.example.openapigeneratorsample.controller

import com.example.realworldkotlinspringbootjdbc.openapi.generated.controller.CustomerApi
import com.example.realworldkotlinspringbootjdbc.openapi.generated.model.Customer
import com.example.realworldkotlinspringbootjdbc.openapi.generated.model.MultipleCustomersResponse
import com.example.realworldkotlinspringbootjdbc.openapi.generated.model.SuccessMessage
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController : CustomerApi {
    override fun list(): ResponseEntity<MultipleCustomersResponse> {
        return ResponseEntity(
            MultipleCustomersResponse(
                customers = listOf(Customer("Alice", "example01"), Customer("Bob", "example02")),
            ),
            HttpStatus.OK
        )
    }

    override fun create(customer: Customer): ResponseEntity<SuccessMessage> {
        return ResponseEntity(
            SuccessMessage(
                "success"
            ),
            HttpStatus.CREATED
        )
    }

    override fun update(customer: Customer): ResponseEntity<SuccessMessage> {
        return ResponseEntity(
            SuccessMessage(
                "success"
            ),
            HttpStatus.NO_CONTENT
        )
    }

    override fun delete(id: Int): ResponseEntity<SuccessMessage> {
        return ResponseEntity(
            SuccessMessage(
                "success"
            ),
            HttpStatus.NO_CONTENT
        )
    }
}
