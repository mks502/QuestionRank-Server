package com.depromeet.qr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commentId;

	@Column(nullable = false)
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "speakerId")
	private Speaker speaker;

	@Builder.Default
	private Integer likeCount = 0;
	
	@OneToOne
	@JoinColumn(name = "mid")
	private Member member;

}