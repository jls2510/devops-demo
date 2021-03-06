/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.enums.OrderOrderStatus;
import com.scratch.database.mysql.jv.enums.OrderShippingPromotionType;
import com.scratch.database.mysql.jv.tables.records.OrderRecord;

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
public class Order extends TableImpl<OrderRecord> {

    private static final long serialVersionUID = 1681705207;

    /**
     * The reference instance of <code>jv_b2c_dev.order</code>
     */
    public static final Order ORDER = new Order();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderRecord> getRecordType() {
        return OrderRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.order.id</code>.
     */
    public final TableField<OrderRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.order.session_id</code>.
     */
    public final TableField<OrderRecord, String> SESSION_ID = createField("session_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.s2k_order_number</code>.
     */
    public final TableField<OrderRecord, String> S2K_ORDER_NUMBER = createField("s2k_order_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.stripe_source_id</code>.
     */
    public final TableField<OrderRecord, String> STRIPE_SOURCE_ID = createField("stripe_source_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.stripe_customer_id</code>.
     */
    public final TableField<OrderRecord, String> STRIPE_CUSTOMER_ID = createField("stripe_customer_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.stripe_charge_id</code>.
     */
    public final TableField<OrderRecord, String> STRIPE_CHARGE_ID = createField("stripe_charge_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.stripe_captured_amount</code>.
     */
    public final TableField<OrderRecord, BigDecimal> STRIPE_CAPTURED_AMOUNT = createField("stripe_captured_amount", org.jooq.impl.SQLDataType.DECIMAL(7, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order.stripe_captured_ts</code>.
     */
    public final TableField<OrderRecord, Timestamp> STRIPE_CAPTURED_TS = createField("stripe_captured_ts", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>jv_b2c_dev.order.s2k_status</code>.
     */
    public final TableField<OrderRecord, String> S2K_STATUS = createField("s2k_status", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.s2k_status_description</code>.
     */
    public final TableField<OrderRecord, String> S2K_STATUS_DESCRIPTION = createField("s2k_status_description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.account_id</code>.
     */
    public final TableField<OrderRecord, ULong> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>jv_b2c_dev.order.order_date</code>.
     */
    public final TableField<OrderRecord, String> ORDER_DATE = createField("order_date", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.product_total</code>.
     */
    public final TableField<OrderRecord, BigDecimal> PRODUCT_TOTAL = createField("product_total", org.jooq.impl.SQLDataType.DECIMAL(9, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.freight</code>.
     */
    public final TableField<OrderRecord, BigDecimal> FREIGHT = createField("freight", org.jooq.impl.SQLDataType.DECIMAL(9, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.order_total</code>.
     */
    public final TableField<OrderRecord, BigDecimal> ORDER_TOTAL = createField("order_total", org.jooq.impl.SQLDataType.DECIMAL(9, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.gift_flag</code>.
     */
    public final TableField<OrderRecord, Byte> GIFT_FLAG = createField("gift_flag", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.gift_receipt</code>.
     */
    public final TableField<OrderRecord, Byte> GIFT_RECEIPT = createField("gift_receipt", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.gift_message</code>.
     */
    public final TableField<OrderRecord, String> GIFT_MESSAGE = createField("gift_message", org.jooq.impl.SQLDataType.VARCHAR(250).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_via</code>.
     */
    public final TableField<OrderRecord, String> SHIP_VIA = createField("ship_via", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_method</code>.
     */
    public final TableField<OrderRecord, String> SHIP_METHOD = createField("ship_method", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_classification</code>.
     */
    public final TableField<OrderRecord, String> SHIP_CLASSIFICATION = createField("ship_classification", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.promo_code</code>.
     */
    public final TableField<OrderRecord, String> PROMO_CODE = createField("promo_code", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.shipping_discount_percent</code>.
     */
    public final TableField<OrderRecord, Integer> SHIPPING_DISCOUNT_PERCENT = createField("shipping_discount_percent", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.shipping_discount_amount</code>.
     */
    public final TableField<OrderRecord, BigDecimal> SHIPPING_DISCOUNT_AMOUNT = createField("shipping_discount_amount", org.jooq.impl.SQLDataType.DECIMAL(9, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.shipping_promotion_type</code>.
     */
    public final TableField<OrderRecord, OrderShippingPromotionType> SHIPPING_PROMOTION_TYPE = createField("shipping_promotion_type", org.jooq.impl.SQLDataType.VARCHAR(11).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.scratch.database.mysql.jv.enums.OrderShippingPromotionType.class), this, "");

    /**
     * The column <code>jv_b2c_dev.order.shipping_promotion_amount</code>.
     */
    public final TableField<OrderRecord, BigDecimal> SHIPPING_PROMOTION_AMOUNT = createField("shipping_promotion_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.shipping_promotion_method</code>.
     */
    public final TableField<OrderRecord, String> SHIPPING_PROMOTION_METHOD = createField("shipping_promotion_method", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.bill_to_zip</code>.
     */
    public final TableField<OrderRecord, String> BILL_TO_ZIP = createField("bill_to_zip", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.bill_to_email</code>.
     */
    public final TableField<OrderRecord, String> BILL_TO_EMAIL = createField("bill_to_email", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_name</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_NAME = createField("ship_to_name", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_address1</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_ADDRESS1 = createField("ship_to_address1", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_address2</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_ADDRESS2 = createField("ship_to_address2", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_city</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_CITY = createField("ship_to_city", org.jooq.impl.SQLDataType.VARCHAR(17).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_state</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_STATE = createField("ship_to_state", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_zip</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_ZIP = createField("ship_to_zip", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_country</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_COUNTRY = createField("ship_to_country", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_phone</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_PHONE = createField("ship_to_phone", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.placeholder</code>.
     */
    public final TableField<OrderRecord, Byte> PLACEHOLDER = createField("placeholder", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.order_status</code>.
     */
    public final TableField<OrderRecord, OrderOrderStatus> ORDER_STATUS = createField("order_status", org.jooq.impl.SQLDataType.VARCHAR(23).nullable(false).defaultValue(org.jooq.impl.DSL.inline("NEW", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.scratch.database.mysql.jv.enums.OrderOrderStatus.class), this, "");

    /**
     * The column <code>jv_b2c_dev.order.ship_to_care_of</code>.
     */
    public final TableField<OrderRecord, String> SHIP_TO_CARE_OF = createField("ship_to_care_of", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.bill_to_care_of</code>.
     */
    public final TableField<OrderRecord, String> BILL_TO_CARE_OF = createField("bill_to_care_of", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.shipping_status</code>.
     */
    public final TableField<OrderRecord, String> SHIPPING_STATUS = createField("shipping_status", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.tracking_number</code>.
     */
    public final TableField<OrderRecord, String> TRACKING_NUMBER = createField("tracking_number", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.po_number</code>.
     */
    public final TableField<OrderRecord, String> PO_NUMBER = createField("po_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.so_number</code>.
     */
    public final TableField<OrderRecord, String> SO_NUMBER = createField("so_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.weight</code>.
     */
    public final TableField<OrderRecord, BigDecimal> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.DECIMAL(9, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order.weight_uom</code>.
     */
    public final TableField<OrderRecord, String> WEIGHT_UOM = createField("weight_uom", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.tax_total</code>.
     */
    public final TableField<OrderRecord, BigDecimal> TAX_TOTAL = createField("tax_total", org.jooq.impl.SQLDataType.DECIMAL(7, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order.tax_rate_state</code>.
     */
    public final TableField<OrderRecord, BigDecimal> TAX_RATE_STATE = createField("tax_rate_state", org.jooq.impl.SQLDataType.DECIMAL(7, 6), this, "");

    /**
     * The column <code>jv_b2c_dev.order.tax_rate_cnty</code>.
     */
    public final TableField<OrderRecord, BigDecimal> TAX_RATE_CNTY = createField("tax_rate_cnty", org.jooq.impl.SQLDataType.DECIMAL(7, 6), this, "");

    /**
     * The column <code>jv_b2c_dev.order.tax_rate_local_1</code>.
     */
    public final TableField<OrderRecord, BigDecimal> TAX_RATE_LOCAL_1 = createField("tax_rate_local_1", org.jooq.impl.SQLDataType.DECIMAL(7, 6), this, "");

    /**
     * The column <code>jv_b2c_dev.order.tax_rate_local_2</code>.
     */
    public final TableField<OrderRecord, BigDecimal> TAX_RATE_LOCAL_2 = createField("tax_rate_local_2", org.jooq.impl.SQLDataType.DECIMAL(7, 6), this, "");

    /**
     * The column <code>jv_b2c_dev.order.has_perishables</code>.
     */
    public final TableField<OrderRecord, Byte> HAS_PERISHABLES = createField("has_perishables", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.has_nonperishables</code>.
     */
    public final TableField<OrderRecord, Byte> HAS_NONPERISHABLES = createField("has_nonperishables", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.cubic_volume</code>.
     */
    public final TableField<OrderRecord, BigDecimal> CUBIC_VOLUME = createField("cubic_volume", org.jooq.impl.SQLDataType.DECIMAL(9, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order.cubic_volume_uom</code>.
     */
    public final TableField<OrderRecord, String> CUBIC_VOLUME_UOM = createField("cubic_volume_uom", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.order.refund_freight</code>.
     */
    public final TableField<OrderRecord, BigDecimal> REFUND_FREIGHT = createField("refund_freight", org.jooq.impl.SQLDataType.DECIMAL(9, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order.refund_total</code>.
     */
    public final TableField<OrderRecord, BigDecimal> REFUND_TOTAL = createField("refund_total", org.jooq.impl.SQLDataType.DECIMAL(9, 2), this, "");

    /**
     * The column <code>jv_b2c_dev.order.s2k_retry_count</code>.
     */
    public final TableField<OrderRecord, Integer> S2K_RETRY_COUNT = createField("s2k_retry_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jv_b2c_dev.order.s2k_retry_ts</code>.
     */
    public final TableField<OrderRecord, Timestamp> S2K_RETRY_TS = createField("s2k_retry_ts", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>jv_b2c_dev.order.s2k_payload</code>.
     */
    public final TableField<OrderRecord, String> S2K_PAYLOAD = createField("s2k_payload", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.order.s2k_response</code>.
     */
    public final TableField<OrderRecord, String> S2K_RESPONSE = createField("s2k_response", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.order.s2k_error_message</code>.
     */
    public final TableField<OrderRecord, String> S2K_ERROR_MESSAGE = createField("s2k_error_message", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.order.tax_payload</code>.
     */
    public final TableField<OrderRecord, String> TAX_PAYLOAD = createField("tax_payload", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.order.tax_response</code>.
     */
    public final TableField<OrderRecord, String> TAX_RESPONSE = createField("tax_response", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.order.created_ts</code>.
     */
    public final TableField<OrderRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.updated_ts</code>.
     */
    public final TableField<OrderRecord, Timestamp> UPDATED_TS = createField("updated_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.order.is_deleted</code>.
     */
    public final TableField<OrderRecord, Byte> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>jv_b2c_dev.order</code> table reference
     */
    public Order() {
        this(DSL.name("order"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.order</code> table reference
     */
    public Order(String alias) {
        this(DSL.name(alias), ORDER);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.order</code> table reference
     */
    public Order(Name alias) {
        this(alias, ORDER);
    }

    private Order(Name alias, Table<OrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Order(Name alias, Table<OrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Order(Table<O> child, ForeignKey<O, OrderRecord> key) {
        super(child, key, ORDER);
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
        return Arrays.<Index>asList(Indexes.ORDER_ACOUNT_ID, Indexes.ORDER_CUBIC_VOLUME_UOM, Indexes.ORDER_PRIMARY, Indexes.ORDER_WEIGHT_UOM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderRecord, ULong> getIdentity() {
        return Keys.IDENTITY_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderRecord>>asList(Keys.KEY_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OrderRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderRecord, ?>>asList(Keys.ORDER_IBFK_3, Keys.ORDER_IBFK_1, Keys.ORDER_IBFK_2);
    }

    public Account account() {
        return new Account(this, Keys.ORDER_IBFK_3);
    }

    public Uom orderIbfk_1() {
        return new Uom(this, Keys.ORDER_IBFK_1);
    }

    public Uom orderIbfk_2() {
        return new Uom(this, Keys.ORDER_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order as(String alias) {
        return new Order(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order as(Name alias) {
        return new Order(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(String name) {
        return new Order(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(Name name) {
        return new Order(name, null);
    }
}
