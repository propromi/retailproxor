package kz.proxor.retailproxor.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "purch")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "shippmentAdress")
    private String shippmentAdress;
    @Column(name = "transDate")
    private LocalDate transDate;
    @Column(name = "orderAccaunt")
    private String orderAccaunt;
    //Строки
}
