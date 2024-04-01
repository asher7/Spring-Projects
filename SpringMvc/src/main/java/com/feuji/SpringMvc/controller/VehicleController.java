package com.feuji.SpringMvc.controller;

import java.io.PrintWriter;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.feuji.SpringMvc.Entity.Vehicle;

import ch.qos.logback.classic.Logger;

@Controller
public class VehicleController {


	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ModelAndView getVehicle()
	{
		return new ModelAndView("vehicleForm","vehicle",new Vehicle());
	}

	
	@RequestMapping( value = "/submitVehicle", method = RequestMethod.POST)
	public String postVehicle(@Valid Vehicle vehicle, BindingResult bindingResult, ModelMap modelMap)
	{
		modelMap.put("vehicle", vehicle);
		

       if (bindingResult.hasErrors()) {
           return "vehicleForm";
      }
        		if (vehicle.getDriverName() == null || vehicle.getVehicleNO()==null )
		{
			throw new RuntimeException("Book Language is required");
		}
		
		return "submitVehicle";
	}
}
