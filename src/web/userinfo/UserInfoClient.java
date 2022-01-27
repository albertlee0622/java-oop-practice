package web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.dao.UserInfoDaoFactory;
import domain.userinfo.dao.mysql.UserInfoMySqlDao;
import domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");	
		UserInfo userInfo = new UserInfo("db_test", "1234", "DB Tester");
		
		try {
			UserInfoDao userInfoDao = UserInfoDaoFactory.getUserInfoDao(dbType);
			userInfoDao.insertUserInfo(userInfo);
			userInfoDao.updateUserInfo(userInfo);
			userInfoDao.deleteUserInfo(userInfo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
