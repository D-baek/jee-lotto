package com.lotto.web.serviceImpls;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.lotto.web.DAO.LottoDAO;
import com.lotto.web.daoImpls.LottoDAOImpl;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.service.LottoService;

public class LottoServiceImpl implements LottoService {
	private LottoDAO dao;
	
	public LottoServiceImpl() {
		dao = new LottoDAOImpl();
	}
		
	@Override
	public void createLotto(LottoBean param) {
		param.setBall(createBall());
		param.setLotterNum(createLotterNum());
		param.setLottoSeq(createLottoSeq());
		dao.insertLotto(param);
	}
	@Override
	public String createLottoSeq() {
		Random r = new Random();
		String seq = "No.";
		for(int i = 0; i<4; i++) {
			seq += r.nextInt(10)+ "";
		}
		System.out.println("생성된 시퀀스 값 : "+ seq);
		return seq;
	}
	@Override
	public String createBall() {
			return new Random().nextInt(45)+1+"";
	}
	@Override
	public String createLotterNum() {
		String lotterNum = "";
		Random r = new Random();
		for(int i = 0; i<6; i++) {
		lotterNum += r.nextInt(45)+1+ "";
		}
			return lotterNum;
		}

	@Override
	public boolean duplicatePrevention(int[] arr) {
		
		return false;
	}

	@Override
	public String ascendingSort(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
}

