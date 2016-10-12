/**
 * Copyright (c) 2016 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Kiel University - initial API and implementation
 */
package org.eclipse.elk.graph.graph.impl;

import java.util.Collection;

import org.eclipse.elk.graph.graph.ElkGraphData;
import org.eclipse.elk.graph.graph.ElkGraphElement;
import org.eclipse.elk.graph.graph.ElkGraphPackage;
import org.eclipse.elk.graph.graph.ElkLabel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkGraphElementImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkGraphElementImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkGraphElementImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElkGraphElementImpl extends EMapPropertyHolderImpl implements ElkGraphElement {
    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected EList<ElkLabel> labels;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected EList<ElkGraphData> data;

    /**
     * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentifier()
     * @generated
     * @ordered
     */
    protected static final String IDENTIFIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentifier()
     * @generated
     * @ordered
     */
    protected String identifier = IDENTIFIER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElkGraphElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ElkGraphPackage.Literals.ELK_GRAPH_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElkLabel> getLabels() {
        if (labels == null) {
            labels = new EObjectContainmentWithInverseEList<ElkLabel>(ElkLabel.class, this, ElkGraphPackage.ELK_GRAPH_ELEMENT__LABELS, ElkGraphPackage.ELK_LABEL__PARENT);
        }
        return labels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElkGraphData> getData() {
        if (data == null) {
            data = new EObjectContainmentEList<ElkGraphData>(ElkGraphData.class, this, ElkGraphPackage.ELK_GRAPH_ELEMENT__DATA);
        }
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdentifier(String newIdentifier) {
        String oldIdentifier = identifier;
        identifier = newIdentifier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ElkGraphPackage.ELK_GRAPH_ELEMENT__IDENTIFIER, oldIdentifier, identifier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public <T extends ElkGraphData> T getData(Class<T> type) {
        if (type != null) {
            for (ElkGraphData graphData : getData()) {
                if (type.isInstance(graphData)) {
                    return type.cast(graphData);
                }
            }
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__LABELS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__LABELS:
                return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__DATA:
                return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__LABELS:
                return getLabels();
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__DATA:
                return getData();
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__IDENTIFIER:
                return getIdentifier();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__LABELS:
                getLabels().clear();
                getLabels().addAll((Collection<? extends ElkLabel>)newValue);
                return;
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__DATA:
                getData().clear();
                getData().addAll((Collection<? extends ElkGraphData>)newValue);
                return;
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__IDENTIFIER:
                setIdentifier((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__LABELS:
                getLabels().clear();
                return;
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__DATA:
                getData().clear();
                return;
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__IDENTIFIER:
                setIdentifier(IDENTIFIER_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__LABELS:
                return labels != null && !labels.isEmpty();
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__DATA:
                return data != null && !data.isEmpty();
            case ElkGraphPackage.ELK_GRAPH_ELEMENT__IDENTIFIER:
                return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (identifier: ");
        result.append(identifier);
        result.append(')');
        return result.toString();
    }

} //ElkGraphElementImpl
