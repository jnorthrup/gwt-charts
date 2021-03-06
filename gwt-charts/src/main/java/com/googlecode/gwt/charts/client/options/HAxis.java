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

import com.google.gwt.core.client.JsDate;

import com.googlecode.gwt.charts.client.util.DateHelper;

import java.util.Date;

public class HAxis extends Axis {
	public static HAxis create() {
		return createObject().cast();
	}

	public static HAxis create(String title) {
		HAxis hAxis = createObject().cast();
		hAxis.setTitle(title);
		return hAxis;
	}

	protected HAxis() {
	}

	public final native void setMaxAlternation(int levels) /*-{
		this.maxAlternation = levels;
	}-*/;

	public final void setMaxValue(Date maxValue) {
		setMaxValueDate(DateHelper.getJsDate(maxValue));
	}

	public final void setMinValue(Date minValue) {
		setMinValueDate(DateHelper.getJsDate(minValue));
	}

	public final native void setShowTextEvery(int interval) /*-{
		this.showTextEvery = interval;
	}-*/;

	public final native void setSlantedText(boolean enabled) /*-{
		this.slantedText = enabled;
	}-*/;

	public final native void setSlantedTextAngle(int angle) /*-{
		this.slantedTextAngle = angle;
	}-*/;

	private final native void setMaxValueDate(JsDate maxValue) /*-{
		this.maxValue = maxValue;
	}-*/;

	private final native void setMinValueDate(JsDate minValue) /*-{
		this.minValue = minValue;
	}-*/;

}
