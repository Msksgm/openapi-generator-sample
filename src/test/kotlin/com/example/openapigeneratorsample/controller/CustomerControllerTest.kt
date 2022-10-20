package com.example.openapigeneratorsample.controller

import com.example.realworldkotlinspringbootjdbc.openapi.generated.model.Customer
import com.example.realworldkotlinspringbootjdbc.openapi.generated.model.MultipleCustomersResponse
import com.example.realworldkotlinspringbootjdbc.openapi.generated.model.SuccessMessage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class CustomerControllerTest {
    @Test
    fun `list`() {
        /**
         * given:
         */
        val customerController = CustomerController()

        /**
         * when:
         */
        val actual = customerController.list()

        /**
         * then:
         */
        val expected = ResponseEntity(
            MultipleCustomersResponse(
                customers = listOf(Customer("Alice", "example01"), Customer("Bob", "example02")),
            ),
            HttpStatus.OK
        )
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `create`() {
        /**
         * given:
         */
        val customerController = CustomerController()
        val customer = Customer("Carol", "example3")

        /**
         * when:
         */
        val actual = customerController.create(customer)

        /**
         * then:
         */
        val expected = ResponseEntity(
            SuccessMessage(
                "success"
            ),
            HttpStatus.CREATED
        )
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `update`() {
        /**
         * given:
         */
        val customerController = CustomerController()
        val customer = Customer("Carol", "example3")

        /**
         * when:
         */
        val actual = customerController.update(customer)

        /**
         * then:
         */
        val expected = ResponseEntity(
            SuccessMessage(
                "success"
            ),
            HttpStatus.NO_CONTENT
        )
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `delete`() {
        /**
         * given:
         */
        val customerController = CustomerController()

        /**
         * when:
         */
        val actual = customerController.delete(1)

        /**
         * then:
         */
        val expected = ResponseEntity(
            SuccessMessage(
                "success"
            ),
            HttpStatus.NO_CONTENT
        )
        assertThat(actual).isEqualTo(expected)
    }
}
