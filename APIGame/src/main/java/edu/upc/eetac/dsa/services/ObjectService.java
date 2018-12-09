package edu.upc.eetac.dsa.services;

import edu.upc.eetac.dsa.*;

import edu.upc.eetac.dsa.Object;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/objects", description = "Endpoint to Object Service")
@Path("/")
public class ObjectService {

    private MyGame mg;

    public ObjectService() {
        this.mg = MyGameImpl.getInstance();

        Object obj1 = new Object("0", "Escudo");
        Object obj2 = new Object("1", "Navaja");

        this.mg.addObject(obj1);
        this.mg.addObject(obj2);
    }

    /*@POST
    @ApiOperation(value = "add object", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Object.class),

    })
    @Path("/newObject")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addObject(Object object) {
        this.mg.addObject(object);
        return Response.status(201).entity(object).build();
    }

    @GET
    @ApiOperation(value = "Get all objects", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful",response = Object.class),
    })
    @Path("/getObjects")
    @Produces(MediaType.APPLICATION_JSON)
    public Response allObjects(){
        List<Object> objectList =this.mg.getAllObjects();
        GenericEntity<List<Object>> entity = new GenericEntity<List<Object>>(objectList) {};
        return Response.status(201).entity(entity).build();
    }*/

    /*@GET
    @ApiOperation(value = "Get object", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful",response = Object.class),
    })
    @Path("/getObject/{idObject}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getObject(@PathParam("idObject") String idObject) {
        Object object = this.mg.getObject(idObject);
        return Response.status(201).entity(object).build();

    }*/
    /*@GET
    @ApiOperation(value = "get object", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Object.class),
            @ApiResponse(code = 404, message = "Error"),
    })
    @Path("/getObject/{idObject}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getObject(@PathParam("idObject") String idObject) {
        Object object = this.mg.getObject(idObject);
        return Response.status(201).entity(object).build();
    }*/

    @GET
    @ApiOperation(value = "Get object", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful",response = Object.class),
            @ApiResponse(code = 404, message = "Cannot find user")
    })
    @Path("/getObject/{idObject}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getObject(@PathParam("idObject") String idObject) {
        Object object = this.mg.getObject(idObject);
        return Response.status(201).entity(object).build();
    }

}
