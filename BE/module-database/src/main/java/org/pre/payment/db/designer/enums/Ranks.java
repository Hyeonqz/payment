package org.pre.payment.db.designer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Ranks {

	GENERAL_DESIGNER("일반 디자이너"),
	SENIOR_DESIGNER("수석 디자이너"),
	CHIEF_DESIGNER("원장 디자이너"),
	;

	private String description;
}
