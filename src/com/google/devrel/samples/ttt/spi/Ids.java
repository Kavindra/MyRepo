/* Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.devrel.samples.ttt.spi;

/**
 * Contains the client IDs for allowed clients consuming the tictactoe API.
 */
public class Ids {
  //public static final String WEB_CLIENT_ID = "702791274273.apps.googleusercontent.com";//for Appengine
	public static final String WEB_CLIENT_ID = "702791274273-oiq0id2ve6lvd9dcto5muotmgn5gmldf.apps.googleusercontent.com"; //for localhost
  public static final String ANDROID_CLIENT_ID = "replace this with your Android client ID";
  public static final String IOS_CLIENT_ID = "replace this with your iOS client ID";
  public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;
}
