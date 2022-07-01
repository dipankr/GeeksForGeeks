package com.graph.dfs;

import java.util.*;

public class TreePrinter {
    /*
        expected output:

            lifeform
                animal
                    mammal
                        cat
                            lion
                    bird
                    fish
     */
    public static void printTree(List<RelationTP> rs){
        Map<String,List<String>> map = new HashMap<>();
        Set<String> children = new HashSet<>();
        String root="";

        //prepare map
        for (RelationTP relation : rs){
            children.add(relation.child);
            if(map.containsKey(relation.parent)){
                map.get(relation.parent).add(relation.child);
            } else{
                List<String> temp = new ArrayList<>();
                temp.add(relation.child);
                map.put(relation.parent,temp);
            }
        }

        //find root
        for(String parent : map.keySet()){
            if(!children.contains(parent)){
                root = parent;
                break;
            }
        }

        dfs(root,1,map);
    }

    public static void dfs(String root, int level, Map<String,List<String>> map){
        for(int i=0; i<level; i++)
            System.out.print("\t");
        System.out.println(root);

        List<String> childList;
        if(map.containsKey(root))
            childList = map.get(root);
        else return;

        for(String child : childList){
            dfs(child, level+1, map);
        }
    }

    public static void main(String[] args) {
        List<RelationTP> rs = new ArrayList<>();
        rs.add(new RelationTP("animal", "mammal"));
        rs.add(new RelationTP("animal", "bird"));
        rs.add(new RelationTP("lifeform", "animal"));
        rs.add(new RelationTP("cat", "lion"));
        rs.add(new RelationTP("mammal", "cat"));
        rs.add(new RelationTP("animal", "fish"));

        printTree(rs);
    }
}
