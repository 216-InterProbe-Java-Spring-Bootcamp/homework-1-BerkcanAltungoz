package interprobe.homework01.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "product_comment")
public class ProductComment {
    @Id
    @GeneratedValue(generator = "product_comment")
    @SequenceGenerator(name = "product_comment", sequenceName = "PRODUCT_COMMENT_ID_SEQ")
    private Long id;

    @Column(name = "comment", length = 500, nullable = false)
    private String comment;

    @Temporal(TemporalType.DATE)
    @Column(name = "comment_date", nullable = false)
    private Date commentDate;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_product_id", nullable = false, foreignKey = @ForeignKey(name = "fk_product_comment_product_id", value = ConstraintMode.CONSTRAINT))
    private Product fkProduct;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_user_id" , nullable = false , foreignKey = @ForeignKey(name = "fk_product_comment_user_id", value = ConstraintMode.CONSTRAINT))
    private User fkUser;


}
