package aplication;

import java.sql.Connection;

import db.com.br.DB;

public class Progamn {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
		
		

	}

}
