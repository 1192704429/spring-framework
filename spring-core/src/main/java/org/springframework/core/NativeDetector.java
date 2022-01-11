/*
 * Copyright 2002-2021 the original author or authors.
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

package org.springframework.core;

/**
 * A common delegate for detecting a GraalVM native image environment.
 *
 * <p>Requires using the {@code -H:+InlineBeforeAnalysis} native image compiler flag in order to allow code removal at
 * build time.
 *
 * @author Sebastien Deleuze
 * @since 5.3.4
 */
public abstract class NativeDetector {

	// See https://github.com/oracle/graal/blob/master/sdk/src/org.graalvm.nativeimage/src/org/graalvm/nativeimage/ImageInfo.java
	/**
	 * 属性的信息的系统属性的名称
	 *
	 * 当前执行代码的上下文。如果属性返回
	 *
	 * 代码是在图像的上下文中执行的
	 *
	 * *构建(例如，在一个静态初始化的类，将包含在图像中)。如果
	 *
	 * *属性返回代码{@link #PROPERTY_IMAGE_CODE_VALUE_RUNTIME}给出的字符串
	 *
	 * *在映像运行时执行。否则不设置属性。
	 */
	private static final boolean imageCode = (System.getProperty("org.graalvm.nativeimage.imagecode") != null);

	/**
	 * 						如果在映像构建上下文中或映像运行时调用
	 * Returns {@code true} if invoked in the context of image building or during image runtime, else {@code false}.
	 */
	public static boolean inNativeImage() {
		return imageCode;
	}
}
