/*
 *	Copyright 2008 Isaac Truett.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.googlecode.simplegwt.command.client.ui;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Button;
import com.googlecode.simplegwt.command.client.CommandClickHandler;

/**
 * A {@link Button} that executes a {@link Command} when clicked.<br />
 * <h3>CSS Style Rules</h3>
 * <ul>
 * <li>.simpleGwt-CommandButton { }</li>
 * </ul>
 * 
 * @since 1.0
 */
public class CommandButton extends Button {
	/**
	 * Creates a new <code>CommandButton</code>.
	 * 
	 * @param text the text of the <code>Button</code>
	 * @param command the <code>Command</code> to execute when clicked
	 */
	public CommandButton(final String text, final Command command) {
		super(text);
		this.addClickHandler(new CommandClickHandler(command));

		setStylePrimaryName("simpleGwt-CommandButton");
	}
}
