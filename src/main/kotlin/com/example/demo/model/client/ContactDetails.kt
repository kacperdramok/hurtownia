package com.example.demo.model.client

import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.Pattern


@Entity
@Data
@NoArgsConstructor
class ContactDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Pattern(regexp = "(\\+48|0)[0-9]{9}")
    private val phoneNumber: String? = null

    @Email(message = "Wrong email")
    private val email: String? = null

    @OneToOne(mappedBy = "contactDetails")
    private val client: Client? = null





}