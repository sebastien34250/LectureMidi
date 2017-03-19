package model;

import java.util.ArrayList;

import object.Loop;

public interface IDAO<O> {
	
	public O create(O object) throws Exception;
	
	public O read(Integer id) throws Exception;
	
	ArrayList<O> readAll() throws Exception;
	
	public boolean update(O object) throws Exception;
	
	public boolean delete(O object) throws Exception;

	

	

}
