package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Принт");
        MyOloloWarhammerClass My = new MyOloloWarhammerClass<Integer, String>();
        System.out.println(My.isEmpty());
        My.put(5, "str");
        My.put(521, "str2");
        My.put(51, "str3");
        My.put(2, "str4");
        My.put(14, "str5");
        System.out.println(My.size());
        Node n = new Node((Node)My.get(5));
        System.out.println(n.getDataInStr());
         n = (Node)My.get(521);
        System.out.println(n.getDataInStr());
         n = (Node)My.get(51);
        System.out.println(n.getDataInStr());
         n = (Node)My.get(2);
        System.out.println(n.getDataInStr());
         n = (Node)My.get(14);
        System.out.println(n.getDataInStr());
    }
}
