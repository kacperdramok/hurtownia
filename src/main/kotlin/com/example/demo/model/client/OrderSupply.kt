package com.example.demo.model.client

import lombok.Data
import lombok.NoArgsConstructor
import java.util.*
import javax.persistence.*


@Entity
@Data
@NoArgsConstructor
class OrderSupply {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null
    private val createdAt: Date? = null
    private val typeOfService: TypeOfService? = null
    private val wholesale: Long? = null

    @ManyToOne
    @JoinColumn(name = "client_id")
    private val client: Client? = null




}