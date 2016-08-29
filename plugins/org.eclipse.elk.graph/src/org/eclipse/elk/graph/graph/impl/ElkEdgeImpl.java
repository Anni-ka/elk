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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.elk.graph.graph.ElkConnectableShape;
import org.eclipse.elk.graph.graph.ElkEdge;
import org.eclipse.elk.graph.graph.ElkEdgeSection;
import org.eclipse.elk.graph.graph.ElkGraphPackage;
import org.eclipse.elk.graph.graph.ElkNode;
import org.eclipse.elk.graph.graph.ElkPort;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elk Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkEdgeImpl#getContainingNode <em>Containing Node</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkEdgeImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkEdgeImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkEdgeImpl#getEdgeSections <em>Edge Sections</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkEdgeImpl#isHyperedge <em>Hyperedge</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.impl.ElkEdgeImpl#isHierarchical <em>Hierarchical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElkEdgeImpl extends ElkGraphElementImpl implements ElkEdge {
    /**
     * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSources()
     * @generated
     * @ordered
     */
    protected EList<ElkConnectableShape> sources;

    /**
     * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargets()
     * @generated
     * @ordered
     */
    protected EList<ElkConnectableShape> targets;

    /**
     * The cached value of the '{@link #getEdgeSections() <em>Edge Sections</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdgeSections()
     * @generated
     * @ordered
     */
    protected EList<ElkEdgeSection> edgeSections;

    /**
     * The default value of the '{@link #isHyperedge() <em>Hyperedge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHyperedge()
     * @generated
     * @ordered
     */
    protected static final boolean HYPEREDGE_EDEFAULT = false;

    /**
     * The default value of the '{@link #isHierarchical() <em>Hierarchical</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isHierarchical()
     * @generated
     * @ordered
     */
    protected static final boolean HIERARCHICAL_EDEFAULT = false;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElkEdgeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ElkGraphPackage.Literals.ELK_EDGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElkNode getContainingNode() {
        if (eContainerFeatureID() != ElkGraphPackage.ELK_EDGE__CONTAINING_NODE) return null;
        return (ElkNode)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainingNode(ElkNode newContainingNode, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainingNode, ElkGraphPackage.ELK_EDGE__CONTAINING_NODE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainingNode(ElkNode newContainingNode) {
        if (newContainingNode != eInternalContainer() || (eContainerFeatureID() != ElkGraphPackage.ELK_EDGE__CONTAINING_NODE && newContainingNode != null)) {
            if (EcoreUtil.isAncestor(this, newContainingNode))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainingNode != null)
                msgs = ((InternalEObject)newContainingNode).eInverseAdd(this, ElkGraphPackage.ELK_NODE__CONTAINED_EDGES, ElkNode.class, msgs);
            msgs = basicSetContainingNode(newContainingNode, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ElkGraphPackage.ELK_EDGE__CONTAINING_NODE, newContainingNode, newContainingNode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElkConnectableShape> getSources() {
        if (sources == null) {
            sources = new EObjectWithInverseResolvingEList.ManyInverse<ElkConnectableShape>(ElkConnectableShape.class, this, ElkGraphPackage.ELK_EDGE__SOURCES, ElkGraphPackage.ELK_CONNECTABLE_SHAPE__OUTGOING_EDGES);
        }
        return sources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElkConnectableShape> getTargets() {
        if (targets == null) {
            targets = new EObjectWithInverseResolvingEList.ManyInverse<ElkConnectableShape>(ElkConnectableShape.class, this, ElkGraphPackage.ELK_EDGE__TARGETS, ElkGraphPackage.ELK_CONNECTABLE_SHAPE__INCOMING_EDGES);
        }
        return targets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElkEdgeSection> getEdgeSections() {
        if (edgeSections == null) {
            edgeSections = new EObjectContainmentWithInverseEList<ElkEdgeSection>(ElkEdgeSection.class, this, ElkGraphPackage.ELK_EDGE__EDGE_SECTIONS, ElkGraphPackage.ELK_EDGE_SECTION__PARENT_EDGE);
        }
        return edgeSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isHyperedge() {
        return getSources().size() <= 1 && getTargets().size() <= 1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isHierarchical() {
        // We're besically iterating over all sources and targets and check whether they are contained in the same
        // graph. If they are, we're a simple edge. If they are not, we're a hyperedge.
        ElkNode commonRepresentingNode = null;
        
        List<ElkConnectableShape> incidentShapes = new ArrayList<>(getSources().size() + getTargets().size());
        incidentShapes.addAll(getSources());
        incidentShapes.addAll(getTargets());
        
        for (ElkConnectableShape incidentShape : incidentShapes) {
            // Compute representing node
            ElkNode representingNode = null;
            
            if (incidentShape instanceof ElkNode) {
                representingNode = ((ElkNode) incidentShape).getParentNode();
            } else if (incidentShape instanceof ElkPort) {
                representingNode = ((ElkPort) incidentShape).getParentNode().getParentNode();
            }
            
            if (commonRepresentingNode == null) {
                commonRepresentingNode = representingNode;
            } else if (commonRepresentingNode != representingNode) {
                // Different hierarchy levels
                return true;
            }
        }
        
        return false;
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
            case ElkGraphPackage.ELK_EDGE__CONTAINING_NODE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainingNode((ElkNode)otherEnd, msgs);
            case ElkGraphPackage.ELK_EDGE__SOURCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSources()).basicAdd(otherEnd, msgs);
            case ElkGraphPackage.ELK_EDGE__TARGETS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargets()).basicAdd(otherEnd, msgs);
            case ElkGraphPackage.ELK_EDGE__EDGE_SECTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdgeSections()).basicAdd(otherEnd, msgs);
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
            case ElkGraphPackage.ELK_EDGE__CONTAINING_NODE:
                return basicSetContainingNode(null, msgs);
            case ElkGraphPackage.ELK_EDGE__SOURCES:
                return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
            case ElkGraphPackage.ELK_EDGE__TARGETS:
                return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
            case ElkGraphPackage.ELK_EDGE__EDGE_SECTIONS:
                return ((InternalEList<?>)getEdgeSections()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ElkGraphPackage.ELK_EDGE__CONTAINING_NODE:
                return eInternalContainer().eInverseRemove(this, ElkGraphPackage.ELK_NODE__CONTAINED_EDGES, ElkNode.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ElkGraphPackage.ELK_EDGE__CONTAINING_NODE:
                return getContainingNode();
            case ElkGraphPackage.ELK_EDGE__SOURCES:
                return getSources();
            case ElkGraphPackage.ELK_EDGE__TARGETS:
                return getTargets();
            case ElkGraphPackage.ELK_EDGE__EDGE_SECTIONS:
                return getEdgeSections();
            case ElkGraphPackage.ELK_EDGE__HYPEREDGE:
                return isHyperedge();
            case ElkGraphPackage.ELK_EDGE__HIERARCHICAL:
                return isHierarchical();
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
            case ElkGraphPackage.ELK_EDGE__CONTAINING_NODE:
                setContainingNode((ElkNode)newValue);
                return;
            case ElkGraphPackage.ELK_EDGE__SOURCES:
                getSources().clear();
                getSources().addAll((Collection<? extends ElkConnectableShape>)newValue);
                return;
            case ElkGraphPackage.ELK_EDGE__TARGETS:
                getTargets().clear();
                getTargets().addAll((Collection<? extends ElkConnectableShape>)newValue);
                return;
            case ElkGraphPackage.ELK_EDGE__EDGE_SECTIONS:
                getEdgeSections().clear();
                getEdgeSections().addAll((Collection<? extends ElkEdgeSection>)newValue);
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
            case ElkGraphPackage.ELK_EDGE__CONTAINING_NODE:
                setContainingNode((ElkNode)null);
                return;
            case ElkGraphPackage.ELK_EDGE__SOURCES:
                getSources().clear();
                return;
            case ElkGraphPackage.ELK_EDGE__TARGETS:
                getTargets().clear();
                return;
            case ElkGraphPackage.ELK_EDGE__EDGE_SECTIONS:
                getEdgeSections().clear();
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
            case ElkGraphPackage.ELK_EDGE__CONTAINING_NODE:
                return getContainingNode() != null;
            case ElkGraphPackage.ELK_EDGE__SOURCES:
                return sources != null && !sources.isEmpty();
            case ElkGraphPackage.ELK_EDGE__TARGETS:
                return targets != null && !targets.isEmpty();
            case ElkGraphPackage.ELK_EDGE__EDGE_SECTIONS:
                return edgeSections != null && !edgeSections.isEmpty();
            case ElkGraphPackage.ELK_EDGE__HYPEREDGE:
                return isHyperedge() != HYPEREDGE_EDEFAULT;
            case ElkGraphPackage.ELK_EDGE__HIERARCHICAL:
                return isHierarchical() != HIERARCHICAL_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} //ElkEdgeImpl
