package net.infoowl.caner.domain.util;

import org.hibernate.dialect.H2Dialect;

import java.sql.Types;

/**
 * Created by caneraydin on 24.03.2016.
 */
public class FixedH2Dialect extends H2Dialect {

    public FixedH2Dialect() {
        super();
        registerColumnType(Types.FLOAT, "real");
    }
}
