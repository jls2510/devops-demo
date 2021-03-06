/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class Admin implements Serializable {

    private static final long serialVersionUID = 1696473053;

    private ULong     id;
    private String    username;
    private String    password;
    private Timestamp updatedTs;
    private Timestamp createdTs;

    public Admin() {}

    public Admin(Admin value) {
        this.id = value.id;
        this.username = value.username;
        this.password = value.password;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
    }

    public Admin(
        ULong     id,
        String    username,
        String    password,
        Timestamp updatedTs,
        Timestamp createdTs
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public Admin setId(ULong id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public Admin setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public Admin setUpdatedTs(Timestamp updatedTs) {
        this.updatedTs = updatedTs;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public Admin setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Admin (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}
