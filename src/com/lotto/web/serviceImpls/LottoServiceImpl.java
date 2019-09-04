package com.lotto.web.serviceImpls;
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
			seq += r.nextInt(9)+ "";
		}
		return seq;
	}
	@Override
	public int createBall() {
		return (int)(Math.random() * 45)+1;
	}
	@Override
	public String createLotterNum() {
		String result = "";
		int[] arr = new int[6];
		for(int i = 0; i<arr.length; i++) {
			int a = createBall();
			if(!exist(arr, a)) {
				arr[i] = a;
			}else{
				i--;
			}
		}
		arr = bubbleSort(arr, true);
		for(int i = 0; arr[i] <arr.length; i++) {
			result += arr[i]+",";
		}
			return result;
		}
	@Override
	public boolean exist(int[] arr, int a) {
		boolean b = false;
		for(int i : arr) {			
			if(a==i) {
				b = true;
			}
			
		}
		return b;
	}
	
	@Override
	public int[] bubbleSort(int[] arr, boolean flag) {
		int t = 0;
		for(int k = 0; k< arr.length; k++) {
			for(int i=0; i<arr.length-1; i++) {
				if(flag) {
					if(arr[i]>arr[i+1]) {
						t = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = t;
					}
				}
			}
		}	
		return arr;
	}
}