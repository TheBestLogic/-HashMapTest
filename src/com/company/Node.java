package com.company;

public class Node{
    private String Data;
    int Hash;
    Integer Key;
    //Node NextNode;

    {
        Data = null;
        Hash = 0;
        Key = 0;
        //NextNode = null;
    }

    public Node()    {    }

    public Node(int _Key, String _Data)
    {
        Data = _Data;
        Key = _Key;
        hashCode();
    }

    public Node(Node _copyNode)
    {
        Data = _copyNode.Data;
        Hash = _copyNode.Hash;
        Key = _copyNode.Key;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node test = (Node) obj;
        return ( ( test.Key ^ Key | test.Hash ^ Hash ) == 0 ) ? true : false;
    }

    public boolean keyEquals(Integer _Key)
    {
        return ( ( Key ^ _Key ) == 0 ) ? true : false;
    }

    @Override
    public int hashCode()
    {
        return Hash = Key.hashCode();
    }//shoto soobrazit

    public int getIndex(int arraySize)
    {
        return ( Hash == 0 ) ? ( hashCode() & (arraySize-1)) : ( Hash & (arraySize-1));
    }

    public static int getIndex(Integer key,int arraySize)
    {
        return  key.hashCode() & (arraySize-1);
    }

    public int getHash()
    {
        return (Hash == 0) ? hashCode() : Hash;
    }





    public String getDataInStr()
    {
        String ResultString = new String("Key: " + Key + "; Hash: " + Hash + "; Data: <"
                + Data + ">;");
        return ResultString;
    }
}
