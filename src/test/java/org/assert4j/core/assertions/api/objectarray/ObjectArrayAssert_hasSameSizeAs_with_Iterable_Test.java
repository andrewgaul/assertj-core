/*
 * Created on Apr 27, 2012
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
 * Copyright @2010-2012 the original author or authors.
 */
package org.assert4j.core.assertions.api.objectarray;

import static org.assert4j.core.util.Lists.newArrayList;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.assert4j.core.assertions.api.ObjectArrayAssert;
import org.assert4j.core.assertions.api.ObjectArrayAssertBaseTest;


/**
 * Tests for <code>{@link ObjectArrayAssert#hasSameSizeAs(int)}</code>.
 * 
 * @author Nicolas François
 * @author Mikhail Mazursky
 */
public class ObjectArrayAssert_hasSameSizeAs_with_Iterable_Test extends ObjectArrayAssertBaseTest {

  private final List<String> other = newArrayList("Yoda");

  @Override
  protected ObjectArrayAssert<Object> invoke_api_method() {
    return assertions.hasSameSizeAs(other);
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertHasSameSizeAs(getInfo(assertions), getActual(assertions), other);
  }
}