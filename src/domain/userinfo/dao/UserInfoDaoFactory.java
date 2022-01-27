package domain.userinfo.dao;

import domain.userinfo.dao.mysql.UserInfoMySqlDao;
import domain.userinfo.dao.oracle.UserInfoOracleDao;
import java.io.IOException;

public class UserInfoDaoFactory {
	public static UserInfoDao getUserInfoDao(String dbType) throws IOException {
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else {
			throw new IOException("Invalid DBType");
		}
		
		return userInfoDao;
	}
}
