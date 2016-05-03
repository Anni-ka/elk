/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     spoenemann - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.core.meta.scoping

import org.eclipse.elk.core.util.internal.MetaDataExtensions
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures

/**
 * We don't use the Xbase library in our algorithm projects, so we have to replace the standard imports
 * by our own extensions.
 */
class MetaDataImplicitlyImportedFeatures extends ImplicitlyImportedFeatures {
    
    override protected getStaticImportClasses() {
        emptyList
    }
    
    override protected getExtensionClasses() {
        #[MetaDataExtensions]
    }
    
}