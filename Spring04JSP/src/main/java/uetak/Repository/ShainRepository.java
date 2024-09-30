package uetak.Repository;

import java.util.ArrayList;

import uetak.entity.Shain;

public interface ShainRepository {
	//社員リストを取得
	ArrayList<Shain> findAll();

}
