package org.mysql2sforce.metamodel;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MySqlMapper
 *
 * @author gbaker
 * @since 188
 */
public interface MySqlMapper {

    @Select("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = #{schemaName}")
    List<MySqlTable> getTablesInSchema(String schemaName);


}
