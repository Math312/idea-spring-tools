/*
 *  Copyright (c) 2020 Gayan Perera
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Contributors:
 *     Gayan Perera <gayanper@gmail.com> - initial API and implementation
 */

package org.gap.ijplugins.spring.tools.extensions;

import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.SymbolKind;
import org.gap.ijplugins.spring.tools.graphics.StsIcons;
import org.wso2.lsp4intellij.contributors.icon.LSPDefaultIconProvider;

import javax.swing.*;

public class StsIconProvider extends LSPDefaultIconProvider {
    @Override
    public Icon getSymbolIcon(SymbolInformation information) {
        if (information.getKind() == SymbolKind.Interface) {
            switch (information.getName().substring(0, 2)) {
                case "@/":
                    return StsIcons.getRequestMappingIcon();
                default:
                    return StsIcons.getBeanIcon();
            }
        }
        return super.getSymbolIcon(information);
    }
}
