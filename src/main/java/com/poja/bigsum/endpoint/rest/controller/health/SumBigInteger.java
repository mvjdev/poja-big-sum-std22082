package com.poja.bigsum.endpoint.rest.controller.health;

import java.math.BigInteger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/big-sum")
public class SumBigInteger {

    @GET
    public Response getSum(@QueryParam("a") String a, @QueryParam("b") String b) {
        // Converting strings to BigIntegers
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        // Calculating the sum
        BigInteger sum = numA.add(numB);

        // Returning the sum as a response
        return Response.ok(sum.toString()).build();
    }
}


