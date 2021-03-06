/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.tables.records.ProductRecord;

import java.math.BigDecimal;
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
public class Product extends TableImpl<ProductRecord> {

    private static final long serialVersionUID = 505415133;

    /**
     * The reference instance of <code>jv_b2c_dev.product</code>
     */
    public static final Product PRODUCT = new Product();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductRecord> getRecordType() {
        return ProductRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.product.id</code>.
     */
    public final TableField<ProductRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.product.item_number</code>.
     */
    public final TableField<ProductRecord, String> ITEM_NUMBER = createField("item_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.description_1</code>.
     */
    public final TableField<ProductRecord, String> DESCRIPTION_1 = createField("description_1", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.description_2</code>.
     */
    public final TableField<ProductRecord, String> DESCRIPTION_2 = createField("description_2", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.uom</code>.
     */
    public final TableField<ProductRecord, String> UOM = createField("uom", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.package_size</code>.
     */
    public final TableField<ProductRecord, String> PACKAGE_SIZE = createField("package_size", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.brand</code>.
     */
    public final TableField<ProductRecord, String> BRAND = createField("brand", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.brand_name</code>.
     */
    public final TableField<ProductRecord, String> BRAND_NAME = createField("brand_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.perishable</code>.
     */
    public final TableField<ProductRecord, Byte> PERISHABLE = createField("perishable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.product.sales_tax_code</code>.
     */
    public final TableField<ProductRecord, String> SALES_TAX_CODE = createField("sales_tax_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jv_b2c_dev.product.item_weight</code>.
     */
    public final TableField<ProductRecord, BigDecimal> ITEM_WEIGHT = createField("item_weight", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.product.item_weight_uom</code>.
     */
    public final TableField<ProductRecord, String> ITEM_WEIGHT_UOM = createField("item_weight_uom", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.short_description</code>.
     */
    public final TableField<ProductRecord, String> SHORT_DESCRIPTION = createField("short_description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.product.long_description</code>.
     */
    public final TableField<ProductRecord, String> LONG_DESCRIPTION = createField("long_description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.product.replacement_item_number</code>.
     */
    public final TableField<ProductRecord, String> REPLACEMENT_ITEM_NUMBER = createField("replacement_item_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.display_name</code>.
     */
    public final TableField<ProductRecord, String> DISPLAY_NAME = createField("display_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.url</code>.
     */
    public final TableField<ProductRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.meta_title</code>.
     */
    public final TableField<ProductRecord, String> META_TITLE = createField("meta_title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.meta_description</code>.
     */
    public final TableField<ProductRecord, String> META_DESCRIPTION = createField("meta_description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.is_giftable</code>.
     */
    public final TableField<ProductRecord, Byte> IS_GIFTABLE = createField("is_giftable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.product.is_promotable</code>.
     */
    public final TableField<ProductRecord, Byte> IS_PROMOTABLE = createField("is_promotable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.product.is_deleted</code>.
     */
    public final TableField<ProductRecord, Byte> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.product.is_active</code>.
     */
    public final TableField<ProductRecord, Byte> IS_ACTIVE = createField("is_active", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.product.updated_ts</code>.
     */
    public final TableField<ProductRecord, Timestamp> UPDATED_TS = createField("updated_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.product.created_ts</code>.
     */
    public final TableField<ProductRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.product.cubic_volume</code>.
     */
    public final TableField<ProductRecord, BigDecimal> CUBIC_VOLUME = createField("cubic_volume", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.product.cubic_volume_uom</code>.
     */
    public final TableField<ProductRecord, String> CUBIC_VOLUME_UOM = createField("cubic_volume_uom", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.catch_weight</code>.
     */
    public final TableField<ProductRecord, String> CATCH_WEIGHT = createField("catch_weight", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.product.catch_weight_UOM</code>.
     */
    public final TableField<ProductRecord, String> CATCH_WEIGHT_UOM = createField("catch_weight_UOM", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jv_b2c_dev.product.average_weight</code>.
     */
    public final TableField<ProductRecord, BigDecimal> AVERAGE_WEIGHT = createField("average_weight", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.product.variance_over</code>.
     */
    public final TableField<ProductRecord, BigDecimal> VARIANCE_OVER = createField("variance_over", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.product.variance_under</code>.
     */
    public final TableField<ProductRecord, BigDecimal> VARIANCE_UNDER = createField("variance_under", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * Create a <code>jv_b2c_dev.product</code> table reference
     */
    public Product() {
        this(DSL.name("product"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.product</code> table reference
     */
    public Product(String alias) {
        this(DSL.name(alias), PRODUCT);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.product</code> table reference
     */
    public Product(Name alias) {
        this(alias, PRODUCT);
    }

    private Product(Name alias, Table<ProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Product(Name alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Product(Table<O> child, ForeignKey<O, ProductRecord> key) {
        super(child, key, PRODUCT);
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
        return Arrays.<Index>asList(Indexes.PRODUCT_IS_ACTIVE, Indexes.PRODUCT_IS_DELETED, Indexes.PRODUCT_ITEM_NUMBER, Indexes.PRODUCT_PRIMARY, Indexes.PRODUCT_PRODUCT_UOM_ID_FK, Indexes.PRODUCT_PRODUCT_UOM_ID_FK_2, Indexes.PRODUCT_PRODUCT_UOM_ID_FK_3, Indexes.PRODUCT_REPLACEMENT_ITEM_NUMBER, Indexes.PRODUCT_URL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ProductRecord, ULong> getIdentity() {
        return Keys.IDENTITY_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductRecord> getPrimaryKey() {
        return Keys.KEY_PRODUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductRecord>>asList(Keys.KEY_PRODUCT_PRIMARY, Keys.KEY_PRODUCT_ITEM_NUMBER, Keys.KEY_PRODUCT_URL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProductRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProductRecord, ?>>asList(Keys.PRODUCT_UOM_ID_FK, Keys.PRODUCT_UOM_ID_FK_2, Keys.PRODUCT_PRODUCT_ITEM_NUMBER_FK, Keys.PRODUCT_UOM_ID_FK_3);
    }

    public Uom productUomIdFk() {
        return new Uom(this, Keys.PRODUCT_UOM_ID_FK);
    }

    public Uom productUomIdFk_2() {
        return new Uom(this, Keys.PRODUCT_UOM_ID_FK_2);
    }

    public com.scratch.database.mysql.jv.tables.Product product() {
        return new com.scratch.database.mysql.jv.tables.Product(this, Keys.PRODUCT_PRODUCT_ITEM_NUMBER_FK);
    }

    public Uom productUomIdFk_3() {
        return new Uom(this, Keys.PRODUCT_UOM_ID_FK_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product as(String alias) {
        return new Product(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product as(Name alias) {
        return new Product(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(String name) {
        return new Product(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(Name name) {
        return new Product(name, null);
    }
}
