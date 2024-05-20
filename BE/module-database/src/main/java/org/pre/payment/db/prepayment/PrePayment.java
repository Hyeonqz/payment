package org.pre.payment.db.prepayment;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.Comment;
import org.pre.payment.db.prepayment.enums.RewardType;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Comment("선불권")
@Entity(name="prepayment")
public class PrePayment {

	@Column(name="prepayment_id")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(precision = 10 , scale = 2, nullable = false)
	private BigDecimal prepaymentAmount;

	@Column(precision = 10 , scale = 2, nullable = false)
	private BigDecimal reward;

	@Column(columnDefinition = "varchar(30)", nullable = false)
	@Enumerated(EnumType.STRING)
	private RewardType rewardType;

	@Column(precision = 10 , scale = 2, nullable = false)
	private BigDecimal balance;

	// FIXME 좀더 DB 분석 후 다시 설정하기
	@LastModifiedDate
	private LocalDateTime updatedDate;

}
