package com.lti;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/circle")
public class CircleService {
	
	@GET
	@Path("/area/{radius}")
	public String getArea(@PathParam(value="radius") double radius) {
		double area=Math.PI*radius;
		return String.valueOf(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
