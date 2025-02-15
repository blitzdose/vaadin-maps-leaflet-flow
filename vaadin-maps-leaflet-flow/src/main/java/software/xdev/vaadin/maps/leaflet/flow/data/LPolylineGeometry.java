/*
 * Copyright © 2019 XDEV Software (https://xdev.software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package software.xdev.vaadin.maps.leaflet.flow.data;

import java.util.List;


public class LPolylineGeometry
{
	private List<List<Double>> coordinates;
	private String type;
	
	public LPolylineGeometry(final String type, final List<List<Double>> coordinates)
	{
		this.type = type;
		this.coordinates = coordinates;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(final String type)
	{
		this.type = type;
	}
	
	public List<List<Double>> getCoordinates()
	{
		return this.coordinates;
	}
	
	public void setCoordinates(final List<List<Double>> poly)
	{
		this.coordinates = poly;
	}
	
}
