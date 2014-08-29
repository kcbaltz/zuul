/**
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.zuul.groovy.filter

import com.netflix.zuul.filter.PostFilterSynchronous;
import com.netflix.zuul.lifecycle.EgressResponse;

public class ExamplePostFilter<T> extends PostFilterSynchronous<T> {

    @Override
    public EgressResponse<T> apply(EgressResponse<T> egressResp) {
        println("post filter " + this)
        egressResp
    }

    @Override
    public int getOrder() { 
        1
    }
}