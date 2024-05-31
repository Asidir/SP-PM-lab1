package P3;

import org.junit.Assert;
import org.junit.Test;
public class FriendshipGraphTest {

    @Test
    public void getDistanceTest() {
        FriendshipGraph graph = new FriendshipGraph();
        Person p1 = new Person("p1");
        Person p2 = new Person("p2");
        Person p3 = new Person("p3");
        Person p4 = new Person("p4");
        graph.addVertex(p1);
        graph.addVertex(p2);
        graph.addVertex(p3);
        graph.addVertex(p4);
        graph.addEdge(p1,p2);
        graph.addEdge(p2,p1);
        graph.addEdge(p2,p3);
        graph.addEdge(p3,p2);
        Assert.assertEquals(0,graph.getDistance(p1,p1));
        Assert.assertEquals(1,graph.getDistance(p1,p2));
        Assert.assertEquals(2,graph.getDistance(p1,p3));
        Assert.assertEquals(-1,graph.getDistance(p1,p4));
    }
}