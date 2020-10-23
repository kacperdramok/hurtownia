package com.example.demo.model.client

import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.*


@Entity
@Data
@NoArgsConstructor
class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null
    private var typeOfClient: TypeOfClient? = null

    @OneToOne
    @JoinColumn(name = "address_id")
    private val address: Address? = null






}