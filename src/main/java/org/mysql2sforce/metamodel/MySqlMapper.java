package org.mysql2sforce.metamodel;

import java.util.List;

/**
 * MySqlMapper
 *
 * @author gbaker
 * @since 188
 */
public interface MySqlMapper {

    List<MySqlTable> getTablesInSchema(String schemaName);

}
