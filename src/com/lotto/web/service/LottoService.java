package com.lotto.web.service;
import java.util.List;

import com.lotto.web.domains.LottoBean;

public interface LottoService {
	public void createLotto(LottoBean param);
	public String createLottoSeq();
	public String createBall();
	public String createLotterNum();
	public boolean duplicatePrevention(int[] arr);
	public String ascendingSort(int[] arr);
}
