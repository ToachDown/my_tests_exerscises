package com.Testing;

import java.util.ArrayList;
import java.util.List;

public class button {
    private List<art> list = new ArrayList<art>();
    public void add(art art){
        list.add(art);
    }

    public void onClick(){
        System.out.println("кнопка нажата");
        for(art item : list){
            item.onArt();
        }
    }
}
