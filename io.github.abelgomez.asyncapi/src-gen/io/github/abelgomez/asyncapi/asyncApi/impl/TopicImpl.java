/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractMessage;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Topic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.TopicImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.TopicImpl#getPublish <em>Publish</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.TopicImpl#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends MinimalEObjectImpl.Container implements Topic
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPublish() <em>Publish</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublish()
   * @generated
   * @ordered
   */
  protected AbstractMessage publish;

  /**
   * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubscribe()
   * @generated
   * @ordered
   */
  protected AbstractMessage subscribe;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopicImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsyncApiPackage.Literals.TOPIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.TOPIC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractMessage getPublish()
  {
    return publish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPublish(AbstractMessage newPublish, NotificationChain msgs)
  {
    AbstractMessage oldPublish = publish;
    publish = newPublish;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.TOPIC__PUBLISH, oldPublish, newPublish);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPublish(AbstractMessage newPublish)
  {
    if (newPublish != publish)
    {
      NotificationChain msgs = null;
      if (publish != null)
        msgs = ((InternalEObject)publish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.TOPIC__PUBLISH, null, msgs);
      if (newPublish != null)
        msgs = ((InternalEObject)newPublish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.TOPIC__PUBLISH, null, msgs);
      msgs = basicSetPublish(newPublish, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.TOPIC__PUBLISH, newPublish, newPublish));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractMessage getSubscribe()
  {
    return subscribe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubscribe(AbstractMessage newSubscribe, NotificationChain msgs)
  {
    AbstractMessage oldSubscribe = subscribe;
    subscribe = newSubscribe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.TOPIC__SUBSCRIBE, oldSubscribe, newSubscribe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSubscribe(AbstractMessage newSubscribe)
  {
    if (newSubscribe != subscribe)
    {
      NotificationChain msgs = null;
      if (subscribe != null)
        msgs = ((InternalEObject)subscribe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.TOPIC__SUBSCRIBE, null, msgs);
      if (newSubscribe != null)
        msgs = ((InternalEObject)newSubscribe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.TOPIC__SUBSCRIBE, null, msgs);
      msgs = basicSetSubscribe(newSubscribe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.TOPIC__SUBSCRIBE, newSubscribe, newSubscribe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsyncApiPackage.TOPIC__PUBLISH:
        return basicSetPublish(null, msgs);
      case AsyncApiPackage.TOPIC__SUBSCRIBE:
        return basicSetSubscribe(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsyncApiPackage.TOPIC__NAME:
        return getName();
      case AsyncApiPackage.TOPIC__PUBLISH:
        return getPublish();
      case AsyncApiPackage.TOPIC__SUBSCRIBE:
        return getSubscribe();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsyncApiPackage.TOPIC__NAME:
        setName((String)newValue);
        return;
      case AsyncApiPackage.TOPIC__PUBLISH:
        setPublish((AbstractMessage)newValue);
        return;
      case AsyncApiPackage.TOPIC__SUBSCRIBE:
        setSubscribe((AbstractMessage)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.TOPIC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AsyncApiPackage.TOPIC__PUBLISH:
        setPublish((AbstractMessage)null);
        return;
      case AsyncApiPackage.TOPIC__SUBSCRIBE:
        setSubscribe((AbstractMessage)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.TOPIC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AsyncApiPackage.TOPIC__PUBLISH:
        return publish != null;
      case AsyncApiPackage.TOPIC__SUBSCRIBE:
        return subscribe != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TopicImpl
