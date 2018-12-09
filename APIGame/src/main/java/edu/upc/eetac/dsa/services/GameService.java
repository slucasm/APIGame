package edu.upc.eetac.dsa.services;

import edu.upc.eetac.dsa.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/game", description = "Endpoint to Game Service")
@Path("/")
public class GameService {

    private MyGame mg;

    public GameService(){
        this.mg = MyGameImpl.getInstance();
    }

    @GET
    @ApiOperation(value = "Is completed?", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Boolean.class),
    })
    @Path("/isCompleted")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isCompleted(){
        return Response.status(201).entity(true).build();
    }

    @GET
    @ApiOperation(value = "Get checkpoint", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = int.class),
    })
    @Path("/checkpoint")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCheckpoint(){
        return Response.status(201).entity(0).build();
    }

    @GET
    @ApiOperation(value = "Get health", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = int.class),
    })
    @Path("/getHealth")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHealth(){
        return Response.status(201).entity(0).build();
    }

    @PUT
    @ApiOperation(value = "Update health", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = int.class),
    })
    @Path("/updateHealth/{newHealth}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateHealth(){
        return Response.status(201).entity(0).build();
    }


    @PUT
    @ApiOperation(value = "Update checkpoint", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = int.class),
    })
    @Path("/updateCheckpoint/{newCheckpoint}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateCheckpoint(){
        return Response.status(201).entity(0).build();
    }



}
