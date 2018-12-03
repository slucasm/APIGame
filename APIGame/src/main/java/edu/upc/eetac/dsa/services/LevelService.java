package edu.upc.eetac.dsa.services;

import edu.upc.eetac.dsa.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/levels", description = "Endpoint to Level Service")
@Path("/")
public class LevelService {

    private MyGame mg;


    public LevelService(){
        this.mg = MyGameImpl.getInstance();
        int[][] matrix1 = new int[][]{
                {0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,1,1,1,1,9,0},
                {0,1,1,2,1,1,3,1,1,0},
                {0,1,1,2,1,4,1,1,1,0},
                {0,1,1,1,1,1,2,1,1,0},
                {0,1,2,2,1,1,1,1,1,0},
                {0,1,1,1,1,2,3,1,1,0},
                {0,1,1,1,1,2,2,2,1,0},
                {0,1,1,1,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0}
        };

        int[][] matrix2 = new int[][]{
                {0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,1,1,1,1,9,0},
                {0,1,1,2,1,1,3,1,1,0},
                {0,1,4,2,1,4,1,1,1,0},
                {0,1,1,2,1,1,2,2,1,0},
                {0,1,2,2,1,1,1,1,1,0},
                {0,1,1,1,1,2,2,2,1,0},
                {0,1,1,1,1,2,4,1,1,0},
                {0,1,1,1,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0}
        };
        Level level1 = new Level(0,10,10,matrix1);
        Level level2 = new Level(0,10,10,matrix2);

        this.mg.addLevel(level1);
        this.mg.addLevel(level2);

    }


    @GET
    @ApiOperation(value = "get level", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Level.class, responseContainer="Level"),
    })
    @Path("/{idLevel}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLevel(@PathParam("idLevel") int idLevel) {
            Level level = this.mg.getLevel(idLevel);
            GenericEntity<Level> entity = new GenericEntity<Level>(level){};
            return Response.status(201).entity(entity).build();
    }

    /*@POST
    @ApiOperation(value = "create a new Level", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=Level.class)
    })
    @Path("/addLevel/{idLevel},{rows},{columns},{matrix}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newLevel(@PathParam("idLevel") int idLevel,@PathParam("rows") int rows,@PathParam("columns") int columns,@PathParam("matrix") int[][] matrix) {
        Level level = new Level(idLevel,rows,columns,matrix);
        this.mg.addLevel(level);
        return Response.status(201).entity(level).build();
    }*/

    /*@POST
    @ApiOperation(value = "create a new Level", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=Level.class)
    })
    @Path("/addLevel/{level}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newLevel(@PathParam("level")  Level level) {
        this.mg.addLevel(level);
        return Response.status(201).entity(level).build();
    }*/


}
