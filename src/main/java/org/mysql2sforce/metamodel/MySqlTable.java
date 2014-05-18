package org.mysql2sforce.metamodel;

/**
 * MySqlTable
 *
 * @author gbaker
 * @since 188
 */

public class MySqlTable {


    private String schemaName;
    private String name;


    public String getSchema() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

}
