package com.lotto.web.domains;

import java.io.Serializable;

public class LottoBean implements Serializable {
	private static final long seriaLversionUID = 1L;
	private String lottoSeq, ball, lotterNum;
	public String getLottoSeq() {
		return lottoSeq;
	}
	public void setLottoSeq(String lottoSeq) {
		this.lottoSeq = lottoSeq;
	}
	public String getBall() {
		return ball;
	}
	public void setBall(String ball) {
		this.ball = ball;
	}
	public String getLotterNum() {
		return lotterNum;
	}
	public void setLotterNum(String lotterNum) {
		this.lotterNum = lotterNum;
	}
	

	}
