/*
 * Copyright (c) 2014, Danilo Reinert (daniloreinert@growbit.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available under the src/resources/ directory of
 * this project (under the names LGPL-3.0.txt and ASL-2.0.txt respectively).
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

package com.github.nilportugues.jjschema.rest;

import com.github.nilportugues.jjschema.annotation.Rel;
import com.github.nilportugues.jjschema.model.User;
import com.github.nilportugues.jjschema.model.Users;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class UserResource {

    @GET
    public Users getAll(@QueryParam("minAge") int min, @QueryParam("maxAge") int max) {
        return null;
    }

    @POST
    @Rel("create")
    public Short createUser(User user) {
        return (short) 0;
    }

    @GET
    @Path("/{id}")
    @Rel("user")
    public User getUser(@PathParam("id") Short id) {
        return null;
    }

    @GET
    @Path("/{id}/admin")
    @Rel("admin")
    public Users getAdminUsers(@PathParam("id") Short id, @QueryParam("minAge") int min, @QueryParam("maxAge") int max) {
        return null;
    }

    @PUT
    @Path("/{id}")
    @Rel("update")
    public void updateUser(@PathParam("id") Short id, User user) {
    }

    @DELETE
    @Path("/{id}")
    @Rel("delete")
    public void deleteUser(@PathParam("id") Short id) {

    }
}
