/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connecter {

    Connection con;

    public Connecter() {
        try {
            Class.forName("com.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jb", "root", "");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    Connection obtenirConnexion() {
        return con;
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
