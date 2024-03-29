package com.lotto.web.domains;
import java.io.Serializable;

public class LottoBean implements Serializable {
	private static final long seriaLversionUID = 1L;
	
	private String lottoSeq, lotterNum;
	private int ball;
	
	public String getLottoSeq() {
		return lottoSeq;
	}
	public void setLottoSeq(String lottoSeq) {
		this.lottoSeq = lottoSeq;
	}
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	public String getLotterNum() {
		return lotterNum;
	}
	public void setLotterNum(String lotterNum) {
		this.lotterNum = lotterNum;
	}
	public String toSting() {
		return "로또정보 [로또번호=" + lottoSeq + ", 추출번호=" + ball + ", 당첨번호=" + lotterNum+ "]";
	}

	}
