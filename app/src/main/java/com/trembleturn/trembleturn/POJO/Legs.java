package com.trembleturn.trembleturn.POJO;

import java.util.List;
 
import com.google.gson.annotations.SerializedName;

public class Legs{

	public Distance distance;

	public Duration duration;

	@SerializedName("end_address")
	public String endaddress;

	public EndLocation endlocation;

	@SerializedName("start_address")
	public String startaddress;

	public StartLocation startlocation;

	public List<Steps> steps;

}