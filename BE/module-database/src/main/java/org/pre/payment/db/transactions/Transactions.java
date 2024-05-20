package org.pre.payment.db.transactions;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;

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
@Comment("거래기록")
@Entity(name="transactions")
public class Transactions {

	@Column(name="transactions_id")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer userId;

	private Integer designerId;

	private Integer costId;

	@Column(precision = 10, scale = 4, nullable = false)
	private BigDecimal expense;

	@Column(precision = 10, scale = 4)
	// FIXME 음.. 이걸 not null 로 해야할까 말까.. 고민중
	private BigDecimal amount;

	@CreatedDate
	private LocalDateTime transactionsDate;



}
