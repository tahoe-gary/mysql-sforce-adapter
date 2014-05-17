package org.mysql2sforce;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * MySqlSchemaMetadataService
 *
 * @author gbaker
 * @since 188
 */
public class MySqlSchemaMetadataService implements SchemaMetadataService {

    private final DataSource ds;

    public MySqlSchemaMetadataService(DataSource ds) throws Exception {

        this.ds = ds;

    }


    public void loadSchema() throws SQLException {

        Connection conn = ds.getConnection();
        try {

            PreparedStatement ps = conn.prepareStatement("select 'foo'");
            try {
                ResultSet rs = ps.executeQuery();
                rs.next();
                String foo = rs.getString(1);
                assert "foo".equals(foo);
                rs.close();
            } finally {
                ps.close();
            }





        } finally {
            conn.close();
        }
    }








}
