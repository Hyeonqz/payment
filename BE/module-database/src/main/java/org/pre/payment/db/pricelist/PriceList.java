package org.pre.payment.db.pricelist;

import java.math.BigDecimal;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Comment("가격표")
@Entity(name="price_list")
public class PriceList {

	@Column(name="price_id")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30, nullable = false)
	private String serviceName;

	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal costs;
}
