package org.mysql2sforce.metamodel;

/**
 * MySqlColumn
 *
 * @author gbaker
 * @since 188
 */
public class MySqlColumn {

    private final String name;
    private final String datatype;
    private final Integer lengthOrPrecision;
    private final Integer scale;



    public MySqlColumn(String name, String datatype, int lengthOrPrecision) {

        this.name = name;
        this.datatype = datatype;
        this.lengthOrPrecision = lengthOrPrecision;
        this.scale = null;


    }


}
