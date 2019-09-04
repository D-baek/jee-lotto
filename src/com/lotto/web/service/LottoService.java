package com.lotto.web.service;
import com.lotto.web.domains.LottoBean;

public interface LottoService {
	public void createLotto(LottoBean param);
	public String createLottoSeq();
	public int createBall();
	public String createLotterNum();
	public boolean exist(int[] arr, int a);
	public int[] bubbleSort(int[] arr, boolean flag);
}
