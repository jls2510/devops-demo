/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.RecipeCategoryRelation;
import com.scratch.database.mysql.jv.tables.records.RecipeCategoryRelationRecord;

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
public class RecipeCategoryRelationDao extends DAOImpl<RecipeCategoryRelationRecord, com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation, ULong> {

    /**
     * Create a new RecipeCategoryRelationDao without any configuration
     */
    public RecipeCategoryRelationDao() {
        super(RecipeCategoryRelation.RECIPE_CATEGORY_RELATION, com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation.class);
    }

    /**
     * Create a new RecipeCategoryRelationDao with an attached configuration
     */
    public RecipeCategoryRelationDao(Configuration configuration) {
        super(RecipeCategoryRelation.RECIPE_CATEGORY_RELATION, com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation> fetchById(ULong... values) {
        return fetch(RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation fetchOneById(ULong value) {
        return fetchOne(RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.ID, value);
    }

    /**
     * Fetch records that have <code>recipe_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation> fetchByRecipeId(ULong... values) {
        return fetch(RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.RECIPE_ID, values);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation> fetchByCategoryId(ULong... values) {
        return fetch(RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>updated_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation> fetchByUpdatedTs(Timestamp... values) {
        return fetch(RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.UPDATED_TS, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.RecipeCategoryRelation> fetchByCreatedTs(Timestamp... values) {
        return fetch(RecipeCategoryRelation.RECIPE_CATEGORY_RELATION.CREATED_TS, values);
    }
}