package com.example.demo.model.client

import lombok.*
import java.lang.StringBuilder
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Data
@NoArgsConstructor
@Entity
class Address() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null

    @NotBlank(message = "Delivery building number is required")
    private var deliveryBuildingNumber: String? = null

    @NotBlank(message = "Street is required")
    private var deliveryStreet: String? = null

    @NotBlank(message = "City is required")
    private var deliveryCity: String? = null

    @NotBlank(message = "State is required")
    private var deliveryState: String? = null

    @NotBlank(message = "Zip code is required")
    private var deliveryZip: String? = null

    @OneToOne(mappedBy = "address")
    private var client: Client? = null



    override fun toString(): String {
      var stringBuilder = StringBuilder()
        stringBuilder.append("State : ");
        stringBuilder.append(deliveryState);
        stringBuilder.append(System.getProperty("line.separator"));
        stringBuilder.append("City : ");
        stringBuilder.append(deliveryCity);
        stringBuilder.append(System.getProperty("line.separator"));
        stringBuilder.append("Street : ");
        stringBuilder.append(deliveryStreet);
        stringBuilder.append(System.getProperty("line.separator"));
        stringBuilder.append("Building Number : ");
        stringBuilder.append(deliveryBuildingNumber);
        stringBuilder.append(System.getProperty("line.separator"));
        stringBuilder.append("Zip : ");
        stringBuilder.append(deliveryZip);
        stringBuilder.append(System.getProperty("line.separator"));

        return stringBuilder.toString()

          }


}