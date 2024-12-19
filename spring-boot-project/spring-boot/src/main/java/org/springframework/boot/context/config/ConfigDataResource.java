/*
 * Copyright 2012-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.context.config;

/**
 * A single resource from which {@link ConfigData} can be loaded. Implementations must
 * implement a valid {@link #equals(Object) equals}, {@link #hashCode() hashCode} and
 * {@link #toString() toString} methods.
 *
 * @author Phillip Webb
 * @author Madhura Bhave
 * @since 2.4.0
 */
public abstract class ConfigDataResource {

	/**
	 * 如果是true，必须实现equals和hashCode方法
	 */
	private final boolean optional;

	/**
	 * Create a new non-optional {@link ConfigDataResource} instance.
	 */
	public ConfigDataResource() {
		this(false);
	}

	/**
	 * Create a new {@link ConfigDataResource} instance.
	 * @param optional if the resource is optional
	 * @since 2.4.6
	 */
	protected ConfigDataResource(boolean optional) {
		this.optional = optional;
	}

	boolean isOptional() {
		return this.optional;
	}

}
