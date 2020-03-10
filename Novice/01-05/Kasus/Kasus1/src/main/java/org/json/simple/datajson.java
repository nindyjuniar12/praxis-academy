package org.json.simple;

import org.json.simple.*;

public class datajson {
    public static void main(String[] args) {
     JSONObject data = new JSONObject();
     
     data.put("nama", "Nindy Juniar Alpanita");
     data.put("nim", new Integer(1700016057));

     

    System.out.print(data);
    }
}