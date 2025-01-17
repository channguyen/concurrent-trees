/**
 * Copyright 2012 Niall Gallagher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.concurrenttrees.radix.node.concrete;

import com.googlecode.concurrenttrees.radix.node.Node;
import org.junit.Test;

import java.util.Collections;

/**
 * @author Niall Gallagher
 */
public class DefaultCharArrayNodeFactoryTest {


    @Test(expected = IllegalStateException.class)
    public void testCreateNode_NullEdge() throws Exception {
        //noinspection NullableProblems
        new DefaultCharArrayNodeFactory().createNode(null, 1, Collections.<Node>emptyList(), false);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateNode_EmptyEdgeNonRoot() throws Exception {
        //noinspection NullableProblems
        new DefaultCharArrayNodeFactory().createNode("", 1, Collections.<Node>emptyList(), false);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateNode_NullEdges() throws Exception {
        //noinspection NullableProblems
        new DefaultCharArrayNodeFactory().createNode("FOO", 1, null, false);
    }
}
