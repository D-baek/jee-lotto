package com.lotto.web.daoImpls;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import com.lotto.web.DAO.LottoDAO;
import com.lotto.web.domains.LottoBean;

public class LottoDAOImpl implements LottoDAO {
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse-jee%sjee-lotto%sWebContent%sresources%stxt%s",
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator,
			File.separator);
	@Override
	public void insertLotto(LottoBean param) {
		try {
			File file = new File(FILE_PATH +"lotto.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			System.out.println(param.getLottoSeq()+"/"+param.getLotterNum());
			writer.write(param.getLottoSeq()+"/"+param.getLotterNum());
			writer.newLine();
			writer.flush();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
