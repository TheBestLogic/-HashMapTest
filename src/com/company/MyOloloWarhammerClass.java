package com.company;
import com.company.Node;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyOloloWarhammerClass<Integer, String>  implements Map{
  ArrayList<Node>[] Array;
  final int DEFAULT_SIZE = 16;
  int ArraySize = DEFAULT_SIZE;

  public MyOloloWarhammerClass()
  {
    Array = new ArrayList[ArraySize];
    for (int i = 0; i < ArraySize; ++i)
      Array[i] = new ArrayList<Node>();
  }

  public void resize(int NewSize)
  {
    if( Array != null) {
      Node[] Nodes = new Node[NewSize];
      System.arraycopy(Array,0,Nodes,0, ArraySize);
      Array = null;
      System.arraycopy(Nodes,0,Array,0, ArraySize);
    }
    ArraySize = NewSize;
  }

  @Override
  public int size()
  {
    int Size = 0;
    for( int i = 0; i < ArraySize; ++i)
    {
      if(!Array[i].isEmpty())
        Size += Array[i].size();
    }
    return Size;
  }

  @Override
  public boolean isEmpty()
  {
    boolean EmptyFlag = true;
    for( int i = 0; i < ArraySize; ++i)
    {
      if(!Array[i].isEmpty()) {
        EmptyFlag = false;
        break;
      }
    }
    return EmptyFlag;
  }

  @Override
  public boolean containsKey(Object key) {
    return false;
  }

  @Override
  public boolean containsValue(Object value) {
    return false;
  }

  @Override
  public Object get(Object key) {
    int Index = Node.getIndex((java.lang.Integer)key,ArraySize);
    if ( Array[Index].isEmpty())
      return null;
    Node N = new Node();
    for( int i = 0; i < Array[Index].size(); ++i)
    {
      N = Array[Index].get(i);
      if( N.keyEquals((java.lang.Integer)key));
        return N;
    }
    return null;
  }

  @Override
  public Object put(Object key, Object value) {
    Node N = new Node((int)key, value.toString());
    int Index = N.getIndex(ArraySize);
    if (Array[Index]==null)
      Array[Index].add(N);
    else
    {
      Array[Index] = new ArrayList<Node>();
      Array[Index].add(N);
    }
    return null;
  }

  @Override
  public Object remove(Object key) {
    int Index = Node.getIndex((java.lang.Integer)key,ArraySize);
    if ( Array[Index].isEmpty())
      return null;
    Node N = new Node();
    for( int i = 0; i < Array[Index].size(); ++i)
    {
      N = Array[Index].get(i);
      if( N.keyEquals((java.lang.Integer)key));
      return Array[Index].remove(i);
    }
    return null;
  }

  @Override
  public void putAll(Map m) {
  }

  @Override
  public void clear() {
    Array = null;
    ArraySize = DEFAULT_SIZE;
  }

  @Override
  public Set keySet() {
    return null;
  }

  @Override
  public Collection values() {
    return null;
  }

  @Override
  public Set<Entry> entrySet() {
    return null;
  }


}
