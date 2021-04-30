package DAO;
import javax.swing.*;
import javax.swing.table.TableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class DAOFilm {
	String strClassName ;
	String dbName;
	String login ;
	String motdepasse;
	String strUrl ;
	Connection conn ;
	Statement stAddUser;

  public DAOFilm() {
			try {
				this.strClassName = "com.mysql.jdbc.Driver";
				this.dbName= "cinema"; 
				this.login= "root"; 
				this.motdepasse= ""; 
				this.strUrl = "jdbc:mysql://localhost:3308/" +  dbName +"?autoReconnect=true&useSSL=false";
				Class.forName(strClassName);
				this.conn = DriverManager.getConnection(strUrl, login, motdepasse);
				this.stAddUser = conn.createStatement(); 
			} 
			catch(ClassNotFoundException e) {  
				System.err.println("Driver non chargé !");  e.printStackTrace();
			} 
			catch(SQLException e) {
				System.err.println("Autre erreur !");  e.printStackTrace();
			}
  }
  public static void main(String[] args) {
		DAOFilm create =  new DAOFilm();
		create.add(1, "StarWars", 2001, 1, 123, 508);
		create.add(3, "StarWars", 2008, 3, 450, 850);
		create.lister();
		create.delete(3);
		create.lister();
		create.close();
	}

  public void close() {
	  try {
		this.conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
  }
  	public void lister() {
	  try {
		  ResultSet rsUsers = this.stAddUser.executeQuery("select * from Film");  
		  while(rsUsers.next()) {
			System.out.print("Id = " + rsUsers.getInt("id")+"\n" 
			+ "Titre = " + rsUsers.getString("titre")+"\n"
			+ "Année de sortie = " +  rsUsers.getInt("sortie") +"\n"
			+ "Numéro du film = " + rsUsers.getInt("numero") +"\n"
			+ "Cout du film = " + rsUsers.getInt("cout")+"\n"
			+ "Recette du film = " + rsUsers.getInt("recette")+"\n"
			+"----------------------------\n" );
			}
		  }
		  catch (SQLException e) {
			e.printStackTrace();
		  }
	
	  }
  	//public ArrayList<Film> listerFilm() {
  		//return
  	  //}
  	public void add(int id,String titre,int sortie,int numero,int cout,int recette) {	
  		try { 
  			this.stAddUser.executeUpdate("insert into Film values (" + id + ",'" + titre +"',"+ sortie+ "," + numero + "," + cout + ","+ recette +")");
 
		}
  		catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}

  	}
  	public void delete(int id) {	
  		try { 
  			this.stAddUser.executeUpdate("delete from Film where id =" + id);
		}
  		catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}

  	}
  	 public ArrayList listeFilm() throws SQLException{
         try{
             ResultSet datas = this.stAddUser.executeQuery("SELECT * FROM film");
             ArrayList resultat = new ArrayList();
                 while (datas.next()) {
                     Film unFilm = new Film(datas.getInt(1), datas.getString(2), datas.getInt(3), datas.getInt(4), datas.getDouble(5), datas.getDouble(6));
                     resultat.add(unFilm);
                 }
                 conn.close();
                 return resultat;
         } catch (SQLException e) {
             System.err.println("Erreur");
             e.printStackTrace();
             return null;
         }
     }
  	public TableModel listeFilmTable() throws SQLException{
        try{
            ResultSet datas = this.stAddUser.executeQuery("SELECT * FROM films");
            ArrayList<Film> resultDatas = new ArrayList();
            TableModel result;
                while (datas.next()) {
                    Film unFilm = new Film(datas.getInt(1), datas.getString(2), datas.getInt(3), datas.getInt(4), datas.getDouble(5), datas.getDouble(6) );
                   resultDatas.add(unFilm);
                }
                conn.close();
                result = (TableModel) resultDatas;
                return result;
        } catch (SQLException e) {
            System.err.println("Erreur");
            e.printStackTrace();
            return null;
        }
    }
  	
  	public void Modifier(int id, String titre) {
  		try {
  			this.stAddUser.executeUpdate("update film set titre = '"+ titre + "' where id =" + id);
		}
  		catch(SQLException e) {
			System.err.println("Autre erreur !");  e.printStackTrace();
		}
  	}
}
