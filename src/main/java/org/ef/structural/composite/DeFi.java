package org.ef.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DeFi {
    private List<Section> sections = new ArrayList<>();

    public void addSection(Section section){
        sections.add(section);
    }

    public void removeSection(Section section){
        sections.remove(section);
    }

    public void startWorking(){
        System.out.println("DeFi started");
        for (Section section:sections) {
            section.startWorking();
        }
    }
}
