package P3;

import java.awt.desktop.SystemEventListener;
import java.util.*;
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class FriendshipGraph {
    Map<Person, ArrayList<Person>> Graph = new HashMap<>();
    public static void main(String[] args) {
    FriendshipGraph graph = new FriendshipGraph();
    Person rachel = new Person("Rachel");
    Person ross = new Person("Ross");
    Person ben = new Person("Ben");
    Person kramer = new Person("Kramer");
    graph.addVertex(rachel);
    graph.addVertex(ross);
    graph.addVertex(ben);
    graph.addVertex(kramer);
    graph.addEdge(rachel,ross);
    graph.addEdge(ross,rachel);
    graph.addEdge(ross,ben);
    graph.addEdge(ben,ross);
    System.out.println(graph.getDistance(rachel,ross));
    System.out.println(graph.getDistance(rachel,ben));
    System.out.println(graph.getDistance(rachel,rachel));
    System.out.println(graph.getDistance(rachel,kramer));
    }
    public void addVertex(Person people){
        for(Person p : Graph.keySet()){
            if(p.getName().equals(people.getName())){
                System.out.println(people.getName() + " has already existed.");
                System.exit(0);
            }
        }
        ArrayList<Person> newArray = new ArrayList<>();
        Graph.put(people,newArray);
    }
    public void addEdge(Person p1,Person p2){
        if(Graph.containsKey(p1)){
            Graph.get(p1).add(p2);
        }
        else{
            System.out.println(p1.getName() + " does not exist.");
            System.exit(0);
        }
    }
    public int getDistance(Person p1,Person p2){
        Person temp = p1;
        Person aim = p1;
        int i = 0;
        int distance = 0;
        Queue<Person> queue = new LinkedList<>();
        ArrayList<Person> visited = new ArrayList<>();
        if(p1 == p2){
            return 0;
        }
        queue.add(temp);
        visited.add(temp);
        while (!queue.isEmpty()){
            temp = queue.poll();
            distance++;
            while (i<Graph.get(temp).size()){
                aim = Graph.get(temp).get(i);
                if(aim == p2){
                    return distance;
                }
                if(!visited.contains(aim)){
                    queue.add(aim);
                    visited.add(aim);
                }
                i++;
            }
            i=0;
        }
        return -1;
    }
}