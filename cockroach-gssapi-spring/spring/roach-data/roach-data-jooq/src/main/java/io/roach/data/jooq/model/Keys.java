/*
 * This file is generated by jOOQ.
 */
package io.roach.data.jooq.model;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import io.roach.data.jooq.model.tables.Account;
import io.roach.data.jooq.model.tables.Databasechangeloglock;
import io.roach.data.jooq.model.tables.records.AccountRecord;
import io.roach.data.jooq.model.tables.records.DatabasechangeloglockRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>public</code> schema.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> PRIMARY = UniqueKeys0.PRIMARY;

    public static final UniqueKey<DatabasechangeloglockRecord> DATABASECHANGELOGLOCK_PKEY = UniqueKeys0.DATABASECHANGELOGLOCK_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountRecord> PRIMARY = Internal
                .createUniqueKey(Account.ACCOUNT, "primary", new TableField[] {Account.ACCOUNT.ID}, true);

        public static final UniqueKey<DatabasechangeloglockRecord> DATABASECHANGELOGLOCK_PKEY = Internal
                .createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, "databasechangeloglock_pkey",
                        new TableField[] {Databasechangeloglock.DATABASECHANGELOGLOCK.ID}, true);
    }
}
