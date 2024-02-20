package kz.proxor.retailproxor.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "purchDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private Double count;
    private Double amount;
    //Product_id price
}
