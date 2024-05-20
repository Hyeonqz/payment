package org.pre.payment.db.prepayment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RewardType {

	SUMMER_EVENT("여름 이벤트"),
	WINTER_EVENT("겨울 이벤트"),
	SURPRISE_EVENT("깜짝 행사"),
	;

	private String descrption;
}
