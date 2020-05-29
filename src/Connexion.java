/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Admin
 */
public class Connexion {
    String urlPilote="com.mysql.jdbc.Driver";
    String urlBaseDonnees="jdbc:mysql://localhost:3306/bdbibliotheque";
    Connection con;
    
    //chargement du pilote
public Connexion(){
    
    try{
        Class.forName(urlPilote);
        System.out.println("Chargement du pilote reussie");
}
    catch(ClassNotFoundException ex){
        System.out.println(ex);
}
    //connection à la base de donnée
    try{
        con = DriverManager.getConnection(urlBaseDonnees,"root","");
        System.out.println("Connection à la base de donnée réussie");
    }
    catch(SQLException ex){
        System.out.println(ex);
    }
}
    Connection ObtenirConnexion(){
    return con;
    }
}
