package dev.stiebo.exception;

import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CustomNotFoundHandler implements ExceptionMapper<jakarta.ws.rs.NotFoundException> {

    @Context
    UriInfo uriInfo;

    @Override
    public Response toResponse(jakarta.ws.rs.NotFoundException exception) {
        String requestedUri = uriInfo.getRequestUri().toString();

        return Response
                .status(Response.Status.NOT_FOUND)
                .entity("Resource '%s' not found".formatted(requestedUri))
                .build();
    }
}
