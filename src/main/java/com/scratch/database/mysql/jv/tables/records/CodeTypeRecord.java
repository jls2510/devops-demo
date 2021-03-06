/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.tables.CodeType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CodeTypeRecord extends UpdatableRecordImpl<CodeTypeRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 1763758417;

    /**
     * Setter for <code>jv_b2c_dev.code_type.id</code>.
     */
    public CodeTypeRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.code_type.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.code_type.type</code>.
     */
    public CodeTypeRecord setType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.code_type.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.code_type.description</code>.
     */
    public CodeTypeRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.code_type.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return CodeType.CODE_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CodeType.CODE_TYPE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CodeType.CODE_TYPE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeTypeRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeTypeRecord value2(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeTypeRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeTypeRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CodeTypeRecord
     */
    public CodeTypeRecord() {
        super(CodeType.CODE_TYPE);
    }

    /**
     * Create a detached, initialised CodeTypeRecord
     */
    public CodeTypeRecord(Long id, String type, String description) {
        super(CodeType.CODE_TYPE);

        set(0, id);
        set(1, type);
        set(2, description);
    }
}
