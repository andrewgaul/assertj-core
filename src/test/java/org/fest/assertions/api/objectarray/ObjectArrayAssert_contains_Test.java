/*
 * Created on Nov 29, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api.objectarray;

import static org.fest.util.Arrays.array;
import static org.mockito.Mockito.verify;

import org.fest.assertions.api.ObjectArrayAssert;
import org.fest.assertions.api.ObjectArrayAssertTest;

/**
 * Tests for <code>{@link ObjectArrayAssert#contains(Object...)}</code>.
 * 
 * @author Alex Ruiz
 * @author Mikhail Mazursky
 */
public class ObjectArrayAssert_contains_Test extends ObjectArrayAssertTest {

  @Override
  protected ObjectArrayAssert<Object> invoke_api_method() {
    return assertions.contains("Yoda", "Luke");
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertContains(getInfo(assertions), getActual(assertions), array("Yoda", "Luke"));
  }
}