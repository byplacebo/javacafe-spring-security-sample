package net.javacafe.chickenshop.core.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author 임형태
 * @since 2015.10.22
 */
@Data
@Entity(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String cellphone;

    @Column(nullable = false)
    private String items;

    private String etc;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ordered;
}
