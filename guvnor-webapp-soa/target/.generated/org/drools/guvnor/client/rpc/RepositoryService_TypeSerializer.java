package org.drools.guvnor.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class RepositoryService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.allen_sauer.gwt.dnd.client.DragHandlerCollection/3996089253"] = [
        @com.allen_sauer.gwt.dnd.client.DragHandlerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.allen_sauer.gwt.dnd.client.DragHandlerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/allen_sauer/gwt/dnd/client/DragHandlerCollection;),
      ];
    
    result["com.google.gwt.i18n.client.impl.DateRecord/3220471373"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
      ];
    
    result["com.google.gwt.user.client.rpc.SerializationException/2836333220"] = [
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/SerializationException;),
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["com.google.gwt.user.client.ui.ChangeListenerCollection/287642957"] = [
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ChangeListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ClickListenerCollection/2152455986"] = [
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ClickListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.FocusListenerCollection/119490835"] = [
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FocusListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.FormHandlerCollection/3088681894"] = [
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FormHandlerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242"] = [
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/KeyboardListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.LoadListenerCollection/3174178888"] = [
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/LoadListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MouseListenerCollection/465158911"] = [
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552"] = [
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseWheelListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.PopupListenerCollection/1920131050"] = [
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/PopupListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ScrollListenerCollection/210686268"] = [
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ScrollListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TabListenerCollection/3768293299"] = [
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TabListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TableListenerCollection/2254740473"] = [
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TableListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TreeListenerCollection/3716243734"] = [
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TreeListenerCollection;),
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Float/1718559123"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Float;),
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ];
    
    result["java.sql.Date/730999118"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/1816797103"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/3040052672"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyMap/4174664486"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Map;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Map;)
      ];
    
    result["java.util.Collections$EmptySet/3523698179"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Date/3385151746"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ];
    
    result["java.util.HashMap/1797211028"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.HashSet/3273092938"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
      ];
    
    result["java.util.IdentityHashMap/1839153020"] = [
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ];
    
    result["java.util.LinkedHashMap/3008245022"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    result["java.util.LinkedHashSet/1826081506"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1346942793"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    result["org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection/2634479852"] = [
        @org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/cobogw/gwt/user/client/rpc/AsyncCallbackCollection;),
        @org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/cobogw/gwt/user/client/rpc/AsyncCallbackCollection;)
      ];
    
    result["org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter/3755041370"] = [
        @org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/asseteditor/drools/modeldriven/SetFactTypeFilter;),
      ];
    
    result["org.drools.guvnor.client.rpc.AssetPageRequest/4043140489"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.AssetPageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/AssetPageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.BuilderResultLine/2861242005"] = [
        @org.drools.guvnor.client.rpc.BuilderResultLine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.BuilderResultLine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/BuilderResultLine;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.BuilderResultLine;/2572161422"] = [
        @org.drools.guvnor.client.rpc.BuilderResultLine_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.BuilderResultLine_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/BuilderResultLine;),
      ];
    
    result["org.drools.guvnor.client.rpc.CategoryPageRequest/1553084883"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.CategoryPageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/CategoryPageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.DetailedSerializationException/4010081135"] = [
        @org.drools.guvnor.client.rpc.DetailedSerializationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.DetailedSerializationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/DetailedSerializationException;),
      ];
    
    result["org.drools.guvnor.client.rpc.InboxIncomingPageRow/1678049514"] = [
        @org.drools.guvnor.client.rpc.InboxIncomingPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxIncomingPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/InboxIncomingPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.InboxIncomingPageRow;/2215392433"] = [
        @org.drools.guvnor.client.rpc.InboxIncomingPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxIncomingPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/InboxIncomingPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.InboxPageRequest/2902001826"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.InboxPageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/InboxPageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.InboxPageRow/2762426230"] = [
        @org.drools.guvnor.client.rpc.InboxPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/InboxPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.InboxPageRow;/2644115897"] = [
        @org.drools.guvnor.client.rpc.InboxPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.InboxPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/InboxPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.LogEntry/752151946"] = [
        @org.drools.guvnor.client.rpc.LogEntry_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.LogEntry_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/LogEntry;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.LogEntry;/722373083"] = [
        @org.drools.guvnor.client.rpc.LogEntry_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.LogEntry_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/LogEntry;),
      ];
    
    result["org.drools.guvnor.client.rpc.LogPageRow/1286904464"] = [
        @org.drools.guvnor.client.rpc.LogPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.LogPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/LogPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.LogPageRow;/3205332377"] = [
        @org.drools.guvnor.client.rpc.LogPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.LogPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/LogPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.MetaDataQuery/3433133509"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.MetaDataQuery_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/MetaDataQuery;)
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.MetaDataQuery;/2168760287"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.MetaDataQuery_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/guvnor/client/rpc/MetaDataQuery;)
      ];
    
    result["org.drools.guvnor.client.rpc.NewAssetConfiguration/2985301202"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.NewAssetConfiguration_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/NewAssetConfiguration;)
      ];
    
    result["org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration/4274860629"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/NewGuidedDecisionTableAssetConfiguration;)
      ];
    
    result["org.drools.guvnor.client.rpc.PageRequest/2522979705"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.PageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/PageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.PageResponse/1139529059"] = [
        @org.drools.guvnor.client.rpc.PageResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PageResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/PageResponse;),
      ];
    
    result["org.drools.guvnor.client.rpc.PermissionsPageRow/1300018583"] = [
        @org.drools.guvnor.client.rpc.PermissionsPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PermissionsPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/PermissionsPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.PermissionsPageRow;/3744666246"] = [
        @org.drools.guvnor.client.rpc.PermissionsPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PermissionsPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/PermissionsPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.PushResponse/3692768440"] = [
        @org.drools.guvnor.client.rpc.PushResponse_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PushResponse_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/PushResponse;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.PushResponse;/3951149406"] = [
        @org.drools.guvnor.client.rpc.PushResponse_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.PushResponse_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/PushResponse;),
      ];
    
    result["org.drools.guvnor.client.rpc.QueryMetadataPageRequest/1696980185"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.QueryMetadataPageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/QueryMetadataPageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.QueryPageRequest/2463488132"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.QueryPageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/QueryPageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.QueryPageRow/1680853655"] = [
        @org.drools.guvnor.client.rpc.QueryPageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.QueryPageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/QueryPageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.QueryPageRow;/3556272876"] = [
        @org.drools.guvnor.client.rpc.QueryPageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.QueryPageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/QueryPageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.SessionExpiredException/3663857784"] = [
        @org.drools.guvnor.client.rpc.SessionExpiredException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.SessionExpiredException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/SessionExpiredException;),
      ];
    
    result["org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest/4008526572"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/SnapshotComparisonPageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.StatePageRequest/1905711895"] = [
        ,
        ,
        @org.drools.guvnor.client.rpc.StatePageRequest_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/guvnor/client/rpc/StatePageRequest;)
      ];
    
    result["org.drools.guvnor.client.rpc.StatePageRow/443879953"] = [
        @org.drools.guvnor.client.rpc.StatePageRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.StatePageRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/StatePageRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.StatePageRow;/3324871288"] = [
        @org.drools.guvnor.client.rpc.StatePageRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.StatePageRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/StatePageRow;),
      ];
    
    result["org.drools.guvnor.client.rpc.TableConfig/4030672863"] = [
        @org.drools.guvnor.client.rpc.TableConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.TableConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/TableConfig;),
      ];
    
    result["org.drools.guvnor.client.rpc.TableDataResult/2516166606"] = [
        @org.drools.guvnor.client.rpc.TableDataResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.TableDataResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/TableDataResult;),
      ];
    
    result["org.drools.guvnor.client.rpc.TableDataRow/4008720411"] = [
        @org.drools.guvnor.client.rpc.TableDataRow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.TableDataRow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/guvnor/client/rpc/TableDataRow;),
      ];
    
    result["[Lorg.drools.guvnor.client.rpc.TableDataRow;/2256388940"] = [
        @org.drools.guvnor.client.rpc.TableDataRow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.guvnor.client.rpc.TableDataRow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/guvnor/client/rpc/TableDataRow;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators/2589162898"] = [
        @org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/FieldAccessorsAndMutators;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.MethodInfo/4228331741"] = [
        @org.drools.ide.common.client.modeldriven.MethodInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.MethodInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/MethodInfo;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.MethodInfo;/3407967845"] = [
        @org.drools.ide.common.client.modeldriven.MethodInfo_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.MethodInfo_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/MethodInfo;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.ModelAnnotation/624741904"] = [
        @org.drools.ide.common.client.modeldriven.ModelAnnotation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelAnnotation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/ModelAnnotation;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.ModelAnnotation;/3279465490"] = [
        @org.drools.ide.common.client.modeldriven.ModelAnnotation_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelAnnotation_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/ModelAnnotation;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.ModelField/2776426316"] = [
        @org.drools.ide.common.client.modeldriven.ModelField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/ModelField;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.ModelField$FIELD_CLASS_TYPE/3347163077"] = [
        @org.drools.ide.common.client.modeldriven.ModelField_FIELD_CLASS_TYPE_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelField_FIELD_CLASS_TYPE_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/ModelField$FIELD_CLASS_TYPE;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.ModelField;/3748451191"] = [
        @org.drools.ide.common.client.modeldriven.ModelField_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.ModelField_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/ModelField;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine/1850545750"] = [
        @org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/SuggestionCompletionEngine;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue/238626618"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/DSLComplexVariableValue;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue;/1005836454"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/DSLComplexVariableValue;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.DSLSentence/913758188"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLSentence_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLSentence_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/DSLSentence;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.DSLSentence;/3420683153"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLSentence_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLSentence_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/DSLSentence;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.brl.DSLVariableValue/3073113996"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLVariableValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLVariableValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/modeldriven/brl/DSLVariableValue;),
      ];
    
    result["[Lorg.drools.ide.common.client.modeldriven.brl.DSLVariableValue;/3004588284"] = [
        @org.drools.ide.common.client.modeldriven.brl.DSLVariableValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.modeldriven.brl.DSLVariableValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/modeldriven/brl/DSLVariableValue;),
      ];
    
    result["org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52$TableFormat/3104819584"] = [
        ,
        ,
        @org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52_TableFormat_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/modeldriven/dt52/GuidedDecisionTable52$TableFormat;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.ActivateRuleFlowGroup/2507298645"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.ActivateRuleFlowGroup_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.ActivateRuleFlowGroup_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/ActivateRuleFlowGroup;),
        @org.drools.ide.common.client.testscenarios.fixtures.ActivateRuleFlowGroup_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/ActivateRuleFlowGroup;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue/550146034"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/CallFieldValue;),
        @org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/CallFieldValue;)
      ];
    
    result["[Lorg.drools.ide.common.client.testscenarios.fixtures.CallFieldValue;/2189789725"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/testscenarios/fixtures/CallFieldValue;),
        @org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/testscenarios/fixtures/CallFieldValue;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.CallFixtureMap/3052114213"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.CallFixtureMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.CallFixtureMap_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/CallFixtureMap;),
        @org.drools.ide.common.client.testscenarios.fixtures.CallFixtureMap_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/CallFixtureMap;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.CallMethod/1712402702"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.CallMethod_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.CallMethod_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/CallMethod;),
        @org.drools.ide.common.client.testscenarios.fixtures.CallMethod_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/CallMethod;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.ExecutionTrace/1697437728"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.ExecutionTrace_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.ExecutionTrace_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/ExecutionTrace;),
        @org.drools.ide.common.client.testscenarios.fixtures.ExecutionTrace_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/ExecutionTrace;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.FactData/2977661513"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.FactData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.FactData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/FactData;),
        @org.drools.ide.common.client.testscenarios.fixtures.FactData_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/FactData;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.FieldData/2269445935"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.FieldData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.FieldData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/FieldData;),
        @org.drools.ide.common.client.testscenarios.fixtures.FieldData_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/FieldData;)
      ];
    
    result["[Lorg.drools.ide.common.client.testscenarios.fixtures.FieldData;/3709816782"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.FieldData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.FieldData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/testscenarios/fixtures/FieldData;),
        @org.drools.ide.common.client.testscenarios.fixtures.FieldData_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/testscenarios/fixtures/FieldData;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.FixtureList/505580729"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.FixtureList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.FixtureList_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/FixtureList;),
        @org.drools.ide.common.client.testscenarios.fixtures.FixtureList_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/FixtureList;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.FixturesMap/1586537853"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.FixturesMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.FixturesMap_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/FixturesMap;),
        @org.drools.ide.common.client.testscenarios.fixtures.FixturesMap_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/FixturesMap;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.RetractFact/1880147980"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.RetractFact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.RetractFact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/RetractFact;),
        @org.drools.ide.common.client.testscenarios.fixtures.RetractFact_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/RetractFact;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.VerifyFact/278467074"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyFact_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyFact_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/VerifyFact;),
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyFact_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/VerifyFact;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.VerifyField/223692508"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyField_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyField_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/VerifyField;),
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyField_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/VerifyField;)
      ];
    
    result["[Lorg.drools.ide.common.client.testscenarios.fixtures.VerifyField;/2085596889"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyField_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyField_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/drools/ide/common/client/testscenarios/fixtures/VerifyField;),
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyField_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/drools/ide/common/client/testscenarios/fixtures/VerifyField;)
      ];
    
    result["org.drools.ide.common.client.testscenarios.fixtures.VerifyRuleFired/3286703388"] = [
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyRuleFired_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyRuleFired_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/client/testscenarios/fixtures/VerifyRuleFired;),
        @org.drools.ide.common.client.testscenarios.fixtures.VerifyRuleFired_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/drools/ide/common/client/testscenarios/fixtures/VerifyRuleFired;)
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition/58438741"] = [
        @org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableBooleanParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition/1191121563"] = [
        @org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableEnumParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition/347556554"] = [
        @org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableFloatParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition/2741030255"] = [
        @org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableIntegerParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableListParameterDefinition/1910870545"] = [
        @org.drools.ide.common.shared.workitems.PortableListParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableListParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableListParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition/2506839583"] = [
        @org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableObjectParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableStringParameterDefinition/2272465890"] = [
        @org.drools.ide.common.shared.workitems.PortableStringParameterDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableStringParameterDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableStringParameterDefinition;),
      ];
    
    result["org.drools.ide.common.shared.workitems.PortableWorkDefinition/1592110834"] = [
        @org.drools.ide.common.shared.workitems.PortableWorkDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.drools.ide.common.shared.workitems.PortableWorkDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/drools/ide/common/shared/workitems/PortableWorkDefinition;),
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.allen_sauer.gwt.dnd.client.DragHandlerCollection::class)] = "com.allen_sauer.gwt.dnd.client.DragHandlerCollection/3996089253";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/3220471373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializationException::class)] = "com.google.gwt.user.client.rpc.SerializationException/2836333220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ChangeListenerCollection::class)] = "com.google.gwt.user.client.ui.ChangeListenerCollection/287642957";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ClickListenerCollection::class)] = "com.google.gwt.user.client.ui.ClickListenerCollection/2152455986";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FocusListenerCollection::class)] = "com.google.gwt.user.client.ui.FocusListenerCollection/119490835";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FormHandlerCollection::class)] = "com.google.gwt.user.client.ui.FormHandlerCollection/3088681894";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.KeyboardListenerCollection::class)] = "com.google.gwt.user.client.ui.KeyboardListenerCollection/1040442242";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.LoadListenerCollection::class)] = "com.google.gwt.user.client.ui.LoadListenerCollection/3174178888";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseListenerCollection/465158911";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseWheelListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseWheelListenerCollection/370304552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.PopupListenerCollection::class)] = "com.google.gwt.user.client.ui.PopupListenerCollection/1920131050";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ScrollListenerCollection::class)] = "com.google.gwt.user.client.ui.ScrollListenerCollection/210686268";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TabListenerCollection::class)] = "com.google.gwt.user.client.ui.TabListenerCollection/3768293299";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TableListenerCollection::class)] = "com.google.gwt.user.client.ui.TableListenerCollection/2254740473";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TreeListenerCollection::class)] = "com.google.gwt.user.client.ui.TreeListenerCollection/3716243734";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float::class)] = "java.lang.Float/1718559123";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/730999118";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/1816797103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/3040052672";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyMap::class)] = "java.util.Collections$EmptyMap/4174664486";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptySet::class)] = "java.util.Collections$EmptySet/3523698179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/3385151746";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/1797211028";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/3273092938";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/1839153020";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/3008245022";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/1826081506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/4043497002";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection::class)] = "org.cobogw.gwt.user.client.rpc.AsyncCallbackCollection/2634479852";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter::class)] = "org.drools.guvnor.client.asseteditor.drools.modeldriven.SetFactTypeFilter/3755041370";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.AssetPageRequest::class)] = "org.drools.guvnor.client.rpc.AssetPageRequest/4043140489";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.BuilderResultLine::class)] = "org.drools.guvnor.client.rpc.BuilderResultLine/2861242005";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.BuilderResultLine[]::class)] = "[Lorg.drools.guvnor.client.rpc.BuilderResultLine;/2572161422";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.CategoryPageRequest::class)] = "org.drools.guvnor.client.rpc.CategoryPageRequest/1553084883";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.DetailedSerializationException::class)] = "org.drools.guvnor.client.rpc.DetailedSerializationException/4010081135";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxIncomingPageRow::class)] = "org.drools.guvnor.client.rpc.InboxIncomingPageRow/1678049514";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxIncomingPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.InboxIncomingPageRow;/2215392433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxPageRequest::class)] = "org.drools.guvnor.client.rpc.InboxPageRequest/2902001826";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxPageRow::class)] = "org.drools.guvnor.client.rpc.InboxPageRow/2762426230";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.InboxPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.InboxPageRow;/2644115897";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.LogEntry::class)] = "org.drools.guvnor.client.rpc.LogEntry/752151946";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.LogEntry[]::class)] = "[Lorg.drools.guvnor.client.rpc.LogEntry;/722373083";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.LogPageRow::class)] = "org.drools.guvnor.client.rpc.LogPageRow/1286904464";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.LogPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.LogPageRow;/3205332377";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.MetaDataQuery::class)] = "org.drools.guvnor.client.rpc.MetaDataQuery/3433133509";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.MetaDataQuery[]::class)] = "[Lorg.drools.guvnor.client.rpc.MetaDataQuery;/2168760287";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.NewAssetConfiguration::class)] = "org.drools.guvnor.client.rpc.NewAssetConfiguration/2985301202";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration::class)] = "org.drools.guvnor.client.rpc.NewGuidedDecisionTableAssetConfiguration/4274860629";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PageRequest::class)] = "org.drools.guvnor.client.rpc.PageRequest/2522979705";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PageResponse::class)] = "org.drools.guvnor.client.rpc.PageResponse/1139529059";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PermissionsPageRow::class)] = "org.drools.guvnor.client.rpc.PermissionsPageRow/1300018583";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PermissionsPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.PermissionsPageRow;/3744666246";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PushResponse::class)] = "org.drools.guvnor.client.rpc.PushResponse/3692768440";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.PushResponse[]::class)] = "[Lorg.drools.guvnor.client.rpc.PushResponse;/3951149406";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.QueryMetadataPageRequest::class)] = "org.drools.guvnor.client.rpc.QueryMetadataPageRequest/1696980185";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.QueryPageRequest::class)] = "org.drools.guvnor.client.rpc.QueryPageRequest/2463488132";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.QueryPageRow::class)] = "org.drools.guvnor.client.rpc.QueryPageRow/1680853655";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.QueryPageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.QueryPageRow;/3556272876";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SessionExpiredException::class)] = "org.drools.guvnor.client.rpc.SessionExpiredException/3663857784";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest::class)] = "org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest/4008526572";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.StatePageRequest::class)] = "org.drools.guvnor.client.rpc.StatePageRequest/1905711895";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.StatePageRow::class)] = "org.drools.guvnor.client.rpc.StatePageRow/443879953";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.StatePageRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.StatePageRow;/3324871288";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.TableConfig::class)] = "org.drools.guvnor.client.rpc.TableConfig/4030672863";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.TableDataResult::class)] = "org.drools.guvnor.client.rpc.TableDataResult/2516166606";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.TableDataRow::class)] = "org.drools.guvnor.client.rpc.TableDataRow/4008720411";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.guvnor.client.rpc.TableDataRow[]::class)] = "[Lorg.drools.guvnor.client.rpc.TableDataRow;/2256388940";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators::class)] = "org.drools.ide.common.client.modeldriven.FieldAccessorsAndMutators/2589162898";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.MethodInfo::class)] = "org.drools.ide.common.client.modeldriven.MethodInfo/4228331741";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.MethodInfo[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.MethodInfo;/3407967845";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelAnnotation::class)] = "org.drools.ide.common.client.modeldriven.ModelAnnotation/624741904";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelAnnotation[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.ModelAnnotation;/3279465490";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelField::class)] = "org.drools.ide.common.client.modeldriven.ModelField/2776426316";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelField.FIELD_CLASS_TYPE::class)] = "org.drools.ide.common.client.modeldriven.ModelField$FIELD_CLASS_TYPE/3347163077";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.ModelField[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.ModelField;/3748451191";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine::class)] = "org.drools.ide.common.client.modeldriven.SuggestionCompletionEngine/1850545750";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue::class)] = "org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue/238626618";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.DSLComplexVariableValue;/1005836454";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLSentence::class)] = "org.drools.ide.common.client.modeldriven.brl.DSLSentence/913758188";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLSentence[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.DSLSentence;/3420683153";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLVariableValue::class)] = "org.drools.ide.common.client.modeldriven.brl.DSLVariableValue/3073113996";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.brl.DSLVariableValue[]::class)] = "[Lorg.drools.ide.common.client.modeldriven.brl.DSLVariableValue;/3004588284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52.TableFormat::class)] = "org.drools.ide.common.client.modeldriven.dt52.GuidedDecisionTable52$TableFormat/3104819584";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.ActivateRuleFlowGroup::class)] = "org.drools.ide.common.client.testscenarios.fixtures.ActivateRuleFlowGroup/2507298645";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue::class)] = "org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue/550146034";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.CallFieldValue[]::class)] = "[Lorg.drools.ide.common.client.testscenarios.fixtures.CallFieldValue;/2189789725";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.CallFixtureMap::class)] = "org.drools.ide.common.client.testscenarios.fixtures.CallFixtureMap/3052114213";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.CallMethod::class)] = "org.drools.ide.common.client.testscenarios.fixtures.CallMethod/1712402702";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.ExecutionTrace::class)] = "org.drools.ide.common.client.testscenarios.fixtures.ExecutionTrace/1697437728";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.FactData::class)] = "org.drools.ide.common.client.testscenarios.fixtures.FactData/2977661513";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.FieldData::class)] = "org.drools.ide.common.client.testscenarios.fixtures.FieldData/2269445935";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.FieldData[]::class)] = "[Lorg.drools.ide.common.client.testscenarios.fixtures.FieldData;/3709816782";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.FixtureList::class)] = "org.drools.ide.common.client.testscenarios.fixtures.FixtureList/505580729";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.FixturesMap::class)] = "org.drools.ide.common.client.testscenarios.fixtures.FixturesMap/1586537853";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.RetractFact::class)] = "org.drools.ide.common.client.testscenarios.fixtures.RetractFact/1880147980";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.VerifyFact::class)] = "org.drools.ide.common.client.testscenarios.fixtures.VerifyFact/278467074";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.VerifyField::class)] = "org.drools.ide.common.client.testscenarios.fixtures.VerifyField/223692508";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.VerifyField[]::class)] = "[Lorg.drools.ide.common.client.testscenarios.fixtures.VerifyField;/2085596889";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.client.testscenarios.fixtures.VerifyRuleFired::class)] = "org.drools.ide.common.client.testscenarios.fixtures.VerifyRuleFired/3286703388";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableBooleanParameterDefinition/58438741";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableEnumParameterDefinition/1191121563";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableFloatParameterDefinition/347556554";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableIntegerParameterDefinition/2741030255";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableListParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableListParameterDefinition/1910870545";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableObjectParameterDefinition/2506839583";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableStringParameterDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableStringParameterDefinition/2272465890";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.drools.ide.common.shared.workitems.PortableWorkDefinition::class)] = "org.drools.ide.common.shared.workitems.PortableWorkDefinition/1592110834";
    return result;
  }-*/;
  
  public RepositoryService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}