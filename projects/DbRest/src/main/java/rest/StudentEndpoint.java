package rest;

import dao.StudentDao;
import entities.Student;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentEndpoint {
    @Inject
    private StudentDao studentDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllStudents(){
        return Response.ok(studentDao.getAll()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response getStudentById(@PathParam("id")Long id){
        return Response.ok(studentDao.getById(id)).build();
    }

    @POST
    public Response postStudent(final Student student){
        studentDao.create(student);
        return Response.ok().build();
    }

    @PUT
    public Response putStudent(final Student student){
        studentDao.update(student);
        return Response.ok().build();
    }

    @DELETE
    public Response deleteStudent(final Student student){
        studentDao.delete(student);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteStudentById(@PathParam("id")Long id){
        studentDao.delete(id);
        return Response.ok().build();
    }
}
