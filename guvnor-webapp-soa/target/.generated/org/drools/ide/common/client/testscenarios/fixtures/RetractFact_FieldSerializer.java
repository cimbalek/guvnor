package org.drools.ide.common.client.testscenarios.fixtures;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RetractFact_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getName(org.drools.ide.common.client.testscenarios.fixtures.RetractFact instance) /*-{
    return instance.@org.drools.ide.common.client.testscenarios.fixtures.RetractFact::name;
  }-*/;
  
  private static native void setName(org.drools.ide.common.client.testscenarios.fixtures.RetractFact instance, java.lang.String value) 
  /*-{
    instance.@org.drools.ide.common.client.testscenarios.fixtures.RetractFact::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.drools.ide.common.client.testscenarios.fixtures.RetractFact instance) throws SerializationException {
    setName(instance, streamReader.readString());
    
  }
  
  public static org.drools.ide.common.client.testscenarios.fixtures.RetractFact instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.drools.ide.common.client.testscenarios.fixtures.RetractFact();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.drools.ide.common.client.testscenarios.fixtures.RetractFact instance) throws SerializationException {
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.drools.ide.common.client.testscenarios.fixtures.RetractFact_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.drools.ide.common.client.testscenarios.fixtures.RetractFact_FieldSerializer.deserialize(reader, (org.drools.ide.common.client.testscenarios.fixtures.RetractFact)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.drools.ide.common.client.testscenarios.fixtures.RetractFact_FieldSerializer.serialize(writer, (org.drools.ide.common.client.testscenarios.fixtures.RetractFact)object);
  }
  
}