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
package com.googlecode.gwt.charts.client.controls.filter;

import com.googlecode.gwt.charts.client.controls.ControlState;

public class NumberRangeFilterState extends ControlState {
	public static NumberRangeFilterState create() {
		return createObject().cast();
	}

	protected NumberRangeFilterState() {
		// Default constructor
	}

	public final native void setHighThumbAtMaximum(boolean highThumbAtMaximum) /*-{
		this.highThumbAtMaximum = highThumbAtMaximum;
	}-*/;

	public final native void setHighValue(double highValue) /*-{
		this.highValue = highValue;
	}-*/;

	public final native void setLowThumbAtMinimum(boolean lowThumbAtMinimum) /*-{
		this.lowThumbAtMinimum = lowThumbAtMinimum;
	}-*/;

	public final native void setLowValue(double lowValue) /*-{
		this.lowValue = lowValue;
	}-*/;

	public final native boolean getHighThumbAtMaximum() /*-{
		return this.highThumbAtMaximum;
	}-*/;

	public final native double getHighValue() /*-{
		return this.highValue;
	}-*/;

	public final native boolean getLowThumbAtMinimum() /*-{
		return this.lowThumbAtMinimum;
	}-*/;

	public final native double getLowValue() /*-{
		return this.lowValue;
	}-*/;
}
