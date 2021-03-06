/*
 * Copyright 2016-present The Material Motion Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.material.motion.family.rebound;

import android.view.View;

import com.google.android.material.motion.gestures.GestureRecognizer;
import com.google.android.material.motion.runtime.Performer;
import com.google.android.material.motion.runtime.Plan;

/**
 * Pauses a view's {@link SpringTo spring} while a gesture recognizer is active.
 */
public class PausesSpring extends ObjectPausesSpring<View> {

  /**
   * Creates a PausesSpring plan.
   *
   * @param property The spring for this property will be paused and resumed.
   * @param gestureRecognizer The gesture recognizer which on {@link GestureRecognizer#BEGAN} will
   * pause the spring and on {@link GestureRecognizer#RECOGNIZED} and {@link
   * GestureRecognizer#CANCELLED} will resume the spring.
   */
  public PausesSpring(ReboundProperty<? super View, ?> property, GestureRecognizer gestureRecognizer) {
    super(property, gestureRecognizer);
  }
}
