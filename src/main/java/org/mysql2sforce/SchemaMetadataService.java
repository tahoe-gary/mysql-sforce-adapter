package org.mysql2sforce;

import java.sql.SQLException;

/**
 * SchemaMetadataService
 *
 * @author gbaker
 * @since 188
 */
public interface SchemaMetadataService {


    /**
     * load the schema with the given name into memory
     *
     * @param schemaName
     * @throws SQLException
     */
    void loadSchema(String schemaName) throws SQLException;


}
