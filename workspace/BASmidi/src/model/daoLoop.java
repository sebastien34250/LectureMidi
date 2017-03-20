package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import object.Loop;



public class daoLoop implements IDAO<Loop>{

	@Override
	public Loop create(Loop object) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loop read(Integer id) throws Exception {
	
		String loop_cover = null;
		String loop_name = null;
		Loop loop = new Loop(id, loop_name, loop_cover);
		try {
			String query = "SELECT * FROM mysample.`loop` where idLoop=?";
			
			PreparedStatement preparedStatement = Connect.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			   
			if (resultSet.next()) {
			loop = new Loop(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return loop;
	}

	@Override
	public ArrayList<Loop> readAll() throws Exception {
		ArrayList<Loop> listLoop = new ArrayList<>();
		try {
			String query = "SELECT * FROM mysample.`loop`";
			
			PreparedStatement preparedStatement = Connect.getConnection().prepareStatement(query);
			
						
			ResultSet resultSet = preparedStatement.executeQuery();
			   
			while (resultSet.next()) {
				Loop loop = new Loop(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
				listLoop.add(loop);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listLoop;
	}

	@Override
	public boolean update(Loop object) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Loop object) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


}
