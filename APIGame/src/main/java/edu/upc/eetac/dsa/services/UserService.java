package edu.upc.eetac.dsa.services;


import edu.upc.eetac.dsa.Level;
import edu.upc.eetac.dsa.MyGame;
import edu.upc.eetac.dsa.MyGameImpl;
import edu.upc.eetac.dsa.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/users", description = "Endpoint to User Service")
@Path("/")
public class UserService {

    private MyGame mg;

    public UserService(){

        this.mg = MyGameImpl.getInstance();

        User userr1 = new User("0","Sergi","a");
        this.mg.addUser(userr1);
    }

    @POST
    @ApiOperation(value = "add user", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = User.class, responseContainer="User"),
            @ApiResponse(code = 404, message = "User already exists")
    })
    @Path("/newUser")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUser(User user) {
        int i = this.mg.addUser(user);
        if (i == 1)
            return Response.status(201).entity(user).build();
        else
            return Response.status(404).build();
    }

    @PUT
    @ApiOperation(value = "change Password", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Cannot change password")
    })
    @Path("/changePassword/{userName},{passwordOld},{passwordNew}")
    public Response changePassword(@PathParam("userName") String userName,@PathParam("passwordOld") String passwordOld,@PathParam("passwordNew") String passwordNew) {
        int i = this.mg.changePassword(userName, passwordOld, passwordNew);
        if (i == 1) return Response.status(201).build();
        else return Response.status(404).build();
    }

    @GET
    @ApiOperation(value = "Check if user is admin", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful",response = User.class),
            @ApiResponse(code = 404, message = "Cannot find user")
    })
    @Path("/isAdmin/{userName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response isAdmin(@PathParam("userName") String userName) {
        boolean isAdmin = this.mg.isAdmin(userName);
        if (isAdmin == false) return Response.status(404).build();
        else {
            User user = this.mg.getUser(userName);
            return Response.status(201).entity(user).build();
        }
    }

    @GET
    @ApiOperation(value = "Get all users", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful",response = User.class),
            @ApiResponse(code = 404, message = "Cannot find user")
    })
    @Path("/getUsers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response allUsers(){
        List<User> userList =this.mg.getAllUsers();
        GenericEntity<List<User>> entity = new GenericEntity<List<User>>(userList) {};
        return Response.status(201).entity(entity).build();
    }

    @GET
    @ApiOperation(value = "Check if user is admin", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful",response = User.class),
            @ApiResponse(code = 404, message = "Cannot find user")
    })
    @Path("/Login/{userName},{password}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@PathParam("userName") String userName,@PathParam("password") String password) {
        int i = this.mg.loginUser(userName,password);
        if (i == 0) return Response.status(404).build();
        else {
            User user = this.mg.getUser(userName);
            return Response.status(201).entity(user).build();
        }
    }

    @GET
    @ApiOperation(value = "Get all users ordered by money", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful",response = User.class),
            @ApiResponse(code = 404, message = "Cannot find user")
    })
    @Path("/getUsersOrderedByMoney")
    @Produces(MediaType.APPLICATION_JSON)
    public Response allUsersOrderedByMoney(){
        List<User> userList =this.mg.getUsersOrderedByMoney();
        GenericEntity<List<User>> entity = new GenericEntity<List<User>>(userList) {};
        return Response.status(201).entity(entity).build();
    }

}
