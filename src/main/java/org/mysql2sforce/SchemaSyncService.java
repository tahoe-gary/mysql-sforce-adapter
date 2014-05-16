package org.mysql2sforce;

import com.apple.eawt.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * SchemaSyncService
 *
 *
 *
 *
 * @author gbaker
 * @since 188
 */
@Component
public class SchemaSyncService {











    public static void main(String[] args) throws Exception {



        ApplicationContext context =  new AnnotationConfigApplicationContext(Application.class);


        Class.forName("com.mysql.jdbc.Driver").newInstance();

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/afw_afids?" +
                "user=gbaker");



        assert null != conn;

        conn.close();


    }







}
