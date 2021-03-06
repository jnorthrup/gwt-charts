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
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

import com.googlecode.gwt.charts.client.options.BackgroundColor;
import com.googlecode.gwt.charts.client.options.ChartArea;
import com.googlecode.gwt.charts.client.options.Legend;
import com.googlecode.gwt.charts.client.options.Options;
import com.googlecode.gwt.charts.client.options.PieSliceText;
import com.googlecode.gwt.charts.client.options.Slice;
import com.googlecode.gwt.charts.client.options.TextStyle;
import com.googlecode.gwt.charts.client.util.ArrayHelper;

/**
 * Configuration options for {@link PieChart}.
 */
public class PieChartOptions extends Options {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static PieChartOptions create() {
		return createObject().cast();
	}

	protected PieChartOptions() {
	}

	public final native void setBackgroundColor(BackgroundColor backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native void setBackgroundColor(String color) /*-{
		this.backgroundColor = color;
	}-*/;

	public final native void setChartArea(ChartArea chartArea) /*-{
		this.chartArea = chartArea;
	}-*/;

	public final void setColors(String... colors) {
		setColors(ArrayHelper.createArray(colors));
	}

	public final native void setFontName(String name) /*-{
		this.fontName = name;
	}-*/;

	public final native void setFontSize(double size) /*-{
		this.fontSize = size;
	}-*/;

	public final native void setIs3D(boolean is3D) /*-{
		this.is3D = is3D;
	}-*/;

	public final native void setLegend(Legend legend) /*-{
		this.legend = legend;
	}-*/;

	public final native void setPieResidueSliceColor(String pieResidueSliceColor) /*-{
		this.pieResidueSliceColor = pieResidueSliceColor;
	}-*/;

	public final native void setPieResidueSliceLabel(String pieResidueSliceLabel) /*-{
		this.pieResidueSliceLabel = pieResidueSliceLabel;
	}-*/;

	public final native void setPieSliceBorderColor(String pieSliceBorderColor) /*-{
		this.pieSliceBorderColor = pieSliceBorderColor;
	}-*/;

	public final void setPieSliceText(PieSliceText pieSliceText) {
		setPieSliceText(pieSliceText.getName());
	}

	public final native void setPieSliceTextStyle(TextStyle pieSliceTextStyle) /*-{
		this.pieSliceTextStyle = pieSliceTextStyle;
	}-*/;

	/**
	 * If set to true, will draw series from right to left. The default is to draw left-to-right. This option is only
	 * supported for a discrete major axis.
	 * 
	 * @param reverseCategories
	 * @see <a href="http://developers.google.com/chart/interactive/docs/customizing_axes.html#Terminology">Discrete vs
	 *      Continuous</a>
	 */
	public final native void setReverseCategories(boolean reverseCategories) /*-{
		this.reverseCategories = reverseCategories;
	}-*/;

	public final native void setSlices(JsArray<Slice> slices) /*-{
		this.slices = slices;
	}-*/;

	public final native void setSliceVisibilityThreshold(double sliceVisibilityThreshold) /*-{
		this.sliceVisibilityThreshold = sliceVisibilityThreshold;
	}-*/;

	public final native void setTitle(String title) /*-{
		this.title = title;
	}-*/;

	public final native void setTitleTextStyle(TextStyle textStyle) /*-{
		this.titleTextStyle = textStyle;
	}-*/;

	public final native void setTooltip(PieChartTooltip tooltip) /*-{
		this.tooltip = tooltip;
	}-*/;

	private final native void setColors(JsArrayString colors) /*-{
		this.colors = colors;
	}-*/;

	private final native void setPieSliceText(String pieSliceText) /*-{
		this.pieSliceText = pieSliceText;
	}-*/;

}
