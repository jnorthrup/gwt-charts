/*
 * Copyright 2012 Rui Afonso
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.googlecode.gwt.charts.client.options;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A set of background color options
 */
public class BackgroundColor extends JavaScriptObject {
	/**
	 * Default constructor
	 * @return a new object instance
	 */
	public static BackgroundColor create() {
		return createObject().cast();
	}
	
	protected BackgroundColor() {
	}

	/**
	 * 
	 * @param fill The chart fill color, as an HTML color string
	 */
	public final native void setFill(String fill) /*-{
		this.fill = fill;
	}-*/;

	/**
	 * 
	 * @param stroke The color of the chart border, as an HTML color string.
	 */
	public final native void setStroke(String stroke) /*-{
		this.stroke = stroke;
	}-*/;
	
	/**
	 * 
	 * @param strokeWidth The border width, in pixels
	 */
	public final native void setStrokeWidth(int strokeWidth) /*-{
		this.strokeWidth = strokeWidth;
	}-*/;

}
