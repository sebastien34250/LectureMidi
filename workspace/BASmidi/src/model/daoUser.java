package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Connect;
import object.Loop;
import object.User;

public class daoUser implements IDAO<User>{

	@Override
	public User create(User user) throws Exception {
		
		try {
						
			String query = "INSERT INTO `mysample`.`user` (`User_name`, `User_mail`, `User_mdp`) VALUES (?, ?, password(?));";
			Connection conn = Connect.getConnection();
//			PreparedStatement preparedStatement = Connect.getConnection().prepareStatement(query);
//			preparedStatement.setString(1, user.getUser_name().toString());
//			preparedStatement.setString(2, user.getUser_email());
//			preparedStatement.setString(3, user.getUser_mdp());
			PreparedStatement prepare = conn.prepareStatement(query);
			//ResultSet resultSet = preparedStatement.executeQuery();
			prepare.setString(1, user.getUser_name());
			prepare.setString(2, user.getUser_email());
			prepare.setString(3, user.getUser_mdp());
			prepare.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return null;
	}

	@Override
	public User read(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> readAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(User object) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User object) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
