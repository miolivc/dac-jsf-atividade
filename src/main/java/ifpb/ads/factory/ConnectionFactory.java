/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.enterprise.inject.Produces;

/**
 *
 * @author miolivc
 */
public class ConnectionFactory {
    
    private static final String URL = "jdbc://postgresql:host-database:5432/library";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    @Produces
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.err.println();
        }
        return connection;
    }
}
