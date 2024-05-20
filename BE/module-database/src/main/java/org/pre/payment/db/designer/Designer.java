package org.pre.payment.db.designer;

import java.io.Serializable;

import org.hibernate.annotations.Comment;
import org.pre.payment.db.designer.enums.Ranks;

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
@Comment("디자이너")
@Entity(name="designer")
public class Designer implements Serializable {

	@Column(name="designer_id")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30, nullable = false)
	private String name;

	@Column(length = 30, nullable = false)
	private String phoneNumber;

	@Column(length = 50, nullable = false)
	private String email;

	@Column(columnDefinition = "varchar(10)", nullable = false)
	@Enumerated(EnumType.STRING)
	private Ranks ranks;

	@Column(length = 10, nullable = false)
	private String careers;










}
