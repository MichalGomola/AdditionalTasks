package com.info.javabasics.collectionsT1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsT1
{
    public static void start()  {
        Developer dev1 = new Developer(1L, "Janusz", new ArrayList<>(List.of(Skill.JS, Skill.Java)));
        Developer dev2 = new Developer(2L, "Mikele", new ArrayList<>(List.of(Skill.Python, Skill.Java, Skill.SQL)));
        Developer dev3 = new Developer(3L, "Jan", new ArrayList<>(List.of(Skill.JS, Skill.SQL)));
        Developer dev4 = new Developer(4L, "Ukash", new ArrayList<>(List.of(Skill.Java)));
        Developer dev5 = new Developer(5L, "Anna", new ArrayList<>(List.of(Skill.Python)));

        List<Developer> devs = new ArrayList<>(List.of(dev1, dev2, dev3, dev4, dev5));

        Map<Skill, List<Long>> result = createSkillMap(devs);
        result.forEach((k,v) -> System.out.println(k +": " + v));
    }

    public static Map<Skill, List<Long>> createSkillMap (List<Developer> devs) {
        Map<Skill, List<Long>> result = new HashMap<>();

        for (Skill s : Skill.values()) {
            List<Long> devIds = devs.stream()
                    .filter(d -> d.getSkills().contains(s))
                    .map(Developer::getId)
                    .toList();
            result.put(s,devIds);
            }
        return result;
    }

}
