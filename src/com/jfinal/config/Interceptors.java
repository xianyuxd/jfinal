/**
 * Copyright (c) 2011-2014, James Zhan 詹波 (jfinal@126.com).
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

package com.jfinal.config;

import java.util.ArrayList;
import java.util.List;
import com.jfinal.aop.Interceptor;

/**
 * The interceptors applied to all actions.
 */
final public class Interceptors {
	
	private final List<Interceptor> interceptorList = new ArrayList<Interceptor>();
	
	public Interceptors add(Interceptor globalInterceptor) {
		if (globalInterceptor != null)
			this.interceptorList.add(globalInterceptor);
		return this;
	}
	
	public Interceptor[] getInterceptorArray() {
		Interceptor[] result = interceptorList.toArray(new Interceptor[interceptorList.size()]);
		return result == null ? new Interceptor[0] : result;
	}
}
