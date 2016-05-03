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
package org.eclipse.elk.core.util.internal;

/**
 * Operators used in the elkm meta data files.
 * 
 * <p>Partly copied from
 * <ul>
 *   <li>{@link org.eclipse.xtext.xbase.lib.IntegerExtensions}</li>
 *   <li>{@link org.eclipse.xtext.xbase.lib.DoubleExtensions}</li>
 * </ul>
 * </p>
 */
public final class MetaDataExtensions {
    
    private MetaDataExtensions() {
    }
    
    // CHECKSTYLEOFF MethodName
    
    /**
     * The unary <code>minus</code> operator. This is the equivalent to the Java's <code>-</code> function.
     * 
     * @param i  an integer.
     * @return   <code>-i</code>
     */
    public static int operator_minus(final int i) {
        return -i;
    }
    
    /**
     * The unary <code>minus</code> operator. This is the equivalent to the Java's <code>-</code> function.
     * 
     * @param s  a short.
     * @return   <code>-s</code>
     */
    public static int operator_minus(final short s) {
        return -s;
    }
    
    /**
     * The unary <code>minus</code> operator. This is the equivalent to the Java's <code>-</code> function.
     * 
     * @param l  a long.
     * @return   <code>-l</code>
     */
    public static long operator_minus(final long l) {
        return -l;
    }
    
    /**
     * The unary <code>minus</code> operator. This is the equivalent to the Java's <code>-</code> function.
     * 
     * @param f  a float.
     * @return   <code>-f</code>
     */
    public static float operator_minus(final float f) {
        return -f;
    }
    
    /**
     * The unary <code>minus</code> operator. This is the equivalent to the Java's <code>-</code> function.
     * 
     * @param d  a double.
     * @return   <code>-d</code>
     */
    public static double operator_minus(final double d) {
        return -d;
    }

}
