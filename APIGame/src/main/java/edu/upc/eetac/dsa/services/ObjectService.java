package edu.upc.eetac.dsa.services;

import edu.upc.eetac.dsa.*;
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

        Objectt obj1 = new Objectt("0", "Escudo");
        Objectt obj2 = new Objectt("1", "Navaja");

        this.mg.addObject(obj1);
        this.mg.addObject(obj2);
    }

    @POST
    @ApiOperation(value = "add object", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Objectt.class),

    })
    @Path("/newObject")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addObject(Objectt object) {
        this.mg.addObject(object);
        return Response.status(201).entity(object).build();
    }

    @GET
    @ApiOperation(value = "Get all objects", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful",response = Objectt.class),
    })
    @Path("/getObjects")
    @Produces(MediaType.APPLICATION_JSON)
    public Response allObjects(){
        List<Objectt> objectList =this.mg.getAllObjects();
        GenericEntity<List<Objectt>> entity = new GenericEntity<List<Objectt>>(objectList) {};
        return Response.status(201).entity(entity).build();
    }


    @GET
    @ApiOperation(value = "Get object", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Objectt.class, responseContainer = "Object"),
    })
    @Path("/getObject/{idObject}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getObject(@PathParam("idObject") String idObject) {
        Objectt object1 = this.mg.getObject(idObject);
        return Response.status(201).entity(object1).build();
    }

}
