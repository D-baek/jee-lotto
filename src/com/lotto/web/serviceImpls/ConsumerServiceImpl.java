package com.lotto.web.serviceImpls;

import com.lotto.web.DAO.ConsumerDAO;
import com.lotto.web.daoImpls.ConsumerDAOImpl;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.service.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService {
	private ConsumerDAO dao;
	
	public ConsumerServiceImpl() {
		dao = new ConsumerDAOImpl();
	}
	@Override
	public void registerConsumer(ConsumerBean param) {
		System.out.println("registerConsumer" + param.toString());
		dao.insertConsumer(param);
		
	}

}
