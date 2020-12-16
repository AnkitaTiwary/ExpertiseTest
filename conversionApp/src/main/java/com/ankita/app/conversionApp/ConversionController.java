package com.ankita.app.conversionApp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.ankita.app.conversionApp.TO.ApiResponse;
import com.google.gson.Gson;

@Path("/conversions")
public class ConversionController {
	
	
	public static final Logger LOGGER=Logger.getLogger(ConversionController.class.getName());
	
	

	

	@Path("/ktoc")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String ktoC(@QueryParam("kelvin") double kelvin) {
		long startTime = System.currentTimeMillis();
		LOGGER.debug("Converting kelvin to celcius, input : "+kelvin);
		double celcius = kelvin - 273.15;
		ApiResponse response = new ApiResponse("Your Kelvin temperature "+kelvin +" K has been converted to celcius "+celcius +" C");
		Gson gson = new Gson();
		long endTime = System.currentTimeMillis();
		LOGGER.debug("Converted kelvin to celcius, input : "+kelvin+ " execution time "+(endTime-startTime) +" ms");
		return gson.toJson(response);
	}
	
	@Path("/ctok")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String ctok(@QueryParam("celcius") double celcius) {
		long startTime = System.currentTimeMillis();
		LOGGER.debug("Converting Celcius to Kelvin, input : "+celcius);
		double kelvin = celcius + 273.15;
		ApiResponse response = new ApiResponse("Your celcius temperature "+celcius +" C has been converted to kelvin "+kelvin + " K");
		Gson gson = new Gson();
		long endTime = System.currentTimeMillis();
		LOGGER.debug("Converted Celcius to Kelvin, input : "+celcius+ " execution time "+(endTime-startTime) +" ms");
		return gson.toJson(response);
	}
	
	@Path("/mtok")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String mtok(@QueryParam("mile") double mile) {
		long startTime = System.currentTimeMillis();
		LOGGER.debug("Converting Mile to kilometer, input : "+mile);
		double km = mile * 1.60934;
		ApiResponse response = new ApiResponse("Your mile input "+mile +" m has been converted to kilometer "+km);
		Gson gson = new Gson();
		long endTime = System.currentTimeMillis();
		LOGGER.debug("Converted Mile to kilometer, input : "+mile+ " execution time "+(endTime-startTime) +" ms");
		return gson.toJson(response);
	}
	
	
	@Path("/ktom")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String ktom(@QueryParam("km") double km) {
		long startTime = System.currentTimeMillis();
		LOGGER.debug("Converting Kilometer to mile, input : "+km);
		double mile = km / 1.60934;
		ApiResponse response = new ApiResponse("Your kilometer input "+ km +"km  has been converted to mile "+mile +" m");
		Gson gson = new Gson();
		long endTime = System.currentTimeMillis();
		LOGGER.debug("Converted Kilometer to mile, input : "+km+ " execution time "+(endTime-startTime) +" ms");
		return gson.toJson(response);
	}
	
	
	
	
}
