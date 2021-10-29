package com.company;

public class MyLinkedList<T> {
    class Node<T> {
        private T curr;
        private Node<T> next;

        public Node()
        {
            curr = null;
            next = null;
        }

        public Node(T val) {
            curr = val;
            next = null;
        }

        private boolean hasNext()
        {
            return ( next == null ) ? false : true;
        }

        private void setNext(T val)
        {
            if ( hasNext() )
            {
                next.setNext(val);
            }
            else
            {
                next = new Node<T>(val);
            }
        }

        public void add(T val)
        {
            if( curr == null )
            {
                curr = val;
                return;
            }
            if ( hasNext() )
            {
                next.setNext(val);
            }
            else
            {
                next = new Node<T>(val);
            }
        }

        private T getLast()
        {
            if( curr == null )
            {
                return curr;
            }
            if( !hasNext() )
            {
                return curr;
            }
            return next.getLast();

        }
    }
    private Node<T> Value;

    public MyLinkedList()
    {
        Value = new Node<T>();
    }

    public void add(T _newObj)
    {
        Value.add(_newObj);
    }

    public T getLast()
    {
        return Value.getLast();
    }

}
