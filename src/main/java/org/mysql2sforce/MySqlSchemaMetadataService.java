package org.mysql2sforce;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mysql2sforce.metamodel.MySqlTable;
import org.mysql2sforce.metamodel.MySqlMapper;

import java.sql.SQLException;
import java.util.List;

/**
 * MySqlSchemaMetadataService
 *
 * @author gbaker
 * @since 188
 */
public class MySqlSchemaMetadataService implements SchemaMetadataService {

    private final SqlSessionFactory ssf;

    public MySqlSchemaMetadataService(SqlSessionFactory ssf) throws Exception {

        this.ssf = ssf;

    }


    public void loadSchema(String schemaName) throws SQLException {

        SqlSession session = ssf.openSession();
        try {

           MySqlMapper tableMapper = session.getMapper(MySqlMapper.class);
           List<MySqlTable> tables =  tableMapper.getTablesInSchema(schemaName);
           System.out.println("There are " + tables.size() + " in the " + schemaName + " schema!");



        } finally {
            session.close();
        }
    }








}
