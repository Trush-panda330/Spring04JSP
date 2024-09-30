package uetak.Repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import uetak.entity.Shain;

@Repository
@Qualifier("ShainRepositoryImpl2")
public class ShainRepositoryImpl2 implements ShainRepository{

	@Override
	public ArrayList<Shain> findAll() {
		//社員リストを作る
		ArrayList<Shain> shainList = new ArrayList<>();
		
		Shain shain1 = new Shain();
		shain1.setId(001);
		shain1.setName("匿名太郎");
		shain1.setGender("男");
		
		shain1.setNen(0000);
		shain1.setAddress("未確定");
		shainList.add(shain1);
		
		
		return shainList;
	}
	

}
