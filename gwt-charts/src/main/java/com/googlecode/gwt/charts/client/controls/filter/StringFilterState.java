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

import com.google.gwt.core.client.JavaScriptObject;

import com.googlecode.gwt.charts.client.controls.ControlState;

public class StringFilterState extends ControlState {
	public static StringFilterState create() {
		return createObject().cast();
	}

	protected StringFilterState() {
		// Default constructor
	}

	public final native void setValue(JavaScriptObject value) /*-{
		this.value = value;
	}-*/;

	public final native void setValue(String value) /*-{
		this.value = value;
	}-*/;

	public final native JavaScriptObject getValueObject() /*-{
		return this.value;
	}-*/;

	public final native String getValueString() /*-{
		return this.value;
	}-*/;

}
