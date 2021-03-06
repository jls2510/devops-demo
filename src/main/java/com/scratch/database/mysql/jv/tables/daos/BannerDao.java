/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.Banner;
import com.scratch.database.mysql.jv.tables.records.BannerRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
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
public class BannerDao extends DAOImpl<BannerRecord, com.scratch.database.mysql.jv.tables.pojos.Banner, ULong> {

    /**
     * Create a new BannerDao without any configuration
     */
    public BannerDao() {
        super(Banner.BANNER, com.scratch.database.mysql.jv.tables.pojos.Banner.class);
    }

    /**
     * Create a new BannerDao with an attached configuration
     */
    public BannerDao(Configuration configuration) {
        super(Banner.BANNER, com.scratch.database.mysql.jv.tables.pojos.Banner.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.Banner object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Banner> fetchById(ULong... values) {
        return fetch(Banner.BANNER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Banner fetchOneById(ULong value) {
        return fetchOne(Banner.BANNER.ID, value);
    }

    /**
     * Fetch records that have <code>is_active IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Banner> fetchByIsActive(Byte... values) {
        return fetch(Banner.BANNER.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>display_text IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Banner> fetchByDisplayText(String... values) {
        return fetch(Banner.BANNER.DISPLAY_TEXT, values);
    }

    /**
     * Fetch records that have <code>content_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Banner> fetchByContentId(ULong... values) {
        return fetch(Banner.BANNER.CONTENT_ID, values);
    }

    /**
     * Fetch records that have <code>promotion_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Banner> fetchByPromotionId(ULong... values) {
        return fetch(Banner.BANNER.PROMOTION_ID, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Banner> fetchByCreatedTs(Timestamp... values) {
        return fetch(Banner.BANNER.CREATED_TS, values);
    }

    /**
     * Fetch records that have <code>updated_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Banner> fetchByUpdatedTs(Timestamp... values) {
        return fetch(Banner.BANNER.UPDATED_TS, values);
    }
}
