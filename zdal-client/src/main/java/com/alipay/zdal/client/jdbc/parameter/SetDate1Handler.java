/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.zdal.client.jdbc.parameter;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetDate1Handler implements ParameterHandler {
    public void setParameter(PreparedStatement stmt, Object[] args) throws SQLException {
        stmt.setDate((Integer) args[0], (Date) args[1]);
    }
}
