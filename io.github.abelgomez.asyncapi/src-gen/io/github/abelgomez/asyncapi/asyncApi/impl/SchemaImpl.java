/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema;
import io.github.abelgomez.asyncapi.asyncApi.Schema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getFriendlyName <em>Friendly Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends AbstractSchemaImpl implements Schema
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected String default_ = DEFAULT_EDEFAULT;

  /**
   * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPayload()
   * @generated
   * @ordered
   */
  protected AbstractSchema payload;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<NamedSchema> properties;

  /**
   * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum()
   * @generated
   * @ordered
   */
  protected EList<String> enum_;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected AbstractSchema items;

  /**
   * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired()
   * @generated
   * @ordered
   */
  protected EList<String> required;

  /**
   * The default value of the '{@link #getFriendlyName() <em>Friendly Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFriendlyName()
   * @generated
   * @ordered
   */
  protected static final String FRIENDLY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFriendlyName() <em>Friendly Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFriendlyName()
   * @generated
   * @ordered
   */
  protected String friendlyName = FRIENDLY_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaImpl()
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
    return AsyncApiPackage.Literals.SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefault(String newDefault)
  {
    String oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__DEFAULT, oldDefault, default_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractSchema getPayload()
  {
    return payload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPayload(AbstractSchema newPayload, NotificationChain msgs)
  {
    AbstractSchema oldPayload = payload;
    payload = newPayload;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__PAYLOAD, oldPayload, newPayload);
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
  public void setPayload(AbstractSchema newPayload)
  {
    if (newPayload != payload)
    {
      NotificationChain msgs = null;
      if (payload != null)
        msgs = ((InternalEObject)payload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.SCHEMA__PAYLOAD, null, msgs);
      if (newPayload != null)
        msgs = ((InternalEObject)newPayload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.SCHEMA__PAYLOAD, null, msgs);
      msgs = basicSetPayload(newPayload, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__PAYLOAD, newPayload, newPayload));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedSchema> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<NamedSchema>(NamedSchema.class, this, AsyncApiPackage.SCHEMA__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getEnum()
  {
    if (enum_ == null)
    {
      enum_ = new EDataTypeEList<String>(String.class, this, AsyncApiPackage.SCHEMA__ENUM);
    }
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractSchema getItems()
  {
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItems(AbstractSchema newItems, NotificationChain msgs)
  {
    AbstractSchema oldItems = items;
    items = newItems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__ITEMS, oldItems, newItems);
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
  public void setItems(AbstractSchema newItems)
  {
    if (newItems != items)
    {
      NotificationChain msgs = null;
      if (items != null)
        msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.SCHEMA__ITEMS, null, msgs);
      if (newItems != null)
        msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.SCHEMA__ITEMS, null, msgs);
      msgs = basicSetItems(newItems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__ITEMS, newItems, newItems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getRequired()
  {
    if (required == null)
    {
      required = new EDataTypeEList<String>(String.class, this, AsyncApiPackage.SCHEMA__REQUIRED);
    }
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFriendlyName()
  {
    return friendlyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFriendlyName(String newFriendlyName)
  {
    String oldFriendlyName = friendlyName;
    friendlyName = newFriendlyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__FRIENDLY_NAME, oldFriendlyName, friendlyName));
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
      case AsyncApiPackage.SCHEMA__PAYLOAD:
        return basicSetPayload(null, msgs);
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case AsyncApiPackage.SCHEMA__ITEMS:
        return basicSetItems(null, msgs);
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
      case AsyncApiPackage.SCHEMA__TITLE:
        return getTitle();
      case AsyncApiPackage.SCHEMA__TYPE:
        return getType();
      case AsyncApiPackage.SCHEMA__DESCRIPTION:
        return getDescription();
      case AsyncApiPackage.SCHEMA__FORMAT:
        return getFormat();
      case AsyncApiPackage.SCHEMA__DEFAULT:
        return getDefault();
      case AsyncApiPackage.SCHEMA__PAYLOAD:
        return getPayload();
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        return getProperties();
      case AsyncApiPackage.SCHEMA__ENUM:
        return getEnum();
      case AsyncApiPackage.SCHEMA__ITEMS:
        return getItems();
      case AsyncApiPackage.SCHEMA__REQUIRED:
        return getRequired();
      case AsyncApiPackage.SCHEMA__FRIENDLY_NAME:
        return getFriendlyName();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsyncApiPackage.SCHEMA__TITLE:
        setTitle((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__TYPE:
        setType((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__FORMAT:
        setFormat((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__DEFAULT:
        setDefault((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__PAYLOAD:
        setPayload((AbstractSchema)newValue);
        return;
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends NamedSchema>)newValue);
        return;
      case AsyncApiPackage.SCHEMA__ENUM:
        getEnum().clear();
        getEnum().addAll((Collection<? extends String>)newValue);
        return;
      case AsyncApiPackage.SCHEMA__ITEMS:
        setItems((AbstractSchema)newValue);
        return;
      case AsyncApiPackage.SCHEMA__REQUIRED:
        getRequired().clear();
        getRequired().addAll((Collection<? extends String>)newValue);
        return;
      case AsyncApiPackage.SCHEMA__FRIENDLY_NAME:
        setFriendlyName((String)newValue);
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
      case AsyncApiPackage.SCHEMA__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__PAYLOAD:
        setPayload((AbstractSchema)null);
        return;
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        getProperties().clear();
        return;
      case AsyncApiPackage.SCHEMA__ENUM:
        getEnum().clear();
        return;
      case AsyncApiPackage.SCHEMA__ITEMS:
        setItems((AbstractSchema)null);
        return;
      case AsyncApiPackage.SCHEMA__REQUIRED:
        getRequired().clear();
        return;
      case AsyncApiPackage.SCHEMA__FRIENDLY_NAME:
        setFriendlyName(FRIENDLY_NAME_EDEFAULT);
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
      case AsyncApiPackage.SCHEMA__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AsyncApiPackage.SCHEMA__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case AsyncApiPackage.SCHEMA__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AsyncApiPackage.SCHEMA__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case AsyncApiPackage.SCHEMA__DEFAULT:
        return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
      case AsyncApiPackage.SCHEMA__PAYLOAD:
        return payload != null;
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case AsyncApiPackage.SCHEMA__ENUM:
        return enum_ != null && !enum_.isEmpty();
      case AsyncApiPackage.SCHEMA__ITEMS:
        return items != null;
      case AsyncApiPackage.SCHEMA__REQUIRED:
        return required != null && !required.isEmpty();
      case AsyncApiPackage.SCHEMA__FRIENDLY_NAME:
        return FRIENDLY_NAME_EDEFAULT == null ? friendlyName != null : !FRIENDLY_NAME_EDEFAULT.equals(friendlyName);
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
    result.append(" (title: ");
    result.append(title);
    result.append(", type: ");
    result.append(type);
    result.append(", description: ");
    result.append(description);
    result.append(", format: ");
    result.append(format);
    result.append(", default: ");
    result.append(default_);
    result.append(", enum: ");
    result.append(enum_);
    result.append(", required: ");
    result.append(required);
    result.append(", friendlyName: ");
    result.append(friendlyName);
    result.append(')');
    return result.toString();
  }

} //SchemaImpl
