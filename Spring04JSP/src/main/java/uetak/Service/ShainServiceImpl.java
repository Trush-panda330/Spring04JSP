package uetak.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import uetak.Repository.ShainRepository;
import uetak.entity.Shain;

@Service
public class ShainServiceImpl implements ShainService {
	
	@Autowired
	@Qualifier("ShainRepositoryImpl")
	ShainRepository shainRepository;
	
	
	@Override
	public ArrayList<Shain> findAll() {
		//社員リストを返す
		return shainRepository.findAll();
	}

}
