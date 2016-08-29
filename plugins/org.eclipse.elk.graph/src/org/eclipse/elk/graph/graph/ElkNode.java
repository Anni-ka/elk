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
package org.eclipse.elk.graph.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elk Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A node in the graph. Edges can be connected to the node directly or through one of its ports.
 * 
 * <p>All nodes except one must have an assigned parent node. The node that does not have a parent node is the graph's root node and represents the graph itself. There can only be one root node for each graph. The parent-child relationship of nodes induces hierarchy in nested graphs: a node's children constitute the graph contained in and represented by that node.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.elk.graph.graph.ElkNode#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.ElkNode#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.ElkNode#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.ElkNode#getContainedEdges <em>Contained Edges</em>}</li>
 *   <li>{@link org.eclipse.elk.graph.graph.ElkNode#isHierarchical <em>Hierarchical</em>}</li>
 * </ul>
 *
 * @see org.eclipse.elk.graph.graph.ElkGraphPackage#getElkNode()
 * @model
 * @generated
 */
public interface ElkNode extends ElkConnectableShape {
    /**
     * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.elk.graph.graph.ElkPort}.
     * It is bidirectional and its opposite is '{@link org.eclipse.elk.graph.graph.ElkPort#getParentNode <em>Parent Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The node's list of ports.
     * 
     * <p>Adding or removing a port to/from this list automatically sets its parent node.</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ports</em>' containment reference list.
     * @see org.eclipse.elk.graph.graph.ElkGraphPackage#getElkNode_Ports()
     * @see org.eclipse.elk.graph.graph.ElkPort#getParentNode
     * @model opposite="parentNode" containment="true"
     * @generated
     */
    EList<ElkPort> getPorts();

    /**
     * Returns the value of the '<em><b>Child Nodes</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.elk.graph.graph.ElkNode}.
     * It is bidirectional and its opposite is '{@link org.eclipse.elk.graph.graph.ElkNode#getParentNode <em>Parent Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Child nodes contained in this node. If the node contains at least one child node, the node is a <em>hierarchical node</em>.
     * 
     * <p>Adding or removing a node to/from this list automatically sets its parent node.</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Child Nodes</em>' containment reference list.
     * @see org.eclipse.elk.graph.graph.ElkGraphPackage#getElkNode_ChildNodes()
     * @see org.eclipse.elk.graph.graph.ElkNode#getParentNode
     * @model opposite="parentNode" containment="true"
     * @generated
     */
    EList<ElkNode> getChildNodes();

    /**
     * Returns the value of the '<em><b>Parent Node</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.elk.graph.graph.ElkNode#getChildNodes <em>Child Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The node's parent node, if any. If the node has a parent, its location is interpreted relative to the parent node's origin. If it does not, the meaning of its location is not defined. A node without a parent node is called the <em>root node</em>.
     * 
     * <p>Setting the node's parent node automatically updates the parent node's list of child nodes.</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Parent Node</em>' container reference.
     * @see #setParentNode(ElkNode)
     * @see org.eclipse.elk.graph.graph.ElkGraphPackage#getElkNode_ParentNode()
     * @see org.eclipse.elk.graph.graph.ElkNode#getChildNodes
     * @model opposite="childNodes" transient="false"
     * @generated
     */
    ElkNode getParentNode();

    /**
     * Sets the value of the '{@link org.eclipse.elk.graph.graph.ElkNode#getParentNode <em>Parent Node</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Node</em>' container reference.
     * @see #getParentNode()
     * @generated
     */
    void setParentNode(ElkNode value);

    /**
     * Returns the value of the '<em><b>Contained Edges</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.elk.graph.graph.ElkEdge}.
     * It is bidirectional and its opposite is '{@link org.eclipse.elk.graph.graph.ElkEdge#getContainingNode <em>Containing Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The edges contained in this node. Note that containment does not imply connection: an edge contained in this list is not necessarily connected to this node. The coordinates of the edge's source points, target points, and end points are interpreted relative to this node's origin. See the documentation for {@link ElkEdge} for more details on which node an edge should be contained in.
     * 
     * <p>Adding or removing an edge to/from this list automatically sets its containing node.</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Contained Edges</em>' containment reference list.
     * @see org.eclipse.elk.graph.graph.ElkGraphPackage#getElkNode_ContainedEdges()
     * @see org.eclipse.elk.graph.graph.ElkEdge#getContainingNode
     * @model opposite="containingNode" containment="true"
     * @generated
     */
    EList<ElkEdge> getContainedEdges();

    /**
     * Returns the value of the '<em><b>Hierarchical</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Whether or not this node is considered to be a hierarchical node. It is a hierarchical node if its list of child nodes is not empty.
     * 
     * <p>The value of this attribute is computed dynamically and not persistent. So, no worries if you can't find it anywhere.</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hierarchical</em>' attribute.
     * @see org.eclipse.elk.graph.graph.ElkGraphPackage#getElkNode_Hierarchical()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    boolean isHierarchical();

} // ElkNode
