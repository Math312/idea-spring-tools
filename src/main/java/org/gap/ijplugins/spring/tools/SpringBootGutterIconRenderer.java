/*
 * Copyright 2002-2013 the original author or authors.
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

package org.gap.ijplugins.spring.tools;

import com.intellij.openapi.editor.markup.GutterIconRenderer;
import org.gap.ijplugins.spring.tools.graphics.StsIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author Alex Boyko
 */
public class SpringBootGutterIconRenderer extends GutterIconRenderer {

    public static SpringBootGutterIconRenderer INSTANCE = new SpringBootGutterIconRenderer();

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return StsIcons.getBootIcon();
    }
}
