package interprobe.homework01.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(generator = "product")
    @SequenceGenerator(name = "product", sequenceName = "PRODUCT_ID_SEQ")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Positive
    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Temporal(TemporalType.DATE)
    @Column(name = "expire_date")
    private Date expireDate;
}
