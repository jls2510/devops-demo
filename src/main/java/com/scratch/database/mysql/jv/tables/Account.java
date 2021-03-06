/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.tables.records.AccountRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Account extends TableImpl<AccountRecord> {

    private static final long serialVersionUID = -1612303586;

    /**
     * The reference instance of <code>jv_b2c_dev.account</code>
     */
    public static final Account ACCOUNT = new Account();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountRecord> getRecordType() {
        return AccountRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.account.id</code>.
     */
    public final TableField<AccountRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.account.username</code>.
     */
    public final TableField<AccountRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.account.email</code>.
     */
    public final TableField<AccountRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.account.password</code>.
     */
    public final TableField<AccountRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.account.first_name</code>.
     */
    public final TableField<AccountRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.account.last_name</code>.
     */
    public final TableField<AccountRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.account.stripe_id</code>.
     */
    public final TableField<AccountRecord, String> STRIPE_ID = createField("stripe_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.account.is_active</code>.
     */
    public final TableField<AccountRecord, Byte> IS_ACTIVE = createField("is_active", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.account.is_verified</code>.
     */
    public final TableField<AccountRecord, Byte> IS_VERIFIED = createField("is_verified", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>jv_b2c_dev.account.verification_code</code>.
     */
    public final TableField<AccountRecord, String> VERIFICATION_CODE = createField("verification_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.account.verification_expire</code>.
     */
    public final TableField<AccountRecord, Timestamp> VERIFICATION_EXPIRE = createField("verification_expire", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>jv_b2c_dev.account.updated_ts</code>.
     */
    public final TableField<AccountRecord, Timestamp> UPDATED_TS = createField("updated_ts", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.account.created_ts</code>.
     */
    public final TableField<AccountRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>jv_b2c_dev.account</code> table reference
     */
    public Account() {
        this(DSL.name("account"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.account</code> table reference
     */
    public Account(String alias) {
        this(DSL.name(alias), ACCOUNT);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.account</code> table reference
     */
    public Account(Name alias) {
        this(alias, ACCOUNT);
    }

    private Account(Name alias, Table<AccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private Account(Name alias, Table<AccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Account(Table<O> child, ForeignKey<O, AccountRecord> key) {
        super(child, key, ACCOUNT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JvB2cDev.JV_B2C_DEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ACCOUNT_PRIMARY, Indexes.ACCOUNT_USERNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AccountRecord, ULong> getIdentity() {
        return Keys.IDENTITY_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountRecord> getPrimaryKey() {
        return Keys.KEY_ACCOUNT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountRecord>>asList(Keys.KEY_ACCOUNT_PRIMARY, Keys.KEY_ACCOUNT_USERNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account as(String alias) {
        return new Account(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account as(Name alias) {
        return new Account(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(String name) {
        return new Account(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(Name name) {
        return new Account(name, null);
    }
}
