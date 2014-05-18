package org.mysql2sforce.metamodel;

import java.util.List;

/**
 * MySqlSchema
 *
 * @author gbaker
 * @since 188
 */
public class MySqlSchema {

    private final List<MySqlTable> tables;

    public MySqlSchema(List<MySqlTable> tables) {
        this.tables = tables;
    }

    public List<MySqlTable> getTables() {
        return tables;
    }
}
